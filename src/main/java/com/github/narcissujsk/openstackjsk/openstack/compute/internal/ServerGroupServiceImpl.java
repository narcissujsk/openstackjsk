package com.github.narcissujsk.openstackjsk.openstack.compute.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.compute.ServerGroupService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.compute.ServerGroup;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaServerGroup;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaServerGroup.ServerGroups;

public class ServerGroupServiceImpl extends BaseComputeServices implements ServerGroupService {

	@Override
	public List<? extends ServerGroup> list() {
		return get(ServerGroups.class, uri("/os-server-groups")).execute().getList();
	}

	@Override
	public ServerGroup get(String id) {
		checkNotNull(id);
		return get(NovaServerGroup.class, uri("/os-server-groups/%s", id)).execute();
	}

	@Override
	public ActionResponse delete(String id) {
		checkNotNull(id);
		return deleteWithResponse(uri("/os-server-groups/%s", id)).execute();
	}

	@Override
	public ServerGroup create(String name, String policy) {
		NovaServerGroup nsg = NovaServerGroup.create(name, policy);
		return  post(NovaServerGroup.class, uri("/os-server-groups")).entity(nsg).execute();
	}

}
