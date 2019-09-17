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
