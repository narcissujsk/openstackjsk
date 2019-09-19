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

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.common.Resource;
import com.github.narcissujsk.openstackjsk.model.network.ext.builder.PortChainBuilder;

/**
 * A Port Chain Entity.
 *
 * @author Dmitry Gerenrot.
 *
 */
public interface PortChain extends Resource, Buildable<PortChainBuilder> {

    /**
     * @return description : Human readable description for the port chain
     */
    String getDescription();

    /**
     * @return chainId : an id on openstack.
     * It is not equal to {@link id}.
     */
    String getChainId();

    /**
     * @return flow classifiers : list of ids
     */
    List<String> getFlowClassifiers();

    /**
     * @return port pair groups : list of ids
     */
    List<String> getPortPairGroups();

    /**
     * @return Chain Parameters
     */
    Map<String, String> getChainParameters();
}
