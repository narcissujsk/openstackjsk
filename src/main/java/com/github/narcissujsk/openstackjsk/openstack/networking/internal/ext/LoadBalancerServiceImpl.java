package com.github.narcissujsk.openstackjsk.openstack.networking.internal.ext;

import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.networking.ext.HealthMonitorService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.LbPoolService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.LoadBalancerService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.MemberService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.VipService;

/**
 * LBaaS Service Implementation
 */
public class LoadBalancerServiceImpl implements LoadBalancerService {

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberService member(){
        return Apis.get(MemberService.class);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public VipService vip() {
        return Apis.get(VipService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthMonitorService healthMonitor() {
        return Apis.get(HealthMonitorService.class);
    }

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    public LbPoolService lbPool() {
        return Apis.get(LbPoolService.class);
    }

}
