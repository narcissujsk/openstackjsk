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

import com.github.narcissujsk.openstackjsk.api.dns.v2.RecordsetService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.dns.v2.Recordset;
import com.github.narcissujsk.openstackjsk.openstack.dns.v2.domain.DesignateRecordset;
import com.github.narcissujsk.openstackjsk.openstack.dns.v2.internal.BaseDNSServices;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.github.narcissujsk.openstackjsk.core.transport.ClientConstants.PATH_ZONES;
import static com.github.narcissujsk.openstackjsk.core.transport.ClientConstants.PATH_RECORDSETS;

public class RecordsetServiceImpl extends BaseDNSServices implements RecordsetService {

    @Override
    public Recordset get(String zoneId, String recordsetId) {
        checkNotNull(zoneId);
        checkNotNull(recordsetId);
        return get(DesignateRecordset.class, PATH_ZONES, "/", zoneId, PATH_RECORDSETS, "/", recordsetId).execute();
    }

    @Override
    public ActionResponse delete(String zoneId, String recordsetId) {
        checkNotNull(zoneId);
        checkNotNull(recordsetId);
        return deleteWithResponse(PATH_ZONES, "/", zoneId, PATH_RECORDSETS, "/", recordsetId).execute();
    }

    @Override
    public Recordset update(String zoneId, Recordset recordset) {
        checkNotNull(zoneId);
        checkNotNull(recordset);
        return put(DesignateRecordset.class, PATH_ZONES, "/", zoneId, PATH_RECORDSETS, "/", recordset.getId()).entity(recordset).execute();
    }

    @Override
    public Recordset create(String zoneId, Recordset recordset) {
        checkNotNull(zoneId);
        checkNotNull(recordset);
        return post(DesignateRecordset.class, PATH_ZONES, "/", zoneId, PATH_RECORDSETS).entity(recordset).execute();
    }

    @Override
    public Recordset create(String zoneId, String name, String type, List<String> records) {
        checkNotNull(zoneId);
        checkNotNull(name);
        checkNotNull(type);
        checkNotNull(records);
        return create(zoneId, DesignateRecordset.builder().name(name).type(type).records(records).build());
    }

    @Override
    public List<? extends Recordset> list(String zoneId) {
        checkNotNull(zoneId);
        return get(DesignateRecordset.Recordsets.class, PATH_ZONES, "/", zoneId, PATH_RECORDSETS).execute().getList();
    }

    @Override
    public List<? extends Recordset> list() {
        return get(DesignateRecordset.Recordsets.class, uri(PATH_RECORDSETS)).execute().getList();
    }

}
