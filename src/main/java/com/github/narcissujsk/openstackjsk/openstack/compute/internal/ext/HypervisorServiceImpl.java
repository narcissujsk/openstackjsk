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

import com.github.narcissujsk.openstackjsk.api.compute.ext.HypervisorService;
import com.github.narcissujsk.openstackjsk.model.compute.ext.Hypervisor;
import com.github.narcissujsk.openstackjsk.model.compute.ext.HypervisorStatistics;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.ext.ExtHypervisor;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.ext.ExtHypervisor.Hypervisors;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.ext.ExtHypervisorStatistics;
import com.github.narcissujsk.openstackjsk.openstack.compute.internal.BaseComputeServices;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Implementation for the OSHypervisors.
 */
public class HypervisorServiceImpl extends BaseComputeServices implements HypervisorService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Hypervisor> list() {
        return get(Hypervisors.class, "/os-hypervisors/detail").execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HypervisorStatistics statistics() {
        return get(ExtHypervisorStatistics.class, "/os-hypervisors/statistics").execute();
    }

    /**
     * <p>Description:Get the specified Hypervisor by ID</p>
     * <p>Author:Wang Ting/王婷</p>
     *
     * @param hypervisorId the UUID of the hypervisor
     * @return the hypervisor
     */
    @Override
    public Hypervisor get(String hypervisorId) {
        checkNotNull(hypervisorId);
        return get(ExtHypervisor.class, uri("/os-hypervisors/%s", hypervisorId)).execute();
    }
}
