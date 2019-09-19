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
package com.github.narcissujsk.openstackjsk.openstack.compute.internal.ext;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.compute.ext.InstanceActionsService;
import com.github.narcissujsk.openstackjsk.model.compute.InstanceAction;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaInstanceAction;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaInstanceAction.NovaInstanceActions;
import com.github.narcissujsk.openstackjsk.openstack.compute.internal.BaseComputeServices;

/**
 * API to list executed instance actions.
 * 
 * @author Christian Banse
 */
public class InstanceActionsServiceImpl extends BaseComputeServices implements InstanceActionsService {

    @Override
    public List<? extends InstanceAction> list(String serverId) {
        checkNotNull(serverId, "serverId");
        return get(NovaInstanceActions.class, uri("/servers/%s/os-instance-actions", serverId)).execute().getList();
    }

    @Override
    public InstanceAction get(String serverId, String requestId) {
        checkNotNull(serverId, "serverId");
        checkNotNull(requestId, "requestId");
        return get(NovaInstanceAction.class, uri("/servers/%s/os-instance-actions/%s", serverId, requestId)).execute();
    }

}
