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
import com.github.narcissujsk.openstackjsk.model.network.ext.PortPair;

/**
 *
 * Service Port Pair Service
 *
 * @author Dmitry Gerenrot
 *
 */
public interface PortPairService {

    /**
     * Lists Port Pairs for port chains
     *
     * @return the list of Port Pairs
     */
    List<? extends PortPair> list();


    /**
     * Get a Port Pair by id.
     * @param portPairId
     * @return PortPair
     */
    PortPair get(String portPairId);

    /**
     * Update a Port Pair with the given id to match the given update object
     *
     * @param portPairId
     * @param portPair
     * @return PortPair
     */
    PortPair update(String portPairId, PortPair portPair);

    /**
     * Create a Port Pair
     *
     * @param portPair
     * @return PortPair : object actually created
     */
    PortPair create(PortPair portPair);

    /**
     * Delete a Port Pair
     *
     * @param portPairId
     * @return the action response
     */
    ActionResponse delete(String portPairId);
}
