package com.github.narcissujsk.openstackjsk.model.gbp.builder;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.gbp.PolicyRuleSet;
/**
 * A builder which produces a Policy Rule Set object
 * 
 * @author vinod borole
 */
public interface PolicyRuleSetBuilder extends Builder<PolicyRuleSetBuilder, PolicyRuleSet> {
    PolicyRuleSetBuilder name(String name);
    PolicyRuleSetBuilder description(String description);
    PolicyRuleSetBuilder shared(boolean shared);
    PolicyRuleSetBuilder rules(List<String> ruleIds);
}
 