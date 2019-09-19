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

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.networking.ext.NetQuotaService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.network.NetQuota;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.NeutronNetQuota;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.NeutronNetQuota.NeutronNetQuotas;
import com.github.narcissujsk.openstackjsk.openstack.networking.internal.BaseNetworkingServices;

/**
 * Networking (Neutron) Quota Extension API
 * 
 * @author Jeremy Unruh
 */
public class NetQuotaServiceImpl extends BaseNetworkingServices implements NetQuotaService {

    @Override
    public List<? extends NetQuota> get() {
        return get(NeutronNetQuotas.class, uri("/quotas")).execute().getList();
    }
    
    @Override
    public NetQuota get(String tenantId) {
        checkNotNull(tenantId, "TenantId must not be null");
        return get(NeutronNetQuota.class, uri("/quotas/%s", tenantId)).execute();
    }
    
    @Override
    public NetQuota updateForTenant(String tenantId, NetQuota netQuota) {
        checkNotNull(tenantId, "TenantId must not be null");
        checkNotNull(netQuota, "NetQuota must not be null");
        return put(NeutronNetQuota.class, uri("/quotas/%s", tenantId)).entity(netQuota).execute();
    }

    @Override
    public NetQuota update(NetQuota netQuota) {
        checkNotNull(netQuota, "NetQuota must not be null");
        return put(NeutronNetQuota.class, uri("/quotas")).entity(netQuota).execute();
    }

    @Override
    public ActionResponse reset() {
        return deleteWithResponse(uri("/quotas")).execute();
    }
    
    @Override
    public ActionResponse reset(String tenantId) {
        checkNotNull(tenantId, "TenantId must not be null");
        return deleteWithResponse(uri("/quotas/%s", tenantId)).execute();
    }

}
