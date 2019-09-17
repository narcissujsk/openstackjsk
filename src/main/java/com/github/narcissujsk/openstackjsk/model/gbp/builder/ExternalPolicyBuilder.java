package com.github.narcissujsk.openstackjsk.model.gbp.builder;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.gbp.ExternalPolicyCreate;
/**
 * A builder which produces a External Policy object
 * 
 * @author vinod borole
 */
public interface ExternalPolicyBuilder extends Builder<ExternalPolicyBuilder, ExternalPolicyCreate> {

    ExternalPolicyBuilder name(String string);
    ExternalPolicyBuilder description(String description);
    ExternalPolicyBuilder isShared(boolean shared);
    ExternalPolicyBuilder consumedPolicyRuleSets(List<String> policyRuleSet);
    ExternalPolicyBuilder providedPolicyRuleSets(List<String> policyRuleSet);
    ExternalPolicyBuilder externalSegments(List<String> externalSegmentIds);
    
}
