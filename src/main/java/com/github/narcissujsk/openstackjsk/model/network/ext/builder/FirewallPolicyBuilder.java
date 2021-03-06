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

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.network.ext.FirewallPolicy;

/**
 * A Builder to Create FirewallPolicy of FwaaS.
 * 
 * @author Vishvesh Deshmukh
 */
public interface FirewallPolicyBuilder extends Builder<FirewallPolicyBuilder, FirewallPolicy> {

	/**
	 * @param name : Human readable name for the FirewallPolicy (255 characters limit). Does not have to be unique.
	 * @return FirewallPolicyBuilder
	 */
	public FirewallPolicyBuilder name(String name);
	
	/**
	 * @param tenantId : Owner of the FirewallPolicy. Only an administrative user can
	 *         specify a tenant ID other than its own.
	 * @return FirewallPolicyBuilder
	 */
	public FirewallPolicyBuilder tenantId(String tenantId);

	/**
	 * @param description : Human readable description for the FirewallPolicy (1024 characters limit).
	 * @return FirewallPolicyBuilder
	 */
	public FirewallPolicyBuilder description(String description);

	/**
	 * @param shared : When set to True makes this FirewallPolicy visible to tenants other 
	 * 					 than its owner, and can be used in FirewallPolicy not owned by its tenant.
	 * @return FirewallPolicyBuilder
	 */
	public FirewallPolicyBuilder shared(Boolean shared);
	
	/**
	 * @param audited : When set to True by the policy owner indicates that the firewall policy has been audited. 
			 * This attribute is meant to aid in the firewall policy audit workflows. 
			 * Each time the firewall policy or the associated firewall rules are changed, 
			 * this attribute will be set to False and will have to be explicitly set 
			 * to True through an update operation.
	 * @return FirewallPolicyBuilder
	 */
	public FirewallPolicyBuilder audited(Boolean audited);
	
	/**
	 * @param firewallRules(UUID)List : This is an ordered list of firewall rule uuids. 
	 	* The firewall applies the rules in the order in which they appear in this list.
	 * @return FirewallPolicyBuilder
	 */
	public FirewallPolicyBuilder firewallRules(List<String> ruleIdList);
}
