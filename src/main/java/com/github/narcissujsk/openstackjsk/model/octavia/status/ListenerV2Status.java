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
import com.github.narcissujsk.openstackjsk.model.octavia.status.LbPoolV2Status;
import com.github.narcissujsk.openstackjsk.openstack.octavia.domain.LoadBalancerV2StatusTree.OctaviaListenerV2Status;

import java.util.List;

@JsonDeserialize(as = OctaviaListenerV2Status.class)
public interface ListenerV2Status extends ModelEntity {
    /**
     * The name of the listener
     * @return name
     */
    public String getName();

    /**
     * The id of the listener
     * @return id
     */
    public String getId();

    /**
     * The operating status of the listener
     * @return operating status
     */
    public String getOperatingStatus();

    /**
     * The provisioning status of the listener
     * @return provisioning status
     */
    public String getProvisioningStatus();

    /**
     * The statuses of the pools associated with this listener
     * @return list of the status of the pools
     */
    public List<LbPoolV2Status> getLbPoolV2Statuses();
}
