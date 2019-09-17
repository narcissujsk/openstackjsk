package com.github.narcissujsk.openstackjsk.openstack.barbican.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.common.collect.ImmutableMap;
import com.github.narcissujsk.openstackjsk.api.barbican.ContainerService;
import com.github.narcissujsk.openstackjsk.model.barbican.Container;
import com.github.narcissujsk.openstackjsk.model.barbican.ContainerSecret;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.openstack.barbican.domain.BarbicanContainer;
import com.github.narcissujsk.openstackjsk.openstack.barbican.domain.BarbicanContainer.Containers;

import java.util.List;
import java.util.Map;

/**
 * {@inheritDoc}
 */
public class ContainerServiceImpl extends BaseBarbicanServices implements ContainerService {

    private static final String RESOURCE_PATH = "/containers";
    private static final String SPECIFIC_RESOURCE_PATH = RESOURCE_PATH + "/%s";

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Container> list(Map<String, String> filteringParams) {
        Invocation<Containers> req = get(Containers.class, uri(RESOURCE_PATH));
        if (filteringParams != null) {
            for (Map.Entry<String, String> entry : filteringParams.entrySet()) {
                req = req.param(entry.getKey(), entry.getValue());
            }
        }
        return req.execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Container> list(final String name) {
        return list(ImmutableMap.of("name", name));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Container get(final String containerId) {
        checkNotNull(containerId);
        return get(BarbicanContainer.class, uri(SPECIFIC_RESOURCE_PATH, containerId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(final String containerId) {
        checkNotNull(containerId);
        return deleteWithResponse(uri(SPECIFIC_RESOURCE_PATH, containerId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Container create(final Container container) {
        checkNotNull(container);
        return post(BarbicanContainer.class, uri(RESOURCE_PATH)).entity(container).execute();
    }
}
