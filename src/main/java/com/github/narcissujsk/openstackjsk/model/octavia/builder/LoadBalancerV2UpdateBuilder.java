package com.github.narcissujsk.openstackjsk.model.octavia.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.octavia.LoadBalancerV2Update;

/**
 * Builder to update a lbaas v2 loadbalancer
 * @author wei
 */
public interface LoadBalancerV2UpdateBuilder extends Buildable.Builder<LoadBalancerV2UpdateBuilder, LoadBalancerV2Update> {
    /**
     * Optional
     * @param description
     *            Human-readable description for the load balancer.
     * @return LoadBalancerV2UpdateBuilder
     */
    public LoadBalancerV2UpdateBuilder description(String description);

    /**
     * @param name
     *            Human-readable name for the load balancer.
     * @return LoadBalancerV2UpdateBuilder
     */
    public LoadBalancerV2UpdateBuilder name(String name);

    /**
     * Optional
     * @param adminStateUp
     *         The administrative state of the VIP. A valid value is true
     *            (UP) or false (DOWN).
     * @return LoadBalancerV2UpdateBuilder
     */
    public LoadBalancerV2UpdateBuilder adminStateUp(boolean adminStateUp);

}
