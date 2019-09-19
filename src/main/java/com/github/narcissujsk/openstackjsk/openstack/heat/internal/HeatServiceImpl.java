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
package com.github.narcissujsk.openstackjsk.openstack.heat.internal;


import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.heat.EventsService;
import com.github.narcissujsk.openstackjsk.api.heat.HeatService;
import com.github.narcissujsk.openstackjsk.api.heat.ResourcesService;
import com.github.narcissujsk.openstackjsk.api.heat.SoftwareConfigService;
import com.github.narcissujsk.openstackjsk.api.heat.StackService;
import com.github.narcissujsk.openstackjsk.api.heat.TemplateService;
import com.github.narcissujsk.openstackjsk.openstack.heat.internal.BaseHeatServices;

/**
 * This class contains getters for all implementation of the available Heat services
 * 
 * @author Matthias Reisser
 */
public class HeatServiceImpl extends BaseHeatServices implements HeatService {

	@Override
	public StackService stacks() {
		return Apis.get(StackService.class);
	}

	@Override
	public TemplateService templates() {
		return Apis.get(TemplateService.class);
	}

	@Override
	public EventsService events() {
		return Apis.get(EventsService.class);
	}

	@Override
	public ResourcesService resources() {
		return Apis.get(ResourcesService.class);
	}

    @Override
    public SoftwareConfigService softwareConfig() {
        return Apis.get(SoftwareConfigService.class);
    }
	

}
