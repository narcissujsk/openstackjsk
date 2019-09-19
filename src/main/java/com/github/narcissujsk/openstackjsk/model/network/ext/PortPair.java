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
package com.github.narcissujsk.openstackjsk.model.network.ext;

import java.util.Map;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.common.Resource;
import com.github.narcissujsk.openstackjsk.model.network.ext.builder.PortPairBuilder;

/**
 * A Port Pair Entity.
 *
 * @author Dmitry Gerenrot.
 *
 */
public interface PortPair extends Resource, Buildable<PortPairBuilder> {

    /**
     * @return id : Port Pair  identifer
     */
    String getId();

    /**
     * @return name : Human readable name for the port pair
     */
    String getName();

    /**
     * @return description : Human readable description for the port pair
     */
    String getDescription();

    /**
     * @return egressId : Id for the egress port
     */
    String getEgressId();

    /**
     * @return ingressId : Id for the ingress port
     */
    String getIngressId();

    /**
     * @return Service Function Parameters
     */
    Map<String, String> getServiceFunctionParameters();
}

