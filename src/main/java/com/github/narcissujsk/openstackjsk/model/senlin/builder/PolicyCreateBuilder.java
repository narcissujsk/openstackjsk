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
package com.github.narcissujsk.openstackjsk.model.senlin.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.senlin.PolicyCreate;

import java.util.Map;

/**
 * This interface describes a builder for {@link PolicyCreate} objects
 * 
 * @author lion
 */
public interface PolicyCreateBuilder extends Buildable.Builder<PolicyCreateBuilder, PolicyCreate> {

	/**
	 *  Add the name for the policy.
	 *
	 * @param name The name for the policy.
	 * @return PolicyCreateBuilder
	 */
	PolicyCreateBuilder name(String name);

	/**
	 *  Add a detailed specification based on the policy type.
	 *
	 * @param spec A detailed specification based on the policy type.
	 * @return PolicyCreateBuilder
	 */
	PolicyCreateBuilder spec(Map<String, Object> spec);

	/**
	 *  Add the properties of the spec.
	 *
	 * @param properties The properties of the spec.
	 * @return PolicyCreateBuilder
	 */
	PolicyCreateBuilder properties(Map<String, Object> properties);

	/**
	 *  Add the adjustment of the policy.
	 *
	 * @param adjustment The adjustment of the policy.
	 * @return PolicyCreateBuilder
	 */
	PolicyCreateBuilder adjustment(Map<String, String> adjustment);

	/**
	 *  Add the value of the min_step for policy.
	 *
	 * @param minStep The value of the min_step for policy.
	 * @return PolicyCreateBuilder
	 */
	PolicyCreateBuilder minStep(int minStep);

	/**
	 *  Add the number of the policy.
	 *
	 * @param number The number of the policy.
	 * @return PolicyCreateBuilder
	 */
	PolicyCreateBuilder number(int number);

	/**
	 *  Add the type of the adjustment for the policy.
	 *
	 * @param adjustmentType The type of the adjustment for the policy.
	 * @return PolicyCreateBuilder
	 */
	PolicyCreateBuilder adjustmentType(String adjustmentType);

	/**
	 *  Add the event of the properties for the policy.
	 *
	 * @param event The event of the properties for the policy.
	 * @return PolicyCreateBuilder
	 */
	PolicyCreateBuilder event(String event);

	/**
	 *  Add the type of the spec for the policy.
	 *
	 * @param specType The type of the spec for the policy.
	 * @return PolicyCreateBuilder
	 */
	PolicyCreateBuilder specType(String specType);

	/**
	 *  Add the version of the spec for the policy.
	 *
	 * @param version The version of the spec for the policy.
	 * @return PolicyCreateBuilder
	 */
	PolicyCreateBuilder version(String version);

}
