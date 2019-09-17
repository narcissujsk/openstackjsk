package com.github.narcissujsk.openstackjsk.openstack.internal;

import static com.github.narcissujsk.openstackjsk.core.transport.HttpExceptionHandler.mapException;

import com.github.narcissujsk.openstackjsk.api.OSClient;
import com.github.narcissujsk.openstackjsk.api.OSClient.OSClientV2;
import com.github.narcissujsk.openstackjsk.api.OSClient.OSClientV3;
import com.github.narcissujsk.openstackjsk.api.client.CloudProvider;
import com.github.narcissujsk.openstackjsk.api.types.Facing;
import com.github.narcissujsk.openstackjsk.core.transport.*;
import com.github.narcissujsk.openstackjsk.core.transport.internal.HttpExecutor;
import com.github.narcissujsk.openstackjsk.model.identity.AuthStore;
import com.github.narcissujsk.openstackjsk.model.identity.AuthVersion;
import com.github.narcissujsk.openstackjsk.model.identity.v3.Authentication;
import com.github.narcissujsk.openstackjsk.model.identity.v3.Token;
import com.github.narcissujsk.openstackjsk.openstack.common.Auth;
import com.github.narcissujsk.openstackjsk.openstack.common.Auth.Type;
import com.github.narcissujsk.openstackjsk.openstack.identity.v2.domain.Credentials;
import com.github.narcissujsk.openstackjsk.openstack.identity.v2.domain.KeystoneAccess;
import com.github.narcissujsk.openstackjsk.openstack.identity.v2.domain.RaxApiKeyCredentials;
import com.github.narcissujsk.openstackjsk.openstack.identity.v3.domain.KeystoneAuth;
import com.github.narcissujsk.openstackjsk.openstack.identity.v3.domain.KeystoneToken;
import com.github.narcissujsk.openstackjsk.openstack.identity.v3.domain.TokenAuth;
import com.github.narcissujsk.openstackjsk.openstack.internal.OSClientSession.OSClientSessionV2;
import com.github.narcissujsk.openstackjsk.openstack.internal.OSClientSession.OSClientSessionV3;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Responsible for authenticating and re-authenticating sessions for V2 and V3
 * of the Identity API
 */
public class OSAuthenticator {
    org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger("HttpRequest");

    private static final String TOKEN_INDICATOR = "Tokens";
    private static final Logger LOG = LoggerFactory.getLogger(OSAuthenticator.class);

    /**
     * Invokes authentication to obtain a valid V3 Token, throws an
     * UnsupportedOperationException for an V2 attempt.
     *
     * @param auth the authentication credentials
     * @param endpoint the identity endpoint
     * @param perspective the network facing perspective
     * @param config the client configuration
     * @return the OSClient
     */
    @SuppressWarnings("rawtypes")
    public static OSClient invoke(AuthStore auth, String endpoint, Facing perspective, Config config,
            CloudProvider provider) {
        SessionInfo info = new SessionInfo(endpoint, perspective, false, provider);
        if (auth.getVersion().equals(AuthVersion.V2)) {
            return authenticateV2((com.github.narcissujsk.openstackjsk.openstack.identity.v2.domain.Auth) auth, info, config);
        }
        return authenticateV3((KeystoneAuth) auth, info, config);
    }

    /**
     * Invokes V3 authentication via an existing token
     * 
     * @param auth the token authentication
     * @param endpoint the identity endpoint
     * @param perspective the network facing perspective
     * @param config the client configuration
     * @return the OSClient
     */
    @SuppressWarnings("rawtypes")
    public static OSClient invoke(KeystoneAuth auth, String endpoint, Facing perspective, Config config,
            CloudProvider provider) {
        SessionInfo info = new SessionInfo(endpoint, perspective, false, provider);
        return authenticateV3(auth, info, config);
    }

    /**
     * Invokes V2 authentication via an existing token
     * 
     * @param auth the token authentication
     * @param endpoint the identity endpoint
     * @param perspective the network facing perspective
     * @param config the client configuration
     * @return the OSClient
     */
    @SuppressWarnings("rawtypes")
    public static OSClient invoke(com.github.narcissujsk.openstackjsk.openstack.identity.v2.domain.TokenAuth auth, String endpoint,
            Facing perspective, Config config, CloudProvider provider) {
        SessionInfo info = new SessionInfo(endpoint, perspective, false, provider);
        return authenticateV2(auth, info, config);
    }

    /**
     * Re-authenticates/renews the token for the current Session
     */
    @SuppressWarnings("rawtypes")
    public static void reAuthenticate() {

        LOG.debug("Re-Authenticating session due to expired Token or invalid response");

        OSClientSession session = OSClientSession.getCurrent();

        switch (session.getAuthVersion()) {
        case V2:
            KeystoneAccess access = ((OSClientSessionV2) session).getAccess().unwrap();
            SessionInfo info = new SessionInfo(access.getEndpoint(), session.getPerspective(), true,
                    session.getProvider());
            Auth auth = (Auth) ((access.isCredentialType()) ? access.getCredentials() : access.getTokenAuth());
            authenticateV2((com.github.narcissujsk.openstackjsk.openstack.identity.v2.domain.Auth) auth, info, session.getConfig());
            break;
        case V3:
        default:
            Token token = ((OSClientSessionV3) session).getToken();
            info = new SessionInfo(token.getEndpoint(), session.getPerspective(), true, session.getProvider());
            authenticateV3((KeystoneAuth) token.getCredentials(), info, session.getConfig());
            break;
        }
    }

    private static OSClientV2 authenticateV2(com.github.narcissujsk.openstackjsk.openstack.identity.v2.domain.Auth auth, SessionInfo info,
            Config config) {
        HttpRequest<KeystoneAccess> request = HttpRequest.builder(KeystoneAccess.class)
                .header(ClientConstants.HEADER_OS4J_AUTH, TOKEN_INDICATOR).endpoint(info.endpoint)
                .method(HttpMethod.POST).path("/tokens").config(config).entity(auth).build();

        HttpResponse response = HttpExecutor.create().execute(request);
        if (response.getStatus() >= 400) {
            try {
                throw mapException(response.getStatusMessage(), response.getStatus());
            } finally {
                HttpEntityHandler.closeQuietly(response);
            }
        }

        KeystoneAccess access = response.getEntity(KeystoneAccess.class);

        if (auth.getType() == Type.CREDENTIALS) {
            access = access.applyContext(info.endpoint, (Credentials) auth);
        } else if (auth.getType() == Type.RAX_APIKEY) {
            access = access.applyContext(info.endpoint, (RaxApiKeyCredentials) auth);
        } else {
            access = access.applyContext(info.endpoint, (com.github.narcissujsk.openstackjsk.openstack.identity.v2.domain.TokenAuth) auth);
        }

        if (!info.reLinkToExistingSession) {
            return OSClientSessionV2.createSession(access, info.perspective, info.provider, config);
        }

        OSClientSession.OSClientSessionV2 current = (OSClientSessionV2) OSClientSession.getCurrent();
        current.access = access;
        return current;
    }

    private static OSClientV3 authenticateV3(KeystoneAuth auth, SessionInfo info, Config config) {
        org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger("authenticateV3");
        logger.info("**********************   authenticateV3  *************************");
        if (auth.getType().equals(Type.TOKENLESS)){
            Map headers = new HashMap();
            Authentication.Scope.Project project = auth.getScope().getProject();
            if (project != null){
                if (!isEmpty(project.getId())) {
                    headers.put(ClientConstants.HEADER_X_PROJECT_ID, project.getId());
                }
                if (!isEmpty(project.getName())) {
                    headers.put(ClientConstants.HEADER_X_PROJECT_NAME, project.getName());
                }
                Authentication.Scope.Domain domain = project.getDomain();
                if (domain != null){
                    if (!isEmpty(domain.getId())) {
                        headers.put(ClientConstants.HEADER_X_PROJECT_DOMAIN_ID, domain.getId());
                    }
                    if (!isEmpty(domain.getName())) {
                        headers.put(ClientConstants.HEADER_X_PROJECT_DOMAIN_NAME, domain.getName());
                    }
                }
            }else{
                Authentication.Scope.Domain domain = auth.getScope().getDomain();
                if (domain != null){
                    if (!isEmpty(domain.getId())) {
                        headers.put(ClientConstants.HEADER_X_DOMAIN_ID, domain.getId());
                    }
                    if (!isEmpty(domain.getName())) {
                        headers.put(ClientConstants.HEADER_X_DOMAIN_NAME, domain.getName());
                    }
                }
            }
            KeystoneToken keystoneToken = new KeystoneToken();
            keystoneToken.setEndpoint(info.endpoint);
            if(config.isIronicApiVersionEnable()){
                headers.put(ClientConstants.HEADER_X_OpenStack_Ironic_API_Version, config.getIronicApiVersion());
            }
            logger.info(headers);
            return OSClientSessionV3.createSession(keystoneToken, null, null, config).headers(headers);
        }

        HttpRequest<KeystoneToken> request = HttpRequest.builder(KeystoneToken.class)
                .header(ClientConstants.HEADER_OS4J_AUTH, TOKEN_INDICATOR).endpoint(info.endpoint)
                .method(HttpMethod.POST).path("/auth/tokens").config(config).entity(auth).build();

        HttpResponse response = HttpExecutor.create().execute(request);

        if (response.getStatus() >= 400) {
            try {
                throw mapException(response.getStatusMessage(), response.getStatus());
            } finally {
                HttpEntityHandler.closeQuietly(response);
            }
        }
        KeystoneToken token = response.getEntity(KeystoneToken.class);
        token.setId(response.header(ClientConstants.HEADER_X_SUBJECT_TOKEN));

        if (auth.getType().equals(Type.CREDENTIALS)) {
            token = token.applyContext(info.endpoint, auth);
        } else {
            if (token.getProject() != null) {
                token = token.applyContext(info.endpoint, new TokenAuth(token.getId(),
                        auth.getScope().getProject().getName(), auth.getScope().getProject().getId()));

            } else if (token.getDomain() != null ) {
                token = token.applyContext(info.endpoint, new TokenAuth(token.getId(),
                        auth.getScope().getDomain().getName(), auth.getScope().getDomain().getId()));
            } else {
                token = token.applyContext(info.endpoint, new TokenAuth(token.getId(),null,null));
            }
        }

        String reqId = response.header(ClientConstants.X_OPENSTACK_REQUEST_ID);

        if (!info.reLinkToExistingSession) {
        	OSClientSessionV3 v3 = OSClientSessionV3.createSession(token, info.perspective, info.provider, config);
        	v3.reqId = reqId;
            return v3;
        }

        OSClientSessionV3 current = (OSClientSessionV3) OSClientSessionV3.getCurrent();
        current.token = token;
       
        current.reqId = reqId;
        return current;
    }

    private static class SessionInfo {
        String endpoint;
        Facing perspective;
        boolean reLinkToExistingSession;
        CloudProvider provider;

        SessionInfo(String endpoint, Facing perspective, boolean reLinkToExistingSession, CloudProvider provider) {
            this.endpoint = endpoint;
            this.perspective = perspective;
            this.reLinkToExistingSession = reLinkToExistingSession;
            this.provider = provider;
        }
    }

    private static boolean isEmpty(String str){
        if (str != null && str.length() > 0) {
            return false;
        }
        return true;
    }
}
