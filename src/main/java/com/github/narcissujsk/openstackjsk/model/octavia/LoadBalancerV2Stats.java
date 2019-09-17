package com.github.narcissujsk.openstackjsk.model.octavia;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

/**
 * The statistics about an lbaas v2 loadbalancer
 * @author wei
 */
public interface LoadBalancerV2Stats extends ModelEntity {
    /**
     *
     * @return The inbound bytes of the loadbalancer.
     */
    public Long getBytesIn();

    /**
     *
     * @return The inbound bytes of the loadbalancer.
     */
    public Long getBytesOut();

    /**
     *
     * @return The number of total connections of the loadbalancer.
     */
    public Integer getTotalConnections();

    /**
     *
     * @return The number of active connections of the loadbalancer.
     */
    public Integer getActiveConnections();
}
