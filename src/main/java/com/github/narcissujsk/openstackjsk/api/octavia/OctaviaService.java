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
package com.github.narcissujsk.openstackjsk.api.octavia;

import com.github.narcissujsk.openstackjsk.api.octavia.HealthMonitorV2Service;
import com.github.narcissujsk.openstackjsk.api.octavia.LbPoolV2Service;
import com.github.narcissujsk.openstackjsk.api.octavia.ListenerV2Service;
import com.github.narcissujsk.openstackjsk.api.octavia.LoadBalancerV2Service;
import com.github.narcissujsk.openstackjsk.common.RestService;

/**
 * OpenStack Octavia Operations API
 * 
 * @author wei
 */
public interface OctaviaService extends RestService {

    /**
     * @return the LoadBalancerV2 Service API
     */
    LoadBalancerV2Service loadBalancerV2();

    /**
     * @return the ListenerV2 Service API
     */
    ListenerV2Service listenerV2();

    /**
     * @return the LbPoolV2 Service API
     */
    LbPoolV2Service lbPoolV2();

    /**
     * @return the healthMonitorV2 Service API
     */
    HealthMonitorV2Service healthMonitorV2();
}
