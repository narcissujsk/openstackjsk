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

import com.github.narcissujsk.openstackjsk.api.networking.ext.PortChainService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.network.ext.PortChain;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.ext.NeutronPortChain;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.ext.NeutronPortChain.PortChains;
import com.github.narcissujsk.openstackjsk.openstack.networking.internal.BaseNetworkingServices;

/**
 * {@inheritDoc}
 */
public class PortChainServiceImpl extends BaseNetworkingServices implements PortChainService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends PortChain> list() {
        return get(PortChains.class, uri("/sfc/port_chains")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortChain create(PortChain portChain) {
        checkNotNull(portChain);
        return post(NeutronPortChain.class, uri("/sfc/port_chains")).entity(portChain).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String portChainId) {
        checkNotNull(portChainId);
        return deleteWithResponse(uri("/sfc/port_chains/%s", portChainId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortChain get(String portChainId) {
        checkNotNull(portChainId);
        return get(NeutronPortChain.class, uri("/sfc/port_chains/%s", portChainId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortChain update(String portChainId, PortChain portChain) {
        checkNotNull(portChainId);
        return put(NeutronPortChain.class, uri("/sfc/port_chains/%s", portChainId)).entity(portChain).execute();
    }
}
