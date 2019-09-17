package com.github.narcissujsk.openstackjsk.openstack.identity.v2.internal;

import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.identity.v2.IdentityService;
import com.github.narcissujsk.openstackjsk.api.identity.v2.RoleService;
import com.github.narcissujsk.openstackjsk.api.identity.v2.ServiceManagerService;
import com.github.narcissujsk.openstackjsk.api.identity.v2.TenantService;
import com.github.narcissujsk.openstackjsk.api.identity.v2.UserService;
import com.github.narcissujsk.openstackjsk.model.common.Extension;
import com.github.narcissujsk.openstackjsk.model.identity.v2.Endpoint;
import com.github.narcissujsk.openstackjsk.openstack.common.ExtensionValue.ExtensionList;
import com.github.narcissujsk.openstackjsk.openstack.identity.v2.domain.KeystoneEndpoint.Endpoints;
import com.github.narcissujsk.openstackjsk.openstack.internal.BaseOpenStackService;
import com.github.narcissujsk.openstackjsk.openstack.internal.OSClientSession;

import java.util.List;

import static com.github.narcissujsk.openstackjsk.core.transport.ClientConstants.PATH_EXTENSIONS;

public class IdentityServiceImpl extends BaseOpenStackService implements IdentityService {

	@Override
	public TenantService tenants() {
		return Apis.get(TenantService.class);
	}

	@Override
	public UserService users() {
		return Apis.get(UserService.class);
	}

	@Override
	public List<? extends Extension> listExtensions() {
		return get(ExtensionList.class, PATH_EXTENSIONS).execute().getList();
	}

	@Override
	public RoleService roles() {
		return Apis.get(RoleService.class);
	}

	@Override
	public ServiceManagerService services() {
		return Apis.get(ServiceManagerService.class);
	}

	@Override
	public List<? extends Endpoint> listTokenEndpoints() {
		return get(Endpoints.class, uri("/tokens/%s/endpoints", OSClientSession.OSClientSessionV2.getCurrent().getTokenId())).execute().getList();
	}
	
}
