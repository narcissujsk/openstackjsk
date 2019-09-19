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
package com.github.narcissujsk.openstackjsk.openstack;

import com.github.narcissujsk.openstackjsk.api.OSClient.OSClientV2;
import com.github.narcissujsk.openstackjsk.api.OSClient.OSClientV3;
import com.github.narcissujsk.openstackjsk.api.client.CloudProvider;
import com.github.narcissujsk.openstackjsk.api.client.IOSClientBuilder;
import com.github.narcissujsk.openstackjsk.api.types.Facing;
import com.github.narcissujsk.openstackjsk.core.transport.Config;
import com.github.narcissujsk.openstackjsk.core.transport.internal.HttpLoggingFilter;
import com.github.narcissujsk.openstackjsk.model.identity.v2.Access;
import com.github.narcissujsk.openstackjsk.model.identity.v3.Token;
import com.github.narcissujsk.openstackjsk.openstack.client.OSClientBuilder;
import com.github.narcissujsk.openstackjsk.openstack.internal.OSClientSession.OSClientSessionV2;
import com.github.narcissujsk.openstackjsk.openstack.internal.OSClientSession.OSClientSessionV3;

/**
 * A Factory which sets up the APIs to be used a previously non-expired authorization or new authorization.
 *
 * @author Jeremy Unruh
 */
public abstract class OSFactory<T extends OSFactory<T>> {

    private OSFactory() { }

    /**
     * Skips Authentication and created the API around a previously cached Token object.  This can be useful in multi-threaded environments
     * or scenarios where a client should not be re-authenticated due to a token lasting 24 hours.
     *
     * @param token an authorized token entity which is to be used to create the API
     * @return the OSClient
     */
    public static OSClientV3 clientFromToken(Token token) {
        return OSClientSessionV3.createSession(token);
    }

    /**
     * Skips Authentication and created the API around a previously cached Token object.  This can be useful in multi-threaded environments
     * or scenarios where a client should not be re-authenticated due to a token lasting 24 hours
     *
     * @param token an authorized token entity which is to be used to create the API
     * @param perspective the current endpoint perspective to use
     * @return the OSClient
     */
    public static OSClientV3 clientFromToken(Token token, Facing perspective) {
        return OSClientSessionV3.createSession(token, perspective, null, null);
    }

    /**
     * Skips Authentication and created the API around a previously cached Token object.  This can be useful in multi-threaded environments
     * or scenarios where a client should not be re-authenticated due to a token lasting 24 hours
     *
     * @param token an authorized token entity which is to be used to create the API
     * @param config OpenStack4j configuration options
     * @return the OSClient
     */
    public static OSClientV3 clientFromToken(Token token, Config config) {
        return OSClientSessionV3.createSession(token, null, null, config);
    }

    /**
     * Skips Authentication and created the API around a previously cached Token object.  This can be useful in multi-threaded environments
     * or scenarios where a client should not be re-authenticated due to a token lasting 24 hours
     *
     * @param token an authorized token entity which is to be used to create the API
     * @param perspective the current endpoint perspective to use
     * @param config OpenStack4j configuration options
     * @return the OSClient
     */
    public static OSClientV3 clientFromToken(Token token, Facing perspective, Config config) {
        return OSClientSessionV3.createSession(token, perspective, null, config);
    }

    /**
     * Skips Authentication and created the API around a previously cached Token object.  This can be useful in multi-threaded environments
     * or scenarios where a client should not be re-authenticated due to a token lasting 24 hours
     *
     * @param token an authorized token entity which is to be used to create the API
     * @param perspective the current endpoint perspective to use
     * @param provider the cloud provider
     * @param config OpenStack4j configuration options
     * @return the OSClient
     */
    public static OSClientV3 clientFromToken(Token token, Facing perspective, CloudProvider provider, Config config) {
        return OSClientSessionV3.createSession(token, perspective, provider, config);
    }
    
    /**
     * Skips Authentication and created the API around a previously cached Access object.  This can be useful in multi-threaded environments
     * or scenarios where a client should not be re-authenticated due to a token lasting 24 hours
     * 
     * @param access an authorized access entity which is to be used to create the API
     * @return the OSCLient
     */
    public static OSClientV2 clientFromAccess(Access access) {
        return OSClientSessionV2.createSession(access);
    }
    
    /**
     * Skips Authentication and created the API around a previously cached Access object.  This can be useful in multi-threaded environments
     * or scenarios where a client should not be re-authenticated due to a token lasting 24 hours
     * 
     * @param access an authorized access entity which is to be used to create the API
     * @param perspective the current endpoint perspective to use
     * @return the OSCLient
     */
    public static OSClientV2 clientFromAccess(Access access, Facing perspective) {
        return OSClientSessionV2.createSession(access, perspective, null, null);
    }
    
    /**
     * Skips Authentication and created the API around a previously cached Access object.  This can be useful in multi-threaded environments
     * or scenarios where a client should not be re-authenticated due to a token lasting 24 hours
     * 
     * @param access an authorized access entity which is to be used to create the API
     * @param config OpenStack4j configuration options
     * @return the OSCLient
     */
    public static OSClientV2 clientFromAccess(Access access, Config config) {
        return OSClientSessionV2.createSession(access, null, null, config);
    }
    
    /**
     * Skips Authentication and created the API around a previously cached Access object.  This can be useful in multi-threaded environments
     * or scenarios where a client should not be re-authenticated due to a token lasting 24 hours
     * 
     * @param access an authorized access entity which is to be used to create the API
     * @param perspective the current endpoint perspective to use
     * @param config OpenStack4j configuration options
     * @return the OSCLient
     */
    public static OSClientV2 clientFromAccess(Access access, Facing perspective, Config config) {
        return OSClientSessionV2.createSession(access, perspective, null, config);
    }
    
    /**
     * Skips Authentication and created the API around a previously cached Access object.  This can be useful in multi-threaded environments
     * or scenarios where a client should not be re-authenticated due to a token lasting 24 hours
     * 
     * @param access an authorized access entity which is to be used to create the API
     * @param perspective the current endpoint perspective to use
     * @param provider the cloud provider
     * @param config OpenStack4j configuration options
     * @return the OSCLient
     */
    public static OSClientV2 clientFromAccess(Access access, Facing perspective, CloudProvider provider, Config config) {
        return OSClientSessionV2.createSession(access, perspective, provider, config);
    }

    /**
     * Globally enables or disables verbose HTTP Request and Response logging useful for debugging
     * @param enabled true to enable, false to enable
     */
    public static void enableHttpLoggingFilter(boolean enabled) {
        System.getProperties().setProperty(HttpLoggingFilter.class.getName(), String.valueOf(enabled));
    }

    /**
     * Creates builder for OpenStack V2 based authentication
     * @return V2 Authentication builder
     */
    public static IOSClientBuilder.V2 builderV2() {
        return new OSClientBuilder.ClientV2();
    }
    
       /**
     * Creates builder for OpenStack V3 based authentication
     * @return V3 Authentication builder
     */
    public static IOSClientBuilder.V3 builderV3() {
        return new OSClientBuilder.ClientV3();
    }
}