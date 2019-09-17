package com.github.narcissujsk.openstackjsk.api.networking;

import com.github.narcissujsk.openstackjsk.api.networking.*;
import com.github.narcissujsk.openstackjsk.api.networking.NetworkService;
import com.github.narcissujsk.openstackjsk.api.networking.PortService;
import com.github.narcissujsk.openstackjsk.api.networking.RouterService;
import com.github.narcissujsk.openstackjsk.api.networking.SubnetService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.AgentService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.FirewallAsService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.LbaasV2Service;
import com.github.narcissujsk.openstackjsk.api.networking.ext.LoadBalancerService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.NetQuotaService;
import com.github.narcissujsk.openstackjsk.common.RestService;

/**
 * OpenStack Networking Operations API
 * 
 * @author Jeremy Unruh
 */
public interface NetworkingService extends RestService {

    /**
     * @return the Network Service API
     */
    NetworkService network();

    /**
     * @return the Subnet Service API
     */
    SubnetService subnet();

    /**
     * @return the Port Service API
     */
    PortService port();

    /**
     * @return the Router Service API
     */
    RouterService router();

    /**
     * @return the FloatingIP Service API
     */
    NetFloatingIPService floatingip();

    /**
     *
     * @return the Security Group Service API
     */
    SecurityGroupService securitygroup();

    /**
     *
     * @return the Security Group Rule Service API
     */
    SecurityGroupRuleService securityrule();

    /**
     * @return the network quota service
     */
    NetQuotaService quotas();
   
    /**
     * @return the LBaaS service
     */
    LoadBalancerService loadbalancers();
    
    /**
     * 
     * @return the Neutron agent API
     */
    AgentService agent();

    /**
     * @return the LBaaS V2 service
     */
    LbaasV2Service lbaasV2();

    /**
     * <p>OpenStack Firewall As a Service <code>(FwaaS) : Firewall</code> Operations API</p>
     * 
     * @return the FwaaS service
     */
    FirewallAsService firewalls();
    
    /**
     * @return the Availability Zone Service API
     */
    AvailabilityZoneService availabilityzone();
}
