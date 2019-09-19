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

import com.github.narcissujsk.openstackjsk.api.octavia.LoadBalancerV2Service;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.octavia.LoadBalancerV2;
import com.github.narcissujsk.openstackjsk.model.octavia.LoadBalancerV2Stats;
import com.github.narcissujsk.openstackjsk.model.octavia.LoadBalancerV2StatusTree;
import com.github.narcissujsk.openstackjsk.model.octavia.LoadBalancerV2Update;
import com.github.narcissujsk.openstackjsk.openstack.compute.functions.ToActionResponseFunction;
import com.github.narcissujsk.openstackjsk.openstack.octavia.domain.LoadBalancerV2StatusTree.OctaviaLoadBalancerV2StatusTree;
import com.github.narcissujsk.openstackjsk.openstack.octavia.domain.OctaviaLoadBalancerV2;
import com.github.narcissujsk.openstackjsk.openstack.octavia.domain.OctaviaLoadBalancerV2Stats;

import java.util.List;
import java.util.Map;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Openstack (Octavia) lbaas v2 load balancer operations
 * @author wei
 */
public class LoadBalancerV2ServiceImpl extends BaseOctaviaServices implements LoadBalancerV2Service {
    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends LoadBalancerV2> list(){
        return get(OctaviaLoadBalancerV2.LoadBalancersV2.class, uri("/lbaas/loadbalancers")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends LoadBalancerV2> list(Map<String, String> filteringParams){
        Invocation<OctaviaLoadBalancerV2.LoadBalancersV2> req = get(OctaviaLoadBalancerV2.LoadBalancersV2.class, uri("/lbaas/loadbalancers"));
        if (filteringParams != null) {
            for (Map.Entry<String, String> entry : filteringParams.entrySet()) {
                req = req.param(entry.getKey(), entry.getValue());
            }
        }
        return req.execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoadBalancerV2 get(String loadbalancerId){
        checkNotNull(loadbalancerId);
        return get(OctaviaLoadBalancerV2.class, uri("/lbaas/loadbalancers/%s",loadbalancerId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoadBalancerV2 create(LoadBalancerV2 loadbalancer){
        checkNotNull(loadbalancer);
        return post(OctaviaLoadBalancerV2.class,uri("/lbaas/loadbalancers")).entity(loadbalancer).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoadBalancerV2 update(String loadbalancerId, LoadBalancerV2Update loadbalancer){
        checkNotNull(loadbalancerId);
        checkNotNull(loadbalancer);
        return put(OctaviaLoadBalancerV2.class, uri("/lbaas/loadbalancers/%s",loadbalancerId)).entity(loadbalancer).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String loadbalancerId){
        checkNotNull(loadbalancerId);
        return ToActionResponseFunction.INSTANCE.apply(delete(Void.class, uri("/lbaas/loadbalancers/%s",loadbalancerId)).executeWithResponse());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse cascadeDelete(String loadbalancerId){
        checkNotNull(loadbalancerId);
        Invocation<Void> req = delete(Void.class, uri("/lbaas/loadbalancers/%s",loadbalancerId));
        req = req.param("cascade", "true");
        return ToActionResponseFunction.INSTANCE.apply(req.executeWithResponse());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoadBalancerV2Stats stats(String loadbalancerId){
        checkNotNull(loadbalancerId);
        return get(OctaviaLoadBalancerV2Stats.class, uri("/lbaas/loadbalancers/%s/stats",loadbalancerId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoadBalancerV2StatusTree statusTree(String loadbalancerId){
        checkNotNull(loadbalancerId);
        return get(OctaviaLoadBalancerV2StatusTree.class, uri("/lbaas/loadbalancers/%s/status", loadbalancerId)).execute();
    }
}
