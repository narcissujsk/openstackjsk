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
package com.github.narcissujsk.openstackjsk.api.networking.ext;

import com.github.narcissujsk.openstackjsk.api.networking.ext.HealthMonitorService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.LbPoolService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.MemberService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.VipService;

/**
 * LBaaS (Load Balancer as a Service) support
 */
public interface LoadBalancerService {

    /**
     *
     * @return the Lbaas member Service API
     */
    MemberService member();

    /**
     * @return the Lbaas vip Service API
     */
    VipService vip();
    
    /**
     * @return the Lbaas healthmonitor Service API
     */
    HealthMonitorService healthMonitor();
    

    /**
     * @return the Lbaas pool Service API
     */
    LbPoolService lbPool();
}
