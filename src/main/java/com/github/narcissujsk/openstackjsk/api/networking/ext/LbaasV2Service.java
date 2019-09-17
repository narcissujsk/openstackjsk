package com.github.narcissujsk.openstackjsk.api.networking.ext;

import com.github.narcissujsk.openstackjsk.api.networking.ext.HealthMonitorV2Service;
import com.github.narcissujsk.openstackjsk.api.networking.ext.LbPoolV2Service;
import com.github.narcissujsk.openstackjsk.api.networking.ext.ListenerV2Service;
import com.github.narcissujsk.openstackjsk.api.networking.ext.LoadBalancerV2Service;

/**
 * LBaaS (Load Balancer as a Service) V2 support
 * @author emjburns
 */
public interface LbaasV2Service {

    /**
     * @return the Lbaas loadbalancer Service API
     */
    LoadBalancerV2Service loadbalancer();

    /**
     * @return the Lbaas healthmonitor V2 Service API
     */
    HealthMonitorV2Service healthMonitor();

    /**
     * @return the Lbaas pool Service API
     */
    LbPoolV2Service lbPool();

    /**
     * @return the Lbaas V2 listener Service API
     */
    ListenerV2Service listener();
}
