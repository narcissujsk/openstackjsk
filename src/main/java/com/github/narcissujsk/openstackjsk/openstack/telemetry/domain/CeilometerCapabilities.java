package com.github.narcissujsk.openstackjsk.openstack.telemetry.domain;

import java.util.Map;

import com.github.narcissujsk.openstackjsk.model.telemetry.Capabilities;

/**
 * A single Representation for capabilities.
 * 
 * @author Shital Patil
 */

public class CeilometerCapabilities implements Capabilities {

    private static final long serialVersionUID = 1L;

    Map<String, Boolean> api;

    Map<String, Boolean> storage;

    Map<String, Boolean> eventStorage;

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, Boolean> getAPI() {
        return api;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, Boolean> getStorage() {
        return storage;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, Boolean> getEventStorage() {
        return eventStorage;
    }

}
