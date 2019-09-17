package com.github.narcissujsk.openstackjsk.model.network.ext;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.network.ext.LoadBalancerV2;
import com.github.narcissujsk.openstackjsk.model.network.ext.builder.LoadBalancerV2UpdateBuilder;

/**
 * an entity used to update an lbaas v2 loadbalancer
 * @author emjburns
 */
public interface LoadBalancerV2Update extends ModelEntity, Buildable<LoadBalancerV2UpdateBuilder> {
    /**
     * Optional
     * @see com.github.narcissujsk.openstackjsk.model.network.ext.LoadBalancerV2#getDescription()
     */
    public String getDescription();

    /**
     * Optional
     * @see com.github.narcissujsk.openstackjsk.model.network.ext.LoadBalancerV2#getName()
     */
    public String getName();

    /**
     * Optional
     * @see LoadBalancerV2#isAdminStateUp()
     */
    public boolean isAdminStateUp();
}
