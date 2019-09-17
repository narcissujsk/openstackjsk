package com.github.narcissujsk.openstackjsk.openstack.octavia.internal;

import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.octavia.*;

/**
 * OpenStack Networking Operations API
 * 
 * @author wei
 */
public class OctaviaServiceImpl implements OctaviaService {

    /**
     * {@inheritDoc}
     */
    @Override
    public LoadBalancerV2Service loadBalancerV2() {
        return Apis.get(LoadBalancerV2Service.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ListenerV2Service listenerV2() {
        return Apis.get(ListenerV2Service.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LbPoolV2Service lbPoolV2() {
        return Apis.get(LbPoolV2Service.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthMonitorV2Service healthMonitorV2() {
        return Apis.get(HealthMonitorV2Service.class);
    }

}
