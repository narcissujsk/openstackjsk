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
package com.github.narcissujsk.openstackjsk.api.compute.ext;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.compute.ext.Hypervisor;
import com.github.narcissujsk.openstackjsk.model.compute.ext.HypervisorStatistics;

import java.util.List;

/**
 * API which supports the "os-hypervisors" extension.  For more details
 *
 * @author Jeremy Unruh
 * @See http://developer.openstack.org/api-ref-compute-v2-ext.html#ext-os-hypervisors
 */
public interface HypervisorService extends RestService {

    /**
     * The Hypervisors for this OpenStack deployment.
     * <p>
     * NOTE: This is an extension and not all deployments support os-hypervisors
     *
     * @return the available hypervisors in detail
     */
    List<? extends Hypervisor> list();

    /**
     * The Hypervisor Statistics for this OpenStack Deployment
     * <p>
     * NOTE: This is an extension and not all deployments support os-hypervisors
     *
     * @return the hypervisor statistics
     */
    HypervisorStatistics statistics();

    /**
     * Get the specified Hypervisor by ID
     * Author:Wang Ting
     *
     * @param hypervisorId the hypervisor identifier
     * @return the Hypervisor or null if not found
     */
    Hypervisor get(String hypervisorId);
}
