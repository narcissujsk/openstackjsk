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
package com.github.narcissujsk.openstackjsk.openstack.networking.internal.ext;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.networking.ext.PortPairGroupService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.network.ext.PortPairGroup;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.ext.NeutronPortPairGroup;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.ext.NeutronPortPairGroup.PortPairGroups;
import com.github.narcissujsk.openstackjsk.openstack.networking.internal.BaseNetworkingServices;

/**
 * {@inheritDoc}
 */
public class PortPairGroupServiceImpl extends BaseNetworkingServices implements PortPairGroupService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends PortPairGroup> list() {
        return get(PortPairGroups.class, uri("/sfc/port_pair_groups")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortPairGroup create(PortPairGroup portPairGroup) {
        checkNotNull(portPairGroup);
        return post(NeutronPortPairGroup.class, uri("/sfc/port_pair_groups")).entity(portPairGroup).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String portPairGroupId) {
        checkNotNull(portPairGroupId);
        return deleteWithResponse(uri("/sfc/port_pair_groups/%s", portPairGroupId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortPairGroup get(String portPairGroupId) {
        checkNotNull(portPairGroupId);
        return get(NeutronPortPairGroup.class, uri("/sfc/port_pair_groups/%s", portPairGroupId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortPairGroup update(String portPairGroupId, PortPairGroup portPairGroup) {
        checkNotNull(portPairGroupId);
        return put(NeutronPortPairGroup.class, uri("/sfc/port_pair_groups/%s", portPairGroupId)).entity(portPairGroup).execute();
    }
}
