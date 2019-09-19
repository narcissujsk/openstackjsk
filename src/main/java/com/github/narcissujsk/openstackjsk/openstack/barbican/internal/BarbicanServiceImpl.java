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
package com.github.narcissujsk.openstackjsk.openstack.barbican.internal;

import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.barbican.BarbicanService;
import com.github.narcissujsk.openstackjsk.api.barbican.ContainerService;
import com.github.narcissujsk.openstackjsk.api.barbican.SecretService;

/**
 * This class contains getters for all implementation of the available Barbican services
 */
public class BarbicanServiceImpl extends BaseBarbicanServices implements BarbicanService {

    @Override
    public ContainerService containers() {
        return Apis.get(ContainerService.class);
    }

    @Override
    public SecretService secrets() { return Apis.get(SecretService.class); }
}
