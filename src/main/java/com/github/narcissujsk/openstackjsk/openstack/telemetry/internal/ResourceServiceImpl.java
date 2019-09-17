package com.github.narcissujsk.openstackjsk.openstack.telemetry.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.telemetry.ResourceService;
import com.github.narcissujsk.openstackjsk.model.telemetry.Resource;
import com.github.narcissujsk.openstackjsk.openstack.telemetry.domain.CeilometerResource;

/**
 * Provides Measurements for Telemetry resources within an OpenStack deployment
 * 
 * @author Shital Patil
 */
public class ResourceServiceImpl extends BaseTelemetryServices implements ResourceService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Resource> list() {
        CeilometerResource[] resources = get(CeilometerResource[].class, uri("/resources")).execute();
        return wrapList(resources);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Resource get(String resourceId) {
        checkNotNull(resourceId);
        CeilometerResource resource = get(CeilometerResource.class, uri("/resources/%s", resourceId)).execute();
        return resource;
    }

}
