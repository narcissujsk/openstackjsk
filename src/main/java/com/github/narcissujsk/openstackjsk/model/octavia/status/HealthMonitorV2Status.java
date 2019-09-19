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
import com.github.narcissujsk.openstackjsk.model.octavia.HealthMonitorType;
import com.github.narcissujsk.openstackjsk.openstack.octavia.domain.LoadBalancerV2StatusTree.OctaviaHealthMonitorV2Status;

/**
 * The status of an lbaas v2 heathmonitor
 * @author wei
 */
@JsonDeserialize(as = OctaviaHealthMonitorV2Status.class)
public interface HealthMonitorV2Status extends ModelEntity {
    /**
     * The id of the healthmonitor
     * @return id
     */
    public String getId();

    /**
     *  The health monitor type
     * @return HealthMonitorType
     */
    public HealthMonitorType getType();

    /**
     * Provisioning status of the health monitor
     * @return provisioningStatus
     */
    public String getProvisioningStatus();
}
