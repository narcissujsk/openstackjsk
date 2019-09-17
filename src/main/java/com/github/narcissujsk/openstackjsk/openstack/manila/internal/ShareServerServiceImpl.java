package com.github.narcissujsk.openstackjsk.openstack.manila.internal;

import com.github.narcissujsk.openstackjsk.api.manila.ShareServerService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.manila.ShareServer;
import com.github.narcissujsk.openstackjsk.openstack.compute.functions.ToActionResponseFunction;
import com.github.narcissujsk.openstackjsk.openstack.manila.domain.ManilaShareServer;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

public class ShareServerServiceImpl extends BaseShareServices implements ShareServerService {
    @Override
    public List<? extends ShareServer> list() {
        return get(ManilaShareServer.ShareServers.class, uri("/share-servers"))
                .execute()
                .getList();
    }

    @Override
    public ShareServer get(String shareServerId) {
        checkNotNull(shareServerId);
        return get(ManilaShareServer.class, uri("/share-servers/%s", shareServerId)).execute();
    }

    @Override
    public ActionResponse delete(String shareServerId) {
        checkNotNull(shareServerId);
        return ToActionResponseFunction.INSTANCE.apply(
                delete(Void.class, uri("/share-servers/%s", shareServerId)).executeWithResponse());
    }
}
