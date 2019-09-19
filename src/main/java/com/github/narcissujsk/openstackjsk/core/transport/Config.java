/*******************************************************************************
 * 	Copyright 2019 ContainX and OpenStack4j
 *
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * 	use this file except in compliance with the License. You may obtain a copy of
 * 	the License at
 *
 * 	    http://www.apache.org/licenses/LICENSE-2.0
 *
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * 	License for the specific language governing permissions and limitations under
 * 	the License.
 *******************************************************************************/
package com.github.narcissujsk.openstackjsk.core.transport;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;

import com.github.narcissujsk.openstackjsk.api.identity.EndpointURLResolver;
import com.github.narcissujsk.openstackjsk.model.common.resolvers.ServiceVersionResolver;

/**
 * OpenStack4j Configuration - options that are configured with OpenStack4j clients.
 *
 * @author Jeremy Unruh
 */
public final class Config {

    public static final Config DEFAULT = new Config();

    private int connectTimeout;
    private int readTimeout;
    private SSLContext sslContext;
    private HostnameVerifier hostNameVerifier;
    private boolean ignoreSSLVerification;
    private String natHostOrIP;
    private int maxConnections;
    private int maxConnectionsPerRoute;
    private ProxyHost proxy;
    private ServiceVersionResolver resolver;
    private EndpointURLResolver endpointURLResolver;

    private boolean ironicApiVersionEnable;

    private String  ironicApiVersion;



    private boolean novaApiVersionEnable;

    private String  novaApiVersion;

    private Config() {
    }

    /**
     * @return A new client configuration
     */
    public static Config newConfig() {
        return new Config();
    }

    /**
     * Sets the Service version resolver to use in determining which API version to use with a particular OpenStack service
     *
     * @param resolver the version 2 version resolver
     * @return Config
     */
    public Config withResolver(ServiceVersionResolver resolver) {
        this.resolver = resolver;
        return this;
    }
    
    /**
     * Sets the Endpoint URL resolver for providing the URL resolution strategy
     *
     * @param endpointURLResolver the endpoint URL resolver
     * @return Config
     */
    public Config withEndpointURLResolver(EndpointURLResolver endpointURLResolver) {
    	this.endpointURLResolver = endpointURLResolver;
    	return this;
    }


    /**
     * Sets the connection timeout in milliseconds
     *
     * @param connectTimeout timeout in milliseconds
     * @return Config
     */
    public Config withConnectionTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
        return this;
    }

    /**
     * Sets the read timeout in milliseconds
     *
     * @param readTimeout timeout in milliseconds
     * @return Config
     */
    public Config withReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
        return this;
    }

    /**
     * Associates the <b>initialized</b> SSL Context to use when querying secure endpoints
     *
     * @param sslContext
     * @return Config
     */
    public Config withSSLContext(SSLContext sslContext) {
        this.sslContext = sslContext;
        return this;
    }

    /**
     * This sets the max allowed connections for connectors who are using a connection pool.  This option if set will be
     * a no-op to connectors that don't offer this setting.
     *
     * @param maxConnections the max connections allowed
     * @return Config
     */
    public Config withMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
        return this;
    }

    /**
     * This sets the max allowed connections per routefor connectors who are using a connection pool.  This option if set will be
     * a no-op to connectors that don't offer this setting.
     *
     * @param maxConnectionsPerRoute the max connections per route
     * @return Config
     */
    public Config withMaxConnectionsPerRoute(int maxConnectionsPerRoute) {
        this.maxConnectionsPerRoute = maxConnectionsPerRoute;
        return this;
    }

    /**
     * Indicates the connector should be using a Proxy host
     * <p>
     * (ex: ProxyHost.of("http://myproxy", 8080)) );
     *
     * @param proxy the proxy host
     * @return Config
     */
    public Config withProxy(ProxyHost proxy) {
        this.proxy = proxy;
        return this;
    }

    /**
     * If connecting to an OpenStack deployment is in front of a NAT or Proxy then this option can be provided to dynamically change
     * the service endpoints hostname/IP to the one NAT is using.
     * <p>
     * Example:<br>
     * Setting NAT IP to: 24.24.24.24<br>
     * <br>
     * Would be substitued in any endpoint for any service.  Let's assume we're looking for Heat endpoint
     * which is returning 192.168.0.2:8000<br>
     * <br>
     * The result would be translated dynamically to 24.24.24.24:8000 so we can access via NAT
     *
     * @param natHostOrIP the FQDN Host or IP Address
     * @return Config
     */
    public Config withEndpointNATResolution(String natHostOrIP) {
        this.natHostOrIP = natHostOrIP;
        return this;
    }

    /**
     * Sets the Hostname Verifier to use with SSL
     *
     * @param hostnameVerifier the hostname verifier
     * @return Config
     */
    public Config withHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.hostNameVerifier = hostnameVerifier;
        return this;
    }

    /**
     * If no SSL Context has been specified and this SSL Verification is disabled we will by pass certificate checks (useful for self signed certificates).
     *
     * NOTE: This property used to be known as "useNonStrictSSL" in previous releases
     *
     * @return Config
     */
    public Config withSSLVerificationDisabled() {
        this.ignoreSSLVerification = Boolean.TRUE;
        return this;
    }
    public Config withIronicApiVersionDisabled() {
        this.ironicApiVersionEnable = Boolean.FALSE;
        return this;
    }

    public Config withIronicApiVersion(String ironicApiVersion) {
        this.ironicApiVersion=ironicApiVersion;
        this.ironicApiVersionEnable = Boolean.TRUE;
        return this;
    }

    public Config withIronicApiVersion() {
        this.ironicApiVersion=ClientConstants.Ironic_API_Version;
        this.ironicApiVersionEnable = Boolean.TRUE;
        return this;
    }

    public Config withNovaApiVersion(String novaApiVersion) {
        this.novaApiVersion=novaApiVersion;
        this.novaApiVersionEnable = Boolean.TRUE;
        return this;
    }

    public Config withNovaApiVersion() {
        this.novaApiVersion=ClientConstants.Nova_API_Version;
        this.novaApiVersionEnable = Boolean.TRUE;
        return this;
    }

    public boolean isIronicApiVersionEnable() {
        return ironicApiVersionEnable;
    }

    public boolean isNovaApiVersionEnable() {
        return novaApiVersionEnable;
    }

    public void setIronicApiVersionEnable(boolean ironicApiVersionEnable) {
        this.ironicApiVersionEnable = ironicApiVersionEnable;
    }

    public String getIronicApiVersion() {
        return ironicApiVersion;
    }
    public void setNovaApiVersionEnable(boolean novaApiVersionEnable) {
        this.novaApiVersionEnable = novaApiVersionEnable;
    }

    public String getNovaApiVersion() {
        return novaApiVersion;
    }

    public void setNovaApiVersion(String novaApiVersion) {
        this.novaApiVersion = novaApiVersion;
    }
    public void setIronicApiVersion(String ironicApiVersion) {
        this.ironicApiVersion = ironicApiVersion;
    }

    public ServiceVersionResolver getResolver() {
        return resolver;
    }
    
    public ServiceVersionResolver getV2Resolver() {
        return resolver;
    }
    
    public EndpointURLResolver getEndpointURLResolver() {
    	return endpointURLResolver;
    }

    public int getConnectTimeout() {
        return connectTimeout;
    }

    public int getReadTimeout() {
        return readTimeout;
    }

    public SSLContext getSslContext() {
        return sslContext;
    }

    public HostnameVerifier getHostNameVerifier() {
        return hostNameVerifier;
    }

    public boolean isIgnoreSSLVerification() {
        return ignoreSSLVerification;
    }

    public String getEndpointNATResolution() {
        return natHostOrIP;
    }

    public boolean isBehindNAT() {
        return natHostOrIP != null;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public int getMaxConnectionsPerRoute() {
        return maxConnectionsPerRoute;
    }

    public ProxyHost getProxy() {
        return proxy;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + connectTimeout;
        result = prime * result + maxConnections;
        result = prime * result + maxConnectionsPerRoute;
        result = prime * result + (ignoreSSLVerification ? 1231 : 1237);
        result = prime * result + ((natHostOrIP == null) ? 0 : natHostOrIP.hashCode());
        result = prime * result + readTimeout;
        result = prime * result + ((proxy == null) ? 0 : proxy.hashCode());
        result = prime * result + ((sslContext == null) ? 0 : sslContext.hashCode());
        result = prime * result + ((hostNameVerifier == null) ? 0 : hostNameVerifier.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Config other = (Config) obj;
        if (connectTimeout != other.connectTimeout) {
            return false;
        }
        if (maxConnections != other.maxConnections) {
            return false;
        }
        if (maxConnectionsPerRoute != other.maxConnectionsPerRoute) {
            return false;
        }
        if (ignoreSSLVerification != other.ignoreSSLVerification) {
            return false;
        }
        if (natHostOrIP == null) {
            if (other.natHostOrIP != null) {
                return false;
            }
        } else if (!natHostOrIP.equals(other.natHostOrIP)) {
            return false;
        }
        if (readTimeout != other.readTimeout) {
            return false;
        }
        if (proxy == null) {
            if (other.proxy != null) {
                return false;
            }
        } else if (!proxy.equals(other.proxy)) {
            return false;
        }
        if(sslContext == null) {
        	if(other.getSslContext() != null) {
        		return false;
        	}
        } else if(!sslContext.equals(other.getSslContext())) {
        	return false;
        }
        if(hostNameVerifier == null) {
        	if(other.getHostNameVerifier() != null) {
        		return false;
        	}
        } else if(!hostNameVerifier.equals(other.getHostNameVerifier())) {
        	return false;
        }
        
        return true;
    }

}
