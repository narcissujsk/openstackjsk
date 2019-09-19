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
package com.github.narcissujsk.openstackjsk.model.identity.v3;

import java.net.URL;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.api.types.Facing;
import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.identity.v3.builder.EndpointBuilder;

/**
 * Endpoint model for identity v3.
 *
 * @see <a href="http://developer.openstack.org/api-ref-identity-v3.html#endpoints-v3">API reference</a>
 */
public interface Endpoint extends ModelEntity, Buildable<EndpointBuilder> {

    /**
     * Globally unique identifier.
     *
     * @return the Id of the endpoint
     */
    String getId();

    /**
     * @return the type of the endpoint
     */
    String getType();

    /**
     * @return the Description of the endpoint
     */
    String getDescription();

    /**
     * @return the Interface of the endpoint
     */
    Facing getIface();

    /**
     * @return the ServiceId of the endpoint
     */
    String getServiceId();

    /**
     * @return the Name of the endpoint
     */
    String getName();

    /**
     * @return the Region of the endpoint
     */
    String getRegion();

    /**
     * @return the region identifier of the endpoint
     */
    String getRegionId();

    /**
     * @return the URL of the endpoint
     */
    URL getUrl();

    /**
     * @return the Links of the endpoint
     */
    Map<String, String> getLinks();

    /**
     * @return true if the endpoint is enabled, otherwise false
     */
    boolean isEnabled();

}
