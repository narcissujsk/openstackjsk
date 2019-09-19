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
package com.github.narcissujsk.openstackjsk.model.network.ext;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.network.ext.LbOperatingStatus;
import com.github.narcissujsk.openstackjsk.model.network.ext.LbProvisioningStatus;
import com.github.narcissujsk.openstackjsk.model.network.ext.builder.LoadBalancerV2Builder;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.ext.ListItem;

import java.util.List;

/**
 * An entity used to update an lbaas v2 loadbalancer
 * @author emjburns
 */
public interface LoadBalancerV2  extends ModelEntity, Buildable<LoadBalancerV2Builder> {
    /**
     * @return id. The unique ID for the loadbalancer.
     */
    String getId();

    /**
     * @return tenantId.
     * Owner of the loadbalancer. Only an administrative user can specify a tenant ID other than its own.
     */
    String getTenantId();

    /**
     * @return loadbalancer name. Does not have to be unique.
     */
    String getName();

    /**
     * @return Description for the loadbalancer.
     */
    String getDescription();

    /**
     * @return The vip subnet id of the loadbalancer.
     */
    String getVipSubnetId();

    /**
     * @return The vip address of the loadbalancer.
     */
    String getVipAddress();

    /***
     * @return the vip port id of the loadbalancer
     */
    String getVipPortId();

    /**
     * @return The administrative state of the loadbalancer, which is up (true) or
     *         down (false).
     */
    boolean isAdminStateUp();

    /**
     * @return The listeners of the loadbalancer.
     */
    List<ListItem> getListeners();

    /**
     * @return provisioningStatus.The provisioning status of the loadbalancer. Indicates whether the
     *         loadbalancer is provisioning.
     *         Either ACTIVE, PENDING_CREATE or ERROR.
     */
    LbProvisioningStatus getProvisioningStatus();

    /**
     * @return operatingStatus.The operating status of the loadbalancer. Indicates whether the
     *         loadbalancer is operational.
     */
    LbOperatingStatus getOperatingStatus();

    /**
     * Retrieve provider the load balancer is provisioned with
     * @return provider
     */
    String getProvider();
}
