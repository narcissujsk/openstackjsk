package com.github.narcissujsk.openstackjsk.openstack.networking.internal.ext;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.networking.ext.PortPairGroupService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.network.ext.PortPairGroup;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.ext.NeutronPortPairGroup;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.ext.NeutronPortPairGroup.PortPairGroups;
import com.github.narcissujsk.openstackjsk.openstack.networking.internal.BaseNetworkingServices;

/**
 * {@inheritDoc}
 */
public class PortPairGroupServiceImpl extends BaseNetworkingServices implements PortPairGroupService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends PortPairGroup> list() {
        return get(PortPairGroups.class, uri("/sfc/port_pair_groups")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortPairGroup create(PortPairGroup portPairGroup) {
        checkNotNull(portPairGroup);
        return post(NeutronPortPairGroup.class, uri("/sfc/port_pair_groups")).entity(portPairGroup).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String portPairGroupId) {
        checkNotNull(portPairGroupId);
        return deleteWithResponse(uri("/sfc/port_pair_groups/%s", portPairGroupId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortPairGroup get(String portPairGroupId) {
        checkNotNull(portPairGroupId);
        return get(NeutronPortPairGroup.class, uri("/sfc/port_pair_groups/%s", portPairGroupId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortPairGroup update(String portPairGroupId, PortPairGroup portPairGroup) {
        checkNotNull(portPairGroupId);
        return put(NeutronPortPairGroup.class, uri("/sfc/port_pair_groups/%s", portPairGroupId)).entity(portPairGroup).execute();
    }
}
