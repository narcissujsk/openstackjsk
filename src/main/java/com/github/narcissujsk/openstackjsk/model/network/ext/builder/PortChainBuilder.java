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

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.network.ext.PortChain;

/**
 *  A builder to create a port chain
 * @author Dmitry Gerenrot
 *
 */
public interface PortChainBuilder extends Builder<PortChainBuilder, PortChain> {

    /**
     * @param id : Port Chain identifer
     * @return PortChainBuilder
     */
    PortChainBuilder id(String id);

    /**
     * @param name : Human readable name for the port chain
     * @return PortChainBuilder
     */
    PortChainBuilder name(String name);

    /**
     * @return description : Human readable description for the port chain
     */
    PortChainBuilder description(String description);

    /**
     * @param projectId : project identifer
     * @return PortChainBuilder
     */
    PortChainBuilder projectId(String projectId);

    /**
     * @param chainId : identifier on openstack. It is not equal to {@link id}.
     * @return PortChainBuilder
     */
    PortChainBuilder chainId(String chainId);

    /**
     * @param flowClassifiers : list of ids
     * @return PortChainBuilder
     */
    PortChainBuilder flowClassifiers(List<String> flowClassifiers);

    /**
     * @param portPairGroups : list of ids
     * @return PortChainBuilder
     */
    PortChainBuilder portPairGroups(List<String> portPairGroups);

    /**
     * @param chainParameters : Map of chain parameters
     * @return PortChainBuilder
     */
    PortChainBuilder chainParameters(Map<String, String> chainParameters);
}
