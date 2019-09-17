package com.github.narcissujsk.openstackjsk.openstack.identity.v2.internal;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.github.narcissujsk.openstackjsk.core.transport.ClientConstants.PATH_TENANTS;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.identity.v2.TenantService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.identity.v2.Tenant;
import com.github.narcissujsk.openstackjsk.model.identity.v2.TenantUser;
import com.github.narcissujsk.openstackjsk.openstack.identity.v2.domain.KeystoneTenant;
import com.github.narcissujsk.openstackjsk.openstack.identity.v2.domain.KeystoneTenant.BackwardsCompatTenants;
import com.github.narcissujsk.openstackjsk.openstack.identity.v2.domain.KeystoneTenant.Tenants;
import com.github.narcissujsk.openstackjsk.openstack.identity.v2.domain.KeystoneTenantUser.TenantUsers;
import com.github.narcissujsk.openstackjsk.openstack.internal.BaseOpenStackService;

public class TenantServiceImpl extends BaseOpenStackService implements TenantService  {

	
	@Override
	public List<? extends Tenant> list() {
		return get(Tenants.class, PATH_TENANTS).execute().getList();
	}

	@Override
	public Tenant get(String tenantId) {
		checkNotNull(tenantId);
		return get(KeystoneTenant.class, PATH_TENANTS, "/", tenantId).execute();
	}

	@Override
	public Tenant getByName(String tenantName) {
		checkNotNull(tenantName);
		return get(BackwardsCompatTenants.class, PATH_TENANTS).param("name", tenantName).execute().getOneOrNull();
	}

	@Override
	public Tenant create(Tenant tenant) {
		checkNotNull(tenant);
		return post(KeystoneTenant.class, PATH_TENANTS).entity(tenant).execute();
	}

	@Override
	public ActionResponse delete(String tenantId) {
		checkNotNull(tenantId);
		return deleteWithResponse(PATH_TENANTS, "/", tenantId).execute();
	}

	@Override
	public Tenant update(Tenant tenant) {
		checkNotNull(tenant);
		return post(KeystoneTenant.class, uri("/tenants/%s", tenant.getId())).entity(tenant).execute();
	}

    @Override
    public List<? extends TenantUser> listUsers(String tenantId) {
        checkNotNull(tenantId);
        return get(TenantUsers.class, uri("/tenants/%s/users", tenantId)).execute().getList();
    }
}
