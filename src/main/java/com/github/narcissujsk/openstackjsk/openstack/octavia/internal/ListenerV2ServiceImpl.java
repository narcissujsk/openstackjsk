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

import com.github.narcissujsk.openstackjsk.api.octavia.ListenerV2Service;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.octavia.ListenerV2;
import com.github.narcissujsk.openstackjsk.model.octavia.ListenerV2Update;
import com.github.narcissujsk.openstackjsk.openstack.compute.functions.ToActionResponseFunction;
import com.github.narcissujsk.openstackjsk.openstack.octavia.domain.OctaviaListenerV2;

import java.util.List;
import java.util.Map;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Lbaas listener imlementation
 * @author wei
 */
public class ListenerV2ServiceImpl extends BaseOctaviaServices implements ListenerV2Service {
    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends ListenerV2> list(){
        return get(OctaviaListenerV2.Listeners.class, uri("/lbaas/listeners")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends ListenerV2> list(Map<String, String> filteringParams){
        Invocation<OctaviaListenerV2.Listeners> req = get(OctaviaListenerV2.Listeners.class, uri("/lbaas/listeners"));
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
    public ListenerV2 get(String listenerId){
        checkNotNull(listenerId);
        return get(OctaviaListenerV2.class, uri("/lbaas/listeners/%s",listenerId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String listenerId){
        checkNotNull(listenerId);
        return ToActionResponseFunction.INSTANCE.apply(
                delete(Void.class, uri("/lbaas/listeners/%s",listenerId)).executeWithResponse());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ListenerV2 create(ListenerV2 listener){
        checkNotNull(listener);
        return post(OctaviaListenerV2.class, uri("/lbaas/listeners")).entity(listener).execute();
    }

    @Override
    public ListenerV2 update(String listenerId, ListenerV2Update listener){
        checkNotNull(listenerId);
        checkNotNull(listener);
        return put(OctaviaListenerV2.class, uri("/lbaas/listeners/%s",listenerId)).entity(listener).execute();
    }
}
