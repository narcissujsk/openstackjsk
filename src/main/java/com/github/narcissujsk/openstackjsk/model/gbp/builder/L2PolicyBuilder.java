package com.github.narcissujsk.openstackjsk.model.gbp.builder;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.gbp.L2Policy;
/**
 * A builder which produces a L2Policies object
 * 
 * @author vinod borole
 */
public interface L2PolicyBuilder extends Builder<L2PolicyBuilder, L2Policy> {

    L2PolicyBuilder name(String name);
    L2PolicyBuilder description(String description);
    L2PolicyBuilder isShared(boolean shared);
    L2PolicyBuilder networkId(String id);
    L2PolicyBuilder l3PolicyId(String id);
    L2PolicyBuilder policyTargetGroups(List<String> ids);
}
