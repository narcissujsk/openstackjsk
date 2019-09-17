package com.github.narcissujsk.openstackjsk.model.gbp;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.common.Resource;
import com.github.narcissujsk.openstackjsk.model.gbp.builder.L2PolicyBuilder;

/**
 * L2 Policy Model Entity
 * 
 * @author vinod borole
 */
public interface L2Policy extends Resource, Buildable<L2PolicyBuilder> {

    /**
     * Gets the description
     *
     * @return the description
     */
    String getDescription();

    /**
     * Gets the network Id
     *
     * @return the network Id
     */
    String getNetworkId();

    /**
     * Gets the L3 Policy Id
     *
     * @return the L3 Policy Id
     */
    String getL3PolicyId();

    /**
     * Is L2 Policy shared
     *
     * @return the true if shared and false if not shared
     */
    boolean isShared();

    /**
     * Gets the list of policy Target groups
     *
     * @return the policy target group list
     */
    List<String> getPolicyTargetGroups();

}
