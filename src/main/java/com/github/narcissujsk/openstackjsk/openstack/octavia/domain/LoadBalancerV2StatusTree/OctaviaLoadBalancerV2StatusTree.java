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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;
import com.github.narcissujsk.openstackjsk.model.octavia.LoadBalancerV2StatusTree;
import com.github.narcissujsk.openstackjsk.model.octavia.status.LoadBalancerV2Status;

/**
 * The status tree of a lbaas v2 loadbalancer
 * @author wei
 */
@JsonRootName("statuses")
@JsonIgnoreProperties(ignoreUnknown = true)
public class OctaviaLoadBalancerV2StatusTree implements LoadBalancerV2StatusTree {

    @JsonProperty("loadbalancer")
    private OctaviaLoadBalancerV2Status loadBalancerStatus;

    @Override
    public LoadBalancerV2Status getLoadBalancerV2Status(){
        return loadBalancerStatus;
    }

    @Override
    public String toString(){
        return MoreObjects.toStringHelper(this)
                .add("loadbalancer", loadBalancerStatus)
                .toString();
    }
}
