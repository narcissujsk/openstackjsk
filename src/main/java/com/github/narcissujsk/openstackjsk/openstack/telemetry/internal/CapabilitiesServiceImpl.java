package com.github.narcissujsk.openstackjsk.openstack.telemetry.internal;

import com.github.narcissujsk.openstackjsk.api.telemetry.CapabilitiesService;
import com.github.narcissujsk.openstackjsk.model.telemetry.Capabilities;
import com.github.narcissujsk.openstackjsk.openstack.telemetry.domain.CeilometerCapabilities;

/**
 * Provides Measurements for Telemetry capabilities within an OpenStack deployment
 * 
 * @author Shital Patil
 */
public class CapabilitiesServiceImpl extends BaseTelemetryServices implements CapabilitiesService {

    /**
     * {@inheritDoc}
     */
    @Override
    public Capabilities get() {
        CeilometerCapabilities capabilities = get(CeilometerCapabilities.class, uri("/capabilities")).execute();
        return capabilities;
    }

}
