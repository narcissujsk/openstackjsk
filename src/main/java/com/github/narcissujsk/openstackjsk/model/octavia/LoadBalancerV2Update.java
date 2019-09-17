package com.github.narcissujsk.openstackjsk.model.octavia;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.octavia.LoadBalancerV2;
import com.github.narcissujsk.openstackjsk.model.octavia.builder.LoadBalancerV2UpdateBuilder;

/**
 * an entity used to update an lbaas v2 loadbalancer
 * @author wei
 */
public interface LoadBalancerV2Update extends ModelEntity, Buildable<LoadBalancerV2UpdateBuilder> {
    /**
     * Optional
     * @see com.github.narcissujsk.openstackjsk.model.octavia.LoadBalancerV2#getDescription()
     */
    public String getDescription();

    /**
     * Optional
     * @see com.github.narcissujsk.openstackjsk.model.octavia.LoadBalancerV2#getName()
     */
    public String getName();

    /**
     * Optional
     * @see LoadBalancerV2#isAdminStateUp()
     */
    public boolean isAdminStateUp();
}
