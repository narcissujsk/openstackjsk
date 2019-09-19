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
package com.github.narcissujsk.openstackjsk.api.networking.ext;

import java.util.List;

import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.network.ext.PortPairGroup;

/**
 * Port Pair Group Service
 *
 * @author Dmitry Gerenrot
 *
 */
public interface PortPairGroupService {

    /**
     * Lists port pair groups for port chains
     *
     * @return the list of port pair groups
     */
    List<? extends PortPairGroup> list();

    /**
     * Get a port pair group by id.
     * @param id
     * @return PortPairGroup
     */
    PortPairGroup get(String id);

    /**
     * Update a port pair group with the given id to match the given update object
     *
     * @param id
     * @param portPairGroup
     * @return PortPairGroup
     */
    PortPairGroup update(String portPairGroupId, PortPairGroup portPairGroup);

    /**
     * Create a port pair group
     *
     * @param portPairGroup
     * @return portPairGroup : object actually created
     */
    PortPairGroup create(PortPairGroup portPairGroup);

    /**
     * Delete a port pair group
     *
     * @param portPairGroupId
     * @return the action response
     */
    ActionResponse delete(String portPairGroupId);
}
