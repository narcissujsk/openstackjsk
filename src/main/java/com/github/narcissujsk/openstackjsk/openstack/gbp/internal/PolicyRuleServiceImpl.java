package com.github.narcissujsk.openstackjsk.openstack.gbp.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.api.gbp.PolicyRuleService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.gbp.PolicyRule;
import com.github.narcissujsk.openstackjsk.openstack.gbp.domain.GbpPolicyRule;
import com.github.narcissujsk.openstackjsk.openstack.gbp.domain.GbpPolicyRule.PolicyRules;
import com.github.narcissujsk.openstackjsk.openstack.networking.internal.BaseNetworkingServices;
/**
 * Policy Rule API Implementation
 * 
 * @author vinod borole
 */
public class PolicyRuleServiceImpl extends BaseNetworkingServices implements PolicyRuleService {

    /**
     * {@inheritDoc}
     */
    @Override 
    public List<? extends PolicyRule> list() {
        return get(PolicyRules.class, uri("/grouppolicy/policy_rules")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends PolicyRule> list(Map<String, String> filteringParams) {
        Invocation<PolicyRules> policyruleInvocation = buildInvocation(filteringParams);
        return policyruleInvocation.execute().getList();
    }
    
    private Invocation<PolicyRules> buildInvocation(Map<String, String> filteringParams) {
        Invocation<PolicyRules> policyruleInvocation = get(PolicyRules.class, "/grouppolicy/policy_rules");
        if (filteringParams == null) { 
            return policyruleInvocation;
        } 
        if (filteringParams != null) {
            for (Map.Entry<String, String> entry : filteringParams.entrySet()) {
                policyruleInvocation = policyruleInvocation.param(entry.getKey(), entry.getValue());
            }
        }
        return policyruleInvocation;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public PolicyRule get(String id) {
        checkNotNull(id);
        return get(GbpPolicyRule.class, uri("/grouppolicy/policy_rules/%s", id)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String id) {
        checkNotNull(id);
        return deleteWithResponse(uri("/grouppolicy/policy_rules/%s", id)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PolicyRule create(PolicyRule policyRule) {
        return post(GbpPolicyRule.class, uri("/grouppolicy/policy_rules")).entity(policyRule).execute();
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public PolicyRule update(String policyRuleId, PolicyRule policyRule) {
        checkNotNull(policyRuleId);
        checkNotNull(policyRule);
        return put(GbpPolicyRule.class, uri("/grouppolicy/policy_rules/%s", policyRuleId)).entity(policyRule).execute();
    }

}
