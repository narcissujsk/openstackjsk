package com.github.narcissujsk.openstackjsk.model.gbp.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.gbp.PolicyTarget;
/**
 * A builder which produces a Policy Target object
 * 
 * @author vinod borole
 */
public interface PolicyTargetBuilder extends Builder<PolicyTargetBuilder, PolicyTarget> {
    PolicyTargetBuilder name(String name);
    PolicyTargetBuilder portId(String portId);
    PolicyTargetBuilder policyTargetGroupId(String policyTargetGroupId);
    PolicyTargetBuilder clusterId(String clusterId);
    PolicyTargetBuilder description(String description);
}
 