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

import java.util.Map;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.identity.v3.builder.PolicyBuilder;

/**
 * policy model class
 *
 * @see <a href="http://developer.openstack.org/api-ref-identity-v3.html#policies-v3">API reference</a>
 */
public interface Policy extends ModelEntity, Buildable<PolicyBuilder> {

    /**
     * the unique identifier
     *
     * @return the id of the policy
     */
    String getId();

    /**
     * @return the uuid for the associated project
     */
    String getProjectId();

    /**
     * @return the id of the user who owns the policy
     */
    String getUserId();

    /**
     * @return the type of the policy
     */
    String getType();

    /**
     * @return the BLOB of the policy
     */
    String getBlob();

    /**
     * @return the links of the policy
     */
    Map<String, String> getLinks();

}
