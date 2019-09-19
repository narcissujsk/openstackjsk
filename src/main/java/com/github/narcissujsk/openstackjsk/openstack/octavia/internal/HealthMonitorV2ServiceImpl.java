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

import com.github.narcissujsk.openstackjsk.api.octavia.HealthMonitorV2Service;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.octavia.HealthMonitorV2;
import com.github.narcissujsk.openstackjsk.model.octavia.HealthMonitorV2Update;
import com.github.narcissujsk.openstackjsk.openstack.compute.functions.ToActionResponseFunction;
import com.github.narcissujsk.openstackjsk.openstack.octavia.domain.OctaviaHealthMonitorV2;
import com.github.narcissujsk.openstackjsk.openstack.octavia.domain.OctaviaHealthMonitorV2.HealthMonitorsV2;

import java.util.List;
import java.util.Map;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * OpenStack (Octavia) lbaas v2 health monitor operations
 * @author wei
 */
public class HealthMonitorV2ServiceImpl extends BaseOctaviaServices implements HealthMonitorV2Service{
    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends HealthMonitorV2> list(){
        return get(HealthMonitorsV2.class, uri("/lbaas/healthmonitors")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends HealthMonitorV2> list(Map<String, String> filteringParams){
        Invocation<HealthMonitorsV2> req = get(HealthMonitorsV2.class, uri("/lbaas/healthmonitors"));
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
    public HealthMonitorV2 get(String healthMonitorId){
        checkNotNull(healthMonitorId);
        return get(OctaviaHealthMonitorV2.class, uri("/lbaas/healthmonitors/%s", healthMonitorId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String healthMonitorId){
        checkNotNull(healthMonitorId);
        return ToActionResponseFunction.INSTANCE.apply(delete(Void.class, uri("/lbaas/healthmonitors/%s", healthMonitorId)).executeWithResponse());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthMonitorV2 create(HealthMonitorV2 healthMonitor){
        checkNotNull(healthMonitor);
        return post(OctaviaHealthMonitorV2.class,uri("/lbaas/healthmonitors")).entity(healthMonitor).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthMonitorV2 update(String healthMonitorId,
                                HealthMonitorV2Update healthMonitor) {
        checkNotNull(healthMonitorId);
        checkNotNull(healthMonitor);
        return put(OctaviaHealthMonitorV2.class,uri("/lbaas/healthmonitors/%s",healthMonitorId)).entity(healthMonitor).execute();
    }
}
