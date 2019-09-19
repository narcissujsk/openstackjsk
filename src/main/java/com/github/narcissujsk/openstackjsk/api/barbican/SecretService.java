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
package com.github.narcissujsk.openstackjsk.api.barbican;

import com.github.narcissujsk.openstackjsk.model.barbican.Secret;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;

import java.util.List;
import java.util.Map;

/**
 * Created by reneschollmeyer on 02.08.17.
 *
 * Secret service provides CRUD capabilities for Secret(s).
 */
public interface SecretService {

    /**
     * Returns a list of secrets filtered by parameters.
     * @param filteringParams map (name, value) of filtering parameters
     * @return list of secrets filtered by filteringParameters
     */
    List<? extends Secret> list(final Map<String, String> filteringParams);

    /**
     * Get a list of currently existing {@link Secret}s.
     *
     * @return this list of {@link Secret}s.
     */
    List<? extends Secret> list(final String name);

    /**
     * Get a specified secret by its ID.
     * @param secretId
     * @return
     */
    Secret get(final String secretId);

    /**
     * Delete a specified secret by its ID.
     * @param secretId
     * @return
     */
    ActionResponse delete(final String secretId);

    /**
     * Create a secret.
     * @param secret
     * @return
     */
    Secret create(final Secret secret);
}