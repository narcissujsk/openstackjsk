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
import com.github.narcissujsk.openstackjsk.openstack.octavia.domain.LoadBalancerV2StatusTree.OctaviaMemberV2Status;

/**
 * The status of an lbaas v2 member
 * @author wei
 */
@JsonDeserialize(as = OctaviaMemberV2Status.class)
public interface MemberV2Status extends ModelEntity {
    /**
     * The id of the member
     * @return id
     */
    public String getId();

    /**
     * The address of the memeber
     * @return address
     */
    public String getAddress();

    /**
     * The protocol port of the member
     * @return protocol port
     */
    public Integer getProtocolPort();

    /**
     * The operating status of the member
     * @return operating status
     */
    public String getOperatingStatus();

    /**
     * The provisioning status of the member
     * @return provisioning status
     */
    public String getProvisioningStatus();
}
