package com.github.narcissujsk.openstackjsk.openstack.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.EndpointTokenProvider;
import com.github.narcissujsk.openstackjsk.api.OSClient;
import com.github.narcissujsk.openstackjsk.api.OSClient.OSClientV2;
import com.github.narcissujsk.openstackjsk.api.OSClient.OSClientV3;
import com.github.narcissujsk.openstackjsk.api.artifact.ArtifactService;
import com.github.narcissujsk.openstackjsk.api.barbican.BarbicanService;
import com.github.narcissujsk.openstackjsk.api.baremetal.BaremetalService;
import com.github.narcissujsk.openstackjsk.api.client.CloudProvider;
import com.github.narcissujsk.openstackjsk.api.compute.ComputeService;
import com.github.narcissujsk.openstackjsk.api.dns.v2.DNSService;
import com.github.narcissujsk.openstackjsk.api.gbp.GbpService;
import com.github.narcissujsk.openstackjsk.api.heat.HeatService;
import com.github.narcissujsk.openstackjsk.api.identity.EndpointURLResolver;
import com.github.narcissujsk.openstackjsk.api.image.ImageService;
import com.github.narcissujsk.openstackjsk.api.magnum.MagnumService;
import com.github.narcissujsk.openstackjsk.api.manila.ShareService;
import com.github.narcissujsk.openstackjsk.api.murano.v1.AppCatalogService;
import com.github.narcissujsk.openstackjsk.api.networking.NetworkingService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.ServiceFunctionChainService;
import com.github.narcissujsk.openstackjsk.api.octavia.OctaviaService;
import com.github.narcissujsk.openstackjsk.api.sahara.SaharaService;
import com.github.narcissujsk.openstackjsk.api.senlin.SenlinService;
import com.github.narcissujsk.openstackjsk.api.storage.BlockStorageService;
import com.github.narcissujsk.openstackjsk.api.storage.ObjectStorageService;
import com.github.narcissujsk.openstackjsk.api.tacker.TackerService;
import com.github.narcissujsk.openstackjsk.api.telemetry.TelemetryAodhService;
import com.github.narcissujsk.openstackjsk.api.telemetry.TelemetryService;
import com.github.narcissujsk.openstackjsk.api.trove.TroveService;
import com.github.narcissujsk.openstackjsk.api.types.Facing;
import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.api.workflow.WorkflowService;
import com.github.narcissujsk.openstackjsk.core.transport.Config;
import com.github.narcissujsk.openstackjsk.model.identity.AuthVersion;
import com.github.narcissujsk.openstackjsk.model.identity.URLResolverParams;
import com.github.narcissujsk.openstackjsk.model.identity.v2.Access;
import com.github.narcissujsk.openstackjsk.model.identity.v3.Token;
import com.github.narcissujsk.openstackjsk.openstack.identity.internal.DefaultEndpointURLResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.Set;

/**
 * A client which has been identified. Any calls spawned from this session will
 * automatically utilize the original authentication that was successfully
 * validated and authorized
 *
 * @author Jeremy Unruh
 */
public abstract class OSClientSession<R, T extends OSClient<T>> implements EndpointTokenProvider {
    
    private static final Logger LOG = LoggerFactory.getLogger(OSClientSession.class);    
    @SuppressWarnings("rawtypes")
    private static final ThreadLocal<OSClientSession> sessions = new ThreadLocal<OSClientSession>();

    Config config;
    Facing perspective;
    String region;
    Set<ServiceType> supports;
    CloudProvider provider;
    Map<String, ? extends Object> headers;
    EndpointURLResolver fallbackEndpointUrlResolver = new DefaultEndpointURLResolver();

    @SuppressWarnings("rawtypes")
    public static OSClientSession getCurrent() {
        return sessions.get();
    }

    @SuppressWarnings("unchecked")
    @VisibleForTesting
    public R useConfig(Config config) {
        this.config = config;
        return (R) this;
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public T useRegion(String region) {
        this.region = region;
        return (T) this;
    }

    /**
     * {@inheritDoc}
     */
    public T removeRegion() {
        return useRegion(null);
    }

    /**
     * @return the current perspective
     */
    public Facing getPerspective() {
        return perspective;
    }

    /**
     * @return the original client configuration associated with this session
     */
    public Config getConfig() {
        return config;
    }

    /**
     * {@inheritDoc}
     */
    public ComputeService compute() {
        return Apis.getComputeServices();
    }

    public BaremetalService baremetal() {
        return Apis.getBaremetalServices();
    }

    /**
     * {@inheritDoc}
     */
    public NetworkingService networking() {
        return Apis.getNetworkingServices();
    }

    /**
     * {@inheritDoc}
     */
    public ServiceFunctionChainService sfc() {
        return Apis.getSfcServices();
    }

    /**
     * {@inheritDoc}
     */
    public OctaviaService octavia() {
        return Apis.getOctaviaService();
    }

    /**
     * {@inheritDoc}
     */
    public ArtifactService artifact() {
        return Apis.getArtifactServices();
    }
    
    /**
     * {@inheritDoc}
     */
    public TackerService tacker() {
        return Apis.getTackerServices();
    }

    /**
     * {@inheritDoc}
     */
    public ImageService images() {
        return Apis.getImageService();
    }

    public com.github.narcissujsk.openstackjsk.api.image.v2.ImageService imagesV2() {
        return Apis.getImageV2Service();
    }

    /**
     * {@inheritDoc}
     */
    public BlockStorageService blockStorage() {
        return Apis.get(BlockStorageService.class);
    }

    /**
     * {@inheritDoc}
     */
    public TelemetryService telemetry() {
        return Apis.get(TelemetryService.class);
    }

    /**
     * {@inheritDoc}
     */
    public ShareService share() {
        return Apis.get(ShareService.class);
    }

    /**
     * {@inheritDoc}
     */
    public HeatService heat() {
        return Apis.getHeatServices();
    }

    /**
     * {@inheritDoc}
     */
    public AppCatalogService murano() {
        return Apis.getMuranoServices();
    }

    /**
     * {@inheritDoc}
     */
    public MagnumService magnum() {
    	return Apis.getMagnumService();
    }

    /**
     * {@inheritDoc}
     */
    public SenlinService senlin() {
        return Apis.getSenlinServices();
    }

    /**
     * {@inheritDoc}
     */
    public ObjectStorageService objectStorage() {
        return Apis.get(ObjectStorageService.class);
    }

    /**
     * {@inheritDoc}
     */
    public SaharaService sahara() {
        return Apis.getSaharaServices();
    }

    /**
     * {@inheritDoc}
     */
    public WorkflowService workflow() {
        return Apis.getWorkflowServices();
    }

    /**
     * {@inheritDoc}
     */
    public BarbicanService barbican() {
        return Apis.getBarbicanServices();
    }

    /**
     * {@inheritDoc}
     */
    public DNSService dns() {return Apis.getDNSService(); }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public T perspective(Facing perspective) {
        this.perspective = perspective;
        return (T) this;
    }

    public CloudProvider getProvider() {
        return (provider == null) ? CloudProvider.UNKNOWN : provider;
    }

    /**
     * {@inheritDoc}
     */
    public T headers(Map<String, ? extends Object> headers) {
        this.headers = headers;
        return (T) this;
    }

    public Map<String, ? extends Object> getHeaders(){
        return this.headers;
    }

    /**
     * {@inheritDoc}
     */
    public boolean supportsCompute() {
        return getSupportedServices().contains(ServiceType.COMPUTE);
    }

    /**
     * {@inheritDoc}
     */
    public boolean supportsIdentity() {
        return getSupportedServices().contains(ServiceType.IDENTITY);
    }

    /**
     * {@inheritDoc}
     */
    public boolean supportsNetwork() {
        return getSupportedServices().contains(ServiceType.NETWORK);
    }

    /**
     * {@inheritDoc}
     */
    public boolean supportsImage() {
        return getSupportedServices().contains(ServiceType.IMAGE);
    }

    /**
     * {@inheritDoc}
     */
    public boolean supportsHeat() {
        return getSupportedServices().contains(ServiceType.ORCHESTRATION);
    }

    /**
     * {@inheritDoc}
     */
    public boolean supportsMurano() {
        return getSupportedServices().contains(ServiceType.APP_CATALOG);
    }

    /**
     * {@inheritDoc}
     */
    public boolean supportsBlockStorage() {
        return getSupportedServices().contains(ServiceType.BLOCK_STORAGE);
    }

    /**
     * {@inheritDoc}
     */
    public boolean supportsObjectStorage() {
        return getSupportedServices().contains(ServiceType.OBJECT_STORAGE);
    }

    /**
     * {@inheritDoc}
     */
    public boolean supportsTelemetry() {
        return getSupportedServices().contains(ServiceType.TELEMETRY);
    }

    /**
     * {@inheritDoc}
     */
    public boolean supportsTelemetry_aodh() {
        return getSupportedServices().contains(ServiceType.TELEMETRY_AODH);
    }

    /**
     * {@inheritDoc}
     */
    public boolean supportsShare() {
        return getSupportedServices().contains(ServiceType.SHARE);
    }

    /**
     * {@inheritDoc}
     */
    public boolean supportsTrove() { return getSupportedServices().contains(ServiceType.DATABASE); }

    /**
     * {@inheritDoc}
     */
    public boolean supportsDNS() { return getSupportedServices().contains(ServiceType.DNS); }

    public Set<ServiceType> getSupportedServices() {
        return null;
    }
    
    public AuthVersion getAuthVersion() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public GbpService gbp() {
        return Apis.getGbpServices();
    }

    /**
     *
     * @return
     */
    public TroveService trove(){
        return Apis.getTroveServices();
    }
        
    public static class OSClientSessionV2 extends OSClientSession<OSClientSessionV2, OSClientV2> implements OSClientV2 {

        Access access;

        private OSClientSessionV2(Access access, String endpoint, Facing perspective, CloudProvider provider, Config config) {
            this.access = access;
            this.config = config;
            this.perspective = perspective;
            this.provider = provider;
            sessions.set(this);
        }

        private OSClientSessionV2(Access access, OSClientSessionV2 parent, String region) {
            this.access = parent.access;
            this.perspective = parent.perspective;
            this.region = region;
        }

        public static OSClientSessionV2 createSession(Access access) {
            return new OSClientSessionV2(access, access.getEndpoint(), null, null, null);
        }

        public static OSClientSessionV2 createSession(Access access, Facing perspective, CloudProvider provider, Config config) {
            return new OSClientSessionV2(access, access.getEndpoint(), perspective, provider, config);
        }

        @Override
        public Access getAccess() {
            return access;
        }

        @Override
        public String getEndpoint() {
            return access.getEndpoint();
        }
        
        @Override
        public AuthVersion getAuthVersion() {
            return AuthVersion.V2;
        }

        private String addNATIfApplicable(String url) {
            if (config != null && config.isBehindNAT()) {
                try {
                    URI uri = new URI(url);
                    return url.replace(uri.getHost(), config.getEndpointNATResolution());
                } catch (URISyntaxException e) {
                    LOG.error(e.getMessage(), e);
                }
            }
            return url;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public String getEndpoint(ServiceType service) {
        	
        	final EndpointURLResolver eUrlResolver = (config != null && config.getEndpointURLResolver() != null) ? config.getEndpointURLResolver() : fallbackEndpointUrlResolver;
        	
            return addNATIfApplicable(eUrlResolver.findURLV2(URLResolverParams
                    .create(access, service)
                    .resolver(config != null ? config.getV2Resolver() : null)
                    .perspective(perspective)
                    .region(region)));
        }

        @Override
        public String getTokenId() {
            return access.getToken().getId();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public com.github.narcissujsk.openstackjsk.api.identity.v2.IdentityService identity() {
            return Apis.getIdentityV2Services();
        }

        @Override
        public Set<ServiceType> getSupportedServices() {
            if (supports == null) {
                supports = Sets.immutableEnumSet(Iterables.transform(access.getServiceCatalog(),
                        new com.github.narcissujsk.openstackjsk.openstack.identity.v2.functions.ServiceToServiceType()));
            }
            return supports;
        }

    }

    public static class OSClientSessionV3 extends OSClientSession<OSClientSessionV3, OSClientV3> implements OSClientV3 {
        Token token;
        
        protected String reqId;

        private OSClientSessionV3(Token token, String endpoint, Facing perspective, CloudProvider provider, Config config) {
            this.token = token;
            this.config = config;
            this.perspective = perspective;
            this.provider = provider;
            sessions.set(this);
        }

        private OSClientSessionV3(Token token, OSClientSessionV3 parent, String region) {
            this.token = parent.token;
            this.perspective = parent.perspective;
            this.region = region;
        }

        public static OSClientSessionV3 createSession(Token token) {
            return new OSClientSessionV3(token, token.getEndpoint(), null, null, null);
        }

        public static OSClientSessionV3 createSession(Token token, Facing perspective, CloudProvider provider, Config config) {
            return new OSClientSessionV3(token, token.getEndpoint(), perspective, provider, config);
        }
        
        public String getXOpenstackRequestId() {
        	return reqId;
        }

        @Override
        public Token getToken() {
            return token;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public String getEndpoint() {
            return token.getEndpoint();
        }
        
        @Override
        public AuthVersion getAuthVersion() {
            return AuthVersion.V3;
        }

        private String addNATIfApplicable(String url) {
            if (config != null && config.isBehindNAT()) {
                try {
                    URI uri = new URI(url);
                    return url.replace(uri.getHost(), config.getEndpointNATResolution());
                } catch (URISyntaxException e) {
                    LoggerFactory.getLogger(OSClientSessionV3.class).error(e.getMessage(), e);
                }
            }
            return url;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public String getEndpoint(ServiceType service) {
        	final EndpointURLResolver eUrlResolver = (config != null && config.getEndpointURLResolver() != null) ? config.getEndpointURLResolver() : fallbackEndpointUrlResolver;
            String urlv3 = eUrlResolver.findURLV3(URLResolverParams
                    .create(token, service)
                    .resolver(config != null ? config.getResolver() : null)
                    .perspective(perspective)
                    .region(region));
            String endpoint = addNATIfApplicable(urlv3);
            return endpoint;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public String getTokenId() {
            return token.getId();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public com.github.narcissujsk.openstackjsk.api.identity.v3.IdentityService identity() {
            return Apis.getIdentityV3Services();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public Set<ServiceType> getSupportedServices() {
            if (supports == null) {
                supports = Sets.immutableEnumSet(Iterables.transform(token.getCatalog(),
                        new com.github.narcissujsk.openstackjsk.openstack.identity.v3.functions.ServiceToServiceType()));
            }
            return supports;
        }

        @Override
        public TelemetryService telemetry() {
            return Apis.get(TelemetryAodhService.class);
        }

    }


    
}
