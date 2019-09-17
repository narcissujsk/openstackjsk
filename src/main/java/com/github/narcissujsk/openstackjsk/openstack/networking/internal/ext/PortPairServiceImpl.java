package com.github.narcissujsk.openstackjsk.openstack.networking.internal.ext;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.networking.ext.PortPairService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.network.ext.PortPair;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.ext.NeutronPortPair;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.ext.NeutronPortPair.PortPairs;
import com.github.narcissujsk.openstackjsk.openstack.networking.internal.BaseNetworkingServices;

/**
 * {@inheritDoc}
 */
public class PortPairServiceImpl extends BaseNetworkingServices implements PortPairService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends PortPair> list() {
        return get(PortPairs.class, uri("/sfc/port_pairs")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortPair create(PortPair portPair) {
        checkNotNull(portPair);
        return post(NeutronPortPair.class, uri("/sfc/port_pairs")).entity(portPair).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String portPairId) {
        checkNotNull(portPairId);
        return deleteWithResponse(uri("/sfc/port_pairs/%s", portPairId  )).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortPair get(String portPairId) {
        checkNotNull(portPairId);
        return get(NeutronPortPair.class, uri("/sfc/port_pairs/%s", portPairId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortPair update(String portPairId, PortPair portPair) {
        checkNotNull(portPairId);
        return put(NeutronPortPair.class, uri("/sfc/port_pairs/%s", portPairId)).entity(portPair).execute();
    }
}
