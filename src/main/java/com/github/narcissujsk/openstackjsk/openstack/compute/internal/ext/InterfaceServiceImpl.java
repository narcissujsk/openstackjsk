package com.github.narcissujsk.openstackjsk.openstack.compute.internal.ext;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.compute.ext.InterfaceService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.compute.InterfaceAttachment;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaInterfaceAttachment;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaInterfaceAttachment.NovaInterfaceAttachments;
import com.github.narcissujsk.openstackjsk.openstack.compute.internal.BaseComputeServices;

/**
 * API to Create, list, get details for, and delete port interfaces on a Server Instance
 * 
 * @author Jeremy Unruh
 */
public class InterfaceServiceImpl extends BaseComputeServices  implements InterfaceService {

    @Override
    public InterfaceAttachment create(String serverId, String portId) {
        checkNotNull(serverId, "serverId");
        checkNotNull(portId, "portId");
        return post(NovaInterfaceAttachment.class, uri("/servers/%s/os-interface", serverId))
                 .entity(new NovaInterfaceAttachment(portId))
                 .execute();
    }

    @Override
    public List<? extends InterfaceAttachment> list(String serverId) {
        checkNotNull(serverId, "serverId");
        return get(NovaInterfaceAttachments.class , uri("/servers/%s/os-interface", serverId))
                  .execute().getList();
    }

    @Override
    public InterfaceAttachment get(String serverId, String attachmentId) {
        checkNotNull(serverId, "serverId");
        checkNotNull(attachmentId, "attachmentId");
        return get(NovaInterfaceAttachment.class, uri("/servers/%s/os-interface/%s", serverId, attachmentId)).execute();
    }

    @Override
    public ActionResponse detach(String serverId, String attachmentId) {
        checkNotNull(serverId, "serverId");
        checkNotNull(attachmentId, "attachmentId");
        return delete(ActionResponse.class, uri("/servers/%s/os-interface/%s", serverId, attachmentId)).execute();
    }

}
