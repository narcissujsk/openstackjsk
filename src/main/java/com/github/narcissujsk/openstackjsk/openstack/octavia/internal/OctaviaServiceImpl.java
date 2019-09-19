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
package com.github.narcissujsk.openstackjsk.openstack.octavia.internal;

import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.octavia.*;

/**
 * OpenStack Networking Operations API
 * 
 * @author wei
 */
public class OctaviaServiceImpl implements OctaviaService {

    /**
     * {@inheritDoc}
     */
    @Override
    public LoadBalancerV2Service loadBalancerV2() {
        return Apis.get(LoadBalancerV2Service.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ListenerV2Service listenerV2() {
        return Apis.get(ListenerV2Service.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LbPoolV2Service lbPoolV2() {
        return Apis.get(LbPoolV2Service.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthMonitorV2Service healthMonitorV2() {
        return Apis.get(HealthMonitorV2Service.class);
    }

}
