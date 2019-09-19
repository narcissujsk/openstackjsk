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
package com.github.narcissujsk.openstackjsk.model.network.ext.builder;

import java.util.Map;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.network.ext.PortPair;

/**
 *  A builder to create a port pair
 * @author Dmitry Gerenrot
 *
 */
public interface PortPairBuilder  extends Builder<PortPairBuilder, PortPair> {

    /**
     * @param id : Port Pair identifer
     * @return PortPairBuilder
     */
    PortPairBuilder id(String id);

    /**
     * @param name : Human readable name for the port pair
     * @return PortPairBuilder
     */
    PortPairBuilder name(String name);

    /**
     * @param tenantId : Tenant (project) identifier
     * @return PortPairBuilder
     */
    PortPairBuilder projectId(String projectId);

    /**
     * @param description : Human readable description
     * @return PortPairBuilder
     */
    PortPairBuilder description(String description);

    /**
     * @param egressId : id for the egress port
     * @return PortPairBuilder
     */
    PortPairBuilder egressId(String egressId);

    /**
     * @param ingressId : id for the ingress port
     * @return PortPairBuilder
     */
    PortPairBuilder ingressId(String ingressId);

    /**
     * @param serviceFunctionParameters : Map of service function parameters
     * @return PortPairBuilder
     */
    PortPairBuilder serviceFunctionParameters(Map<String, String> serviceFunctionParameters);
}
