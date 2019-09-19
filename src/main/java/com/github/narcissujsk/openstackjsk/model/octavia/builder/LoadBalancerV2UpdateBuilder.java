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
package com.github.narcissujsk.openstackjsk.model.octavia.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.octavia.LoadBalancerV2Update;

/**
 * Builder to update a lbaas v2 loadbalancer
 * @author wei
 */
public interface LoadBalancerV2UpdateBuilder extends Buildable.Builder<LoadBalancerV2UpdateBuilder, LoadBalancerV2Update> {
    /**
     * Optional
     * @param description
     *            Human-readable description for the load balancer.
     * @return LoadBalancerV2UpdateBuilder
     */
    public LoadBalancerV2UpdateBuilder description(String description);

    /**
     * @param name
     *            Human-readable name for the load balancer.
     * @return LoadBalancerV2UpdateBuilder
     */
    public LoadBalancerV2UpdateBuilder name(String name);

    /**
     * Optional
     * @param adminStateUp
     *         The administrative state of the VIP. A valid value is true
     *            (UP) or false (DOWN).
     * @return LoadBalancerV2UpdateBuilder
     */
    public LoadBalancerV2UpdateBuilder adminStateUp(boolean adminStateUp);

}
