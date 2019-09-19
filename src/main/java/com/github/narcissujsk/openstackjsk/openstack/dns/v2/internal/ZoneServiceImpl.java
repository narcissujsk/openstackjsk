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
package com.github.narcissujsk.openstackjsk.openstack.dns.v2.internal;

import com.github.narcissujsk.openstackjsk.api.dns.v2.ZoneService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.dns.v2.Nameserver;
import com.github.narcissujsk.openstackjsk.model.dns.v2.Zone;
import com.github.narcissujsk.openstackjsk.openstack.dns.v2.domain.DesignateNameserver;
import com.github.narcissujsk.openstackjsk.openstack.dns.v2.domain.DesignateZone;
import com.github.narcissujsk.openstackjsk.openstack.dns.v2.internal.BaseDNSServices;
import com.github.narcissujsk.openstackjsk.openstack.internal.BaseOpenStackService;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.github.narcissujsk.openstackjsk.core.transport.ClientConstants.PATH_ZONES;
import static com.github.narcissujsk.openstackjsk.core.transport.ClientConstants.PATH_NAMESERVERS;

public class ZoneServiceImpl extends BaseDNSServices implements ZoneService {

    @Override
    public Zone get(String zoneId) {
        checkNotNull(zoneId);
        return get(DesignateZone.class, PATH_ZONES, "/", zoneId).execute();
    }

    @Override
    public ActionResponse delete(String zoneId) {
        checkNotNull(zoneId);
        return deleteWithResponse(PATH_ZONES, "/", zoneId).execute();
    }

    @Override
    public List<? extends Nameserver> listNameservers(String zoneId) {
        checkNotNull(zoneId);
        return get(DesignateNameserver.Nameservers.class, PATH_ZONES, "/",zoneId, PATH_NAMESERVERS).execute().getList();
    }

    @Override
    public Zone update(Zone zone) {
        checkNotNull(zone);
        return patch(DesignateZone.class, PATH_ZONES, "/", zone.getId()).entity(zone).execute();
    }

    @Override
    public Zone create(Zone zone) {
        checkNotNull(zone);
        return post(DesignateZone.class, uri(PATH_ZONES)).entity(zone).execute();
    }

    @Override
    public Zone create(String name, String email) {
        checkNotNull(name);
        checkNotNull(email);
        return create(DesignateZone.builder().name(name).email(email).build());
    }

    @Override
    public List<? extends Zone> list() {
        return get(DesignateZone.Zones.class, uri(PATH_ZONES)).execute().getList();
    }

}
