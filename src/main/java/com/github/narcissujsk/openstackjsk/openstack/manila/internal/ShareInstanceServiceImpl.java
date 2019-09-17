package com.github.narcissujsk.openstackjsk.openstack.manila.internal;

import com.github.narcissujsk.openstackjsk.api.manila.ShareInstanceService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.manila.ShareInstance;
import com.github.narcissujsk.openstackjsk.openstack.compute.functions.ToActionResponseFunction;
import com.github.narcissujsk.openstackjsk.openstack.manila.domain.ManilaShareInstance;
import com.github.narcissujsk.openstackjsk.openstack.manila.domain.actions.ShareInstanceActions;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

public class ShareInstanceServiceImpl extends BaseShareServices implements ShareInstanceService {
    @Override
    public List<? extends ShareInstance> list() {
        return get(ManilaShareInstance.ShareInstances.class, uri("/share_instances"))
                .execute()
                .getList();
    }

    @Override
    public ShareInstance get(String shareInstanceId) {
        checkNotNull(shareInstanceId);
        return get(ManilaShareInstance.class, uri("/share_instances/%s", shareInstanceId)).execute();
    }

    @Override
    public ActionResponse resetState(String shareInstanceId, ShareInstance.Status status) {
        checkNotNull(shareInstanceId);
        checkNotNull(status);

        return ToActionResponseFunction.INSTANCE.apply(
                post(Void.class, uri("/share_instances/%s/action", shareInstanceId))
                        .entity(ShareInstanceActions.resetState(status))
                        .executeWithResponse());
    }

    @Override
    public ActionResponse forceDelete(String shareInstanceId) {
        checkNotNull(shareInstanceId);

        return ToActionResponseFunction.INSTANCE.apply(
                post(Void.class, uri("/share_instances/%s/action", shareInstanceId))
                        .entity(ShareInstanceActions.forceDelete())
                        .executeWithResponse());
    }
}
