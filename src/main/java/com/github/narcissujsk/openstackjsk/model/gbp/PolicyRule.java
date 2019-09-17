package com.github.narcissujsk.openstackjsk.model.gbp;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.common.Resource;
import com.github.narcissujsk.openstackjsk.model.gbp.builder.PolicyRuleBuilder;

/**
 * Policy rule Model Entity
 * 
 * @author vinod borole
 */
public interface PolicyRule extends Resource,Buildable<PolicyRuleBuilder> {

    /**
     * Is policy rule enabled
     *
     * @return True or False
     */
    boolean isEnabled();

    /**
     * Is Policy Rule shared
     *
     * @return the true if shared and false if not shared
     */
    boolean isShared();

    /**
     * Gets the list of Policy actions
     *
     * @return the list of Policy actions
     */
    List<String> getPolicyActions();

    /**
     * Gets the policy classifier Id
     *
     * @return the policy classifier Id
     */
    String getPolicyClassifierId();

    /**
     * Gets the description
     *
     * @return the description
     */
    String getDescription();

}
 