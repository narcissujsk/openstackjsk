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
package com.github.narcissujsk.openstackjsk.model.octavia.status;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.octavia.status.ListenerV2Status;
import com.github.narcissujsk.openstackjsk.openstack.octavia.domain.LoadBalancerV2StatusTree.OctaviaLoadBalancerV2Status;

import java.util.List;

/**
 * The status of an lbaas v2 loadbalancer
 * @author wei
 */
@JsonDeserialize(as = OctaviaLoadBalancerV2Status.class)
public interface LoadBalancerV2Status extends ModelEntity {
    /**
     * The id of the loadbalancer
     * @return id
     */
    public String getId();

    /**
     * The name of the loadbalancer
     * @return name
     */
    public String getName();

    /**
     * The operating status of the loadbalancer
     * @return operating status
     */
    public String getOperatingStatus();

    /**
     * The provisioning status of the loadbalancer
     * @return provisioning status
     */
    public String getProvisioningStatus();

    /**
     * The listeners associated with the loadbalancer
     * @return list of listener statuses
     */
    public List<ListenerV2Status> getListenerStatuses();
}
