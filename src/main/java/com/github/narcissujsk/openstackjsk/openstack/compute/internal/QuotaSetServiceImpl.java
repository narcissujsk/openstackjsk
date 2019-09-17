package com.github.narcissujsk.openstackjsk.openstack.compute.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.compute.QuotaSetService;
import com.github.narcissujsk.openstackjsk.model.compute.Limits;
import com.github.narcissujsk.openstackjsk.model.compute.QuotaSet;
import com.github.narcissujsk.openstackjsk.model.compute.QuotaSetUpdate;
import com.github.narcissujsk.openstackjsk.model.compute.SimpleTenantUsage;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaLimits;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaQuotaSet;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaQuotaSet.NovaQuotaSetClass;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaQuotaSetUpdate.NovaQuotaSetUpdateClass;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaQuotaSetUpdate.NovaQuotaSetUpdateTenant;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaSimpleTenantUsage;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaSimpleTenantUsage.NovaSimpleTenantUsages;

/**
 * OpenStack Quota-Set API Implementation
 * 
 * @author Jeremy Unruh
 */
public class QuotaSetServiceImpl extends BaseComputeServices implements QuotaSetService {

    /**
     * {@inheritDoc}
     */
    @Override
    public QuotaSet get(String tenantId) {
        return get(tenantId, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuotaSet get(String tenantId, String userId) {
        checkNotNull(tenantId);
        String uri = (userId != null) ? uri("/os-quota-sets/%s?user_id=%s", tenantId, userId) : uri("/os-quota-sets/%s", tenantId);
        return get(NovaQuotaSet.class, uri).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuotaSet updateForClass(String classId, QuotaSetUpdate qs) {
        checkNotNull(classId);
        checkNotNull(qs);

        return put(NovaQuotaSetClass.class, uri("/os-quota-class-sets/%s", classId)).entity(NovaQuotaSetUpdateClass.from(qs)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuotaSet updateForTenant(String tenantId, QuotaSetUpdate qs) {
        checkNotNull(tenantId);
        checkNotNull(qs);

        return put(NovaQuotaSet.class, uri("/os-quota-sets/%s", tenantId)).entity(NovaQuotaSetUpdateTenant.from(qs)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Limits limits() {
        return get(NovaLimits.class, uri("/limits")).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends SimpleTenantUsage> listTenantUsages() {
        return get(NovaSimpleTenantUsages.class, uri("/os-simple-tenant-usage")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SimpleTenantUsage getTenantUsage(String tenantId) {
        checkNotNull(tenantId);
        return get(NovaSimpleTenantUsage.class, uri("/os-simple-tenant-usage/%s", tenantId)).execute();
    }
    
    /**
     * {@inheritDoc}
     */
	@Override
	public List<? extends SimpleTenantUsage> listTenantUsages(String startTime,
			String endTime) {
		checkNotNull(startTime);
		checkNotNull(endTime);
		return get(NovaSimpleTenantUsages.class, uri("/os-simple-tenant-usage"))
				.param("start", startTime)
				.param("end", endTime)
				.execute().getList();
	}
	
	/**
     * {@inheritDoc}
     */
	@Override
	public SimpleTenantUsage getTenantUsage(String tenantId, String startTime,
			String endTime) {
		checkNotNull(tenantId);
		checkNotNull(startTime);
		checkNotNull(endTime);
        return get(NovaSimpleTenantUsage.class, uri("/os-simple-tenant-usage/%s", tenantId))
        		.param("start", startTime)
				.param("end", endTime)
				.param("detailed", "1")
        		.execute();
	}
}
