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
package com.github.narcissujsk.openstackjsk.api.gbp;

import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.gbp.NetworkServicePolicy;

import java.util.List;
import java.util.Map;

/**
 * This interface defines all methods for the manipulation of network service
 * 
 * @author vinod borole
 * 
 */
public interface NetworkPolicyService {

    /**
     * List all gbp network service policies
     * @return
     */
    List<? extends NetworkServicePolicy> list();

    /**
     * Returns list of service policy filtered by parameters.
     *
     * @param filteringParams map (name, value) of filtering parameters
     * @return
     */
    List<? extends NetworkServicePolicy> list(Map<String, String> filteringParams);

    /**
     * Get a gbp network service policy specified by id
     * @param id
     * @return
     */
    NetworkServicePolicy get(String id);

    /**
     * Create a gbp network service policy
     * @param networkServicePolicy
     * @return
     */
    NetworkServicePolicy create(NetworkServicePolicy networkServicePolicy);

    /**
     * Delete a gbp network service policy specified by id
     * @param id
     * @return
     */
    ActionResponse delete(String id);

    /**
     * Update the gbp network service policy specified by id
     * @param gbpServicePolicyId
     * @param gbpServicePolicy
     * @return
     */
    NetworkServicePolicy update(String gbpServicePolicyId, NetworkServicePolicy gbpServicePolicy);

}
