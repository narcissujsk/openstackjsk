package com.github.narcissujsk.openstackjsk.openstack.networking.internal.ext;

import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.networking.ext.HealthMonitorV2Service;
import com.github.narcissujsk.openstackjsk.api.networking.ext.LbPoolV2Service;
import com.github.narcissujsk.openstackjsk.api.networking.ext.LbaasV2Service;
import com.github.narcissujsk.openstackjsk.api.networking.ext.ListenerV2Service;
import com.github.narcissujsk.openstackjsk.api.networking.ext.LoadBalancerV2Service;
import com.github.narcissujsk.openstackjsk.openstack.networking.internal.BaseNetworkingServices;

/**
 * OpenStack (Neutron) lbaas v2 service implementation
 * @author emjburns
 */
public class LbaasV2ServiceImpl extends BaseNetworkingServices implements LbaasV2Service {
    /**
     * {@inheritDoc}
     */
    @Override
    public ListenerV2Service listener(){
        return Apis.get(ListenerV2Service.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LbPoolV2Service lbPool(){
        return Apis.get(LbPoolV2Service.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthMonitorV2Service healthMonitor(){
        return Apis.get(HealthMonitorV2Service.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoadBalancerV2Service loadbalancer(){
        return Apis.get(LoadBalancerV2Service.class);
    }
}
