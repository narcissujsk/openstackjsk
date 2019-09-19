/*******************************************************************************
 * 	Copyright 2019 ContainX and OpenStack4j
 *
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * 	use this file except in compliance with the License. You may obtain a copy of
 * 	the License at
 *
 * 	    http://www.apache.org/licenses/LICENSE-2.0
 *
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * 	License for the specific language governing permissions and limitations under
 * 	the License.
 *******************************************************************************/
package com.github.narcissujsk.openstackjsk.openstack.networking.internal;

import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.networking.AvailabilityZoneService;
import com.github.narcissujsk.openstackjsk.api.networking.NetFloatingIPService;
import com.github.narcissujsk.openstackjsk.api.networking.NetworkService;
import com.github.narcissujsk.openstackjsk.api.networking.NetworkingService;
import com.github.narcissujsk.openstackjsk.api.networking.PortService;
import com.github.narcissujsk.openstackjsk.api.networking.RouterService;
import com.github.narcissujsk.openstackjsk.api.networking.SecurityGroupRuleService;
import com.github.narcissujsk.openstackjsk.api.networking.SecurityGroupService;
import com.github.narcissujsk.openstackjsk.api.networking.SubnetService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.AgentService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.FirewallAsService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.LbaasV2Service;
import com.github.narcissujsk.openstackjsk.api.networking.ext.LoadBalancerService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.NetQuotaService;

/**
 * OpenStack Networking Operations API
 * 
 * @author Jeremy Unruh
 */
public class NetworkingServiceImpl implements NetworkingService {

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkService network() {
        return Apis.get(NetworkService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubnetService subnet() {
        return Apis.get(SubnetService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortService port() {
        return Apis.get(PortService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouterService router() {
        return Apis.get(RouterService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetFloatingIPService floatingip() {
        return Apis.get(NetFloatingIPService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityGroupService securitygroup() {
        return Apis.get(SecurityGroupService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityGroupRuleService securityrule() {
        return Apis.get(SecurityGroupRuleService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetQuotaService quotas() {
        return Apis.get(NetQuotaService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoadBalancerService loadbalancers() {
        return Apis.get(LoadBalancerService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LbaasV2Service lbaasV2(){
        return Apis.get(LbaasV2Service.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FirewallAsService firewalls() {
        return Apis.get(FirewallAsService.class);
    }	

    /**
     * {@inheritDoc}
     */
    @Override
    public AgentService agent() {
        return Apis.get(AgentService.class);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public AvailabilityZoneService availabilityzone() {
        return Apis.get(AvailabilityZoneService.class);
    }	

}
