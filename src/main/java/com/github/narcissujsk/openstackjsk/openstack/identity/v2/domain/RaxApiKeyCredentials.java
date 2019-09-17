package com.github.narcissujsk.openstackjsk.openstack.identity.v2.domain;

import com.github.narcissujsk.openstackjsk.model.identity.AuthStore;
import com.github.narcissujsk.openstackjsk.model.identity.AuthVersion;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("auth")
public class RaxApiKeyCredentials extends Auth implements AuthStore {

    private static final long serialVersionUID = 1L;

    @JsonProperty("RAX-KSKEY:apiKeyCredentials")
    private ApiKeyCredentials apikeyCreds = new ApiKeyCredentials();


    public RaxApiKeyCredentials() {
        super(Type.RAX_APIKEY);
    }

    public RaxApiKeyCredentials(String username, String apiKey) {
        this();
        apikeyCreds.setCredentials(username, apiKey);
    }

    @Override
    @JsonIgnore
	public String getTenantId() {
        return super.getTenantId();
	}

    @Override
    @JsonIgnore
	public String getTenantName() {
        return super.getTenantName();
	}

    @JsonIgnore
    public String getUsername() {
        return apikeyCreds.username;
    }

    @JsonIgnore
    @Override
    public String getPassword() {
        return getApiKey();
    }

    @JsonIgnore
    public String getApiKey() {
        return apikeyCreds.apiKey;
    }

    @JsonIgnore
    @Override
    public String getId() {
        return getTenantId();
    }

    @JsonIgnore
    @Override
    public String getName() {
        return getTenantName();
    }

    private static final class ApiKeyCredentials {

        @JsonProperty
        String username;
        @JsonProperty
        String apiKey;

        public void setCredentials(String username, String apiKey) {
            this.username = username;
            this.apiKey = apiKey;
        }
    }


    @JsonIgnore
    @Override
    public AuthVersion getVersion() {
        return AuthVersion.V2;
    }
}
