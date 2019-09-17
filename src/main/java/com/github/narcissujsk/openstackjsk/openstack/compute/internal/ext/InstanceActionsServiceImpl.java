package com.github.narcissujsk.openstackjsk.openstack.compute.internal.ext;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.compute.ext.InstanceActionsService;
import com.github.narcissujsk.openstackjsk.model.compute.InstanceAction;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaInstanceAction;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaInstanceAction.NovaInstanceActions;
import com.github.narcissujsk.openstackjsk.openstack.compute.internal.BaseComputeServices;

/**
 * API to list executed instance actions.
 * 
 * @author Christian Banse
 */
public class InstanceActionsServiceImpl extends BaseComputeServices implements InstanceActionsService {

    @Override
    public List<? extends InstanceAction> list(String serverId) {
        checkNotNull(serverId, "serverId");
        return get(NovaInstanceActions.class, uri("/servers/%s/os-instance-actions", serverId)).execute().getList();
    }

    @Override
    public InstanceAction get(String serverId, String requestId) {
        checkNotNull(serverId, "serverId");
        checkNotNull(requestId, "requestId");
        return get(NovaInstanceAction.class, uri("/servers/%s/os-instance-actions/%s", serverId, requestId)).execute();
    }

}
