package com.github.narcissujsk.openstackjsk.openstack.gbp.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.api.gbp.PolicyRuleSetService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.gbp.PolicyRuleSet;
import com.github.narcissujsk.openstackjsk.openstack.gbp.domain.GbpPolicyRuleSet;
import com.github.narcissujsk.openstackjsk.openstack.gbp.domain.GbpPolicyRuleSet.PolicyRuleSets;
import com.github.narcissujsk.openstackjsk.openstack.networking.internal.BaseNetworkingServices;
/**
 * Policy Rule set API Implementation
 * 
 * @author vinod borole
 */
public class PolicyRuleSetServiceImpl extends BaseNetworkingServices implements PolicyRuleSetService {

    /**
     * {@inheritDoc}
     */
    @Override 
    public List<? extends PolicyRuleSet> list() {
        return get(PolicyRuleSets.class, uri("/grouppolicy/policy_rule_sets")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
   @Override
    public List<? extends PolicyRuleSet> list(Map<String, String> filteringParams) {
        Invocation<PolicyRuleSets> policyrulesetsInvocation = buildInvocation(filteringParams);
        return policyrulesetsInvocation.execute().getList();
    }
    
    private Invocation<PolicyRuleSets> buildInvocation(Map<String, String> filteringParams) {
        Invocation<PolicyRuleSets> policyrulesetsInvocation = get(PolicyRuleSets.class, "/grouppolicy/policy_rule_sets");
        if (filteringParams == null) { 
            return policyrulesetsInvocation;
        } 
        if (filteringParams != null) {
            for (Map.Entry<String, String> entry : filteringParams.entrySet()) {
                policyrulesetsInvocation = policyrulesetsInvocation.param(entry.getKey(), entry.getValue());
            }
        }
        return policyrulesetsInvocation;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PolicyRuleSet get(String id) {
        checkNotNull(id);
        return get(GbpPolicyRuleSet.class, uri("/grouppolicy/policy_rule_sets/%s", id)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String id) {
        checkNotNull(id);
        return deleteWithResponse(uri("/grouppolicy/policy_rule_sets/%s", id)).execute();
    }

    /**
     * {@inheritDoc}
     */
   @Override
    public PolicyRuleSet create(PolicyRuleSet policyRuleSet) {
        return post(GbpPolicyRuleSet.class, uri("/grouppolicy/policy_rule_sets")).entity(policyRuleSet).execute();
    }

   /**
    * {@inheritDoc}
    */
   @Override
    public PolicyRuleSet update(String policyRuleSetId, PolicyRuleSet policyRuleSet) {
        checkNotNull(policyRuleSetId);
        checkNotNull(policyRuleSet);
        return put(GbpPolicyRuleSet.class, uri("/grouppolicy/policy_rule_sets/%s", policyRuleSetId)).entity(policyRuleSet).execute();

    }

}
