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

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.compute.ext.ZoneService;
import com.github.narcissujsk.openstackjsk.model.compute.ext.AvailabilityZone;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.ext.ExtAvailabilityZone.AvailabilityZones;
import com.github.narcissujsk.openstackjsk.openstack.compute.internal.BaseComputeServices;

/**
 * Service implementation for ZoneService API
 */
public class ZoneServiceImpl extends BaseComputeServices implements ZoneService {

    @Override
    public List<? extends AvailabilityZone> list() {
        return list(Boolean.FALSE);
    }

    @Override
    public List<? extends AvailabilityZone> list(boolean detailed) {
        String uri = (detailed) ? "/os-availability-zone/detail" : "/os-availability-zone";
        return get(AvailabilityZones.class, uri).execute().getList();
    }
}
