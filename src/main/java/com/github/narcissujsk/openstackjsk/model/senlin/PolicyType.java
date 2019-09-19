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
package com.github.narcissujsk.openstackjsk.model.senlin;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

import java.util.Map;

/**
 * This interface describes the getter-methods (and thus components) of a PolicyType.
 * All getters map to the possible return values of
 * <code> GET /v1/policy-types/​{policy_type}​</code>
 * 
 * @see http://developer.openstack.org/api-ref-clustering-v1.html
 * 
 * @author lion
 * 
 */
public interface PolicyType extends ModelEntity {

	/**
	 * Returns the name of the PolicyType
	 * 
	 * @return the name of the PolicyType
	 */
	String getName();

	/**
	 * Returns the schema of the PolicyType
	 *
	 * @return the schema of the PolicyType
	 */
	Map<String, Object> getSchema();
}
