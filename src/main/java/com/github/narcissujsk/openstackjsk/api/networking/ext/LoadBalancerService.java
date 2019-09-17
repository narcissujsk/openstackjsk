package com.github.narcissujsk.openstackjsk.api.networking.ext;

import com.github.narcissujsk.openstackjsk.api.networking.ext.HealthMonitorService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.LbPoolService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.MemberService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.VipService;

/**
 * LBaaS (Load Balancer as a Service) support
 */
public interface LoadBalancerService {

    /**
     *
     * @return the Lbaas member Service API
     */
    MemberService member();

    /**
     * @return the Lbaas vip Service API
     */
    VipService vip();
    
    /**
     * @return the Lbaas healthmonitor Service API
     */
    HealthMonitorService healthMonitor();
    

    /**
     * @return the Lbaas pool Service API
     */
    LbPoolService lbPool();
}
