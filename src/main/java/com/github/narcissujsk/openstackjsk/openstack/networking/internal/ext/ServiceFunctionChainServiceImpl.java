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

import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.networking.ext.FlowClassifierService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.PortChainService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.PortPairGroupService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.PortPairService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.ServiceFunctionChainService;
import com.github.narcissujsk.openstackjsk.openstack.networking.internal.BaseNetworkingServices;

/**
 * {@inheritDoc}
 */
public class ServiceFunctionChainServiceImpl extends BaseNetworkingServices implements ServiceFunctionChainService {

    /**
     * {@inheritDoc}
     */
    @Override
    public FlowClassifierService flowclassifiers() {
        return Apis.get(FlowClassifierService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortPairService portpairs() {
        return Apis.get(PortPairService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortPairGroupService portpairgroups() {
        return Apis.get(PortPairGroupService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortChainService portchains() {
        return Apis.get(PortChainService.class);
    }
}
