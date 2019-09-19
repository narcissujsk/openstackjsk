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
package com.github.narcissujsk.openstackjsk.openstack.octavia.builder;

import com.github.narcissujsk.openstackjsk.model.octavia.builder.*;
import com.github.narcissujsk.openstackjsk.openstack.octavia.domain.*;

/**
 * The Octavia Builders
 */
public class OctaviaBuilders {

    public MemberV2Builder memberV2(){
        return OctaviaMemberV2.builder();
    }

    public MemberV2UpdateBuilder memberV2Update(){
        return OctaviaMemberV2Update.builder();
    }

    public LoadBalancerV2Builder loadBalancerV2(){
        return OctaviaLoadBalancerV2.builder();
    }

    public LoadBalancerV2UpdateBuilder loadBalancerV2Update(){
        return OctaviaLoadBalancerV2Update.builder();
    }

    public HealthMonitorV2Builder healthMonitorV2(){
        return OctaviaHealthMonitorV2.builder();
    }

    public HealthMonitorV2UpdateBuilder healthMonitorV2Update(){
        return OctaviaHealthMonitorV2Update.builder();
    }

    public SessionPersistenceBuilder sessionPersistence() {
        return OctaviaSessionPersistence.builder();
    }

    public LbPoolV2Builder lbPoolV2(){
        return OctaviaLbPoolV2.builder();
    }

    public LbPoolV2UpdateBuilder lbPoolV2Update(){
        return OctaviaLbPoolV2Update.builder();
    }

    public ListenerV2Builder listenerV2(){
        return OctaviaListenerV2.builder();
    }

    public ListenerV2UpdateBuilder listenerV2Update(){
        return OctaviaListenerV2Update.builder();
    }
}
