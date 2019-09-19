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
package com.github.narcissujsk.openstackjsk.openstack.networking.internal.ext;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.api.networking.ext.FirewallRuleService;
import com.github.narcissujsk.openstackjsk.core.transport.ExecutionOptions;
import com.github.narcissujsk.openstackjsk.core.transport.propagation.PropagateOnStatus;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.network.ext.FirewallRule;
import com.github.narcissujsk.openstackjsk.model.network.ext.FirewallRuleUpdate;
import com.github.narcissujsk.openstackjsk.openstack.compute.functions.ToActionResponseFunction;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.ext.NeutronFirewallRule;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.ext.NeutronFirewallRule.FirewallRules;
import com.github.narcissujsk.openstackjsk.openstack.networking.internal.BaseNetworkingServices;

/**
 * Networking (Neutron) FwaaS FirewallRule Rule Extension API
 * 
 * @author Vishvesh Deshmukh
 */
public class FirewallRuleServiceImpl extends BaseNetworkingServices implements FirewallRuleService {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<? extends FirewallRule> list() {
		return get(FirewallRules.class, uri("/fw/firewall_rules")).execute().getList();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<? extends FirewallRule> list(Map<String, String> filteringParams) {
		Invocation<FirewallRules> req = get(FirewallRules.class, uri("/fw/firewall_rules"));
		if (filteringParams != null) {
            for (Map.Entry<String, String> entry : filteringParams.entrySet()) {
            	req = req.param(entry.getKey(), entry.getValue());
            }
        }
		return req.execute().getList();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FirewallRule get(String firewallRuleId) {
		checkNotNull(firewallRuleId);
		return get(NeutronFirewallRule.class, uri("/fw/firewall_rules/%s", firewallRuleId)).execute();	
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActionResponse delete(String firewallRuleId) {
		checkNotNull(firewallRuleId);
		return ToActionResponseFunction.INSTANCE.apply(delete(Void.class, 
				uri("/fw/firewall_rules/%s", firewallRuleId)).executeWithResponse());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FirewallRule create(FirewallRule firewall) {
		return post(NeutronFirewallRule.class, uri("/fw/firewall_rules")).entity(firewall)
				.execute(ExecutionOptions.<NeutronFirewallRule>create(PropagateOnStatus.on(404)));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FirewallRule update(String firewallRuleId, FirewallRuleUpdate firewallRuleUpdate) {
		checkNotNull(firewallRuleId);
        checkNotNull(firewallRuleUpdate);
        return put(NeutronFirewallRule.class, uri("/fw/firewall_rules/%s", firewallRuleId)).entity(firewallRuleUpdate).execute();
	}

}
