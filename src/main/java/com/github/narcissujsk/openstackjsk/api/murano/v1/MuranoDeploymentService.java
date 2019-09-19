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
package com.github.narcissujsk.openstackjsk.api.murano.v1;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.murano.v1.domain.Deployment;
import com.github.narcissujsk.openstackjsk.model.murano.v1.domain.Report;

import java.util.List;

/**
 * @author Nikolay Mahotkin.
 */
public interface MuranoDeploymentService extends RestService {
    /**
     * List all the deployments of the environment.
     *
     * @param environmentId The environment id.
     * @return Deployment list.
     */
    List<? extends Deployment> list(String environmentId);

    /**
     * Get the reports (deployment logs) of the specified deployment.
     *
     * @param environmentId environment id.
     * @param deploymentId deployment id.
     * @param serviceIds (optional) list of service ids.
     * @return Report list.
     */
    List<? extends Report> reports(String environmentId, String deploymentId, List<String> serviceIds);
    List<? extends Report> reports(String environmentId, String deploymentId);
}
