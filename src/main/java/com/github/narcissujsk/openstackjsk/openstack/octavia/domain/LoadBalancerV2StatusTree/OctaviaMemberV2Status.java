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
package com.github.narcissujsk.openstackjsk.openstack.octavia.domain.LoadBalancerV2StatusTree;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;
import com.github.narcissujsk.openstackjsk.model.octavia.status.MemberV2Status;

/**
 * An object to hold status of lbaas v2 member
 * @author wei
 */
@JsonRootName("members")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OctaviaMemberV2Status extends Status implements MemberV2Status {

    @JsonProperty("protocol_port")
    private Integer protocolPort;

    @JsonProperty("address")
    private String address;

    public Integer getProtocolPort(){
        return protocolPort;
    }

    public String getAddress(){
        return address;
    }

    @Override
    public String toString(){
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("protocolPort", protocolPort)
                .add("address", address)
                .add("operatingStatus", operatingStatus)
                .add("provisioningStatus", provisioningStatus)
                .toString();
    }
}
