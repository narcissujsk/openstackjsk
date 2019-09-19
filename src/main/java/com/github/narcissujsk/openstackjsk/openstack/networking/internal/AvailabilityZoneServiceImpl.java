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
package com.github.narcissujsk.openstackjsk.openstack.networking.internal;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.networking.AvailabilityZoneService;
import com.github.narcissujsk.openstackjsk.model.network.AvailabilityZone;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.NeutronAvailabilityZone.AvailabilityZones;


/**
 * Availability Zone Service
 * 
 * @author Taemin
 *
 */
public class AvailabilityZoneServiceImpl extends BaseNetworkingServices implements AvailabilityZoneService {

    /**
     * List all availability zone that the current neutron has
     * {@inheritDoc}
     * @author Taemin
     */
	@Override
	public List<? extends AvailabilityZone> list() {		
		return get(AvailabilityZones.class, uri("/availability_zones")).execute().getList();	
	}

   
}
