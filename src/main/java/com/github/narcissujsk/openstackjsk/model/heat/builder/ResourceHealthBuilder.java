package com.github.narcissujsk.openstackjsk.model.heat.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.heat.ResourceHealth;

/**
 * This interface describes a builder for {@link ResourceHealth} objects
 *
 * @author Dan Maas
 */
public interface ResourceHealthBuilder extends Buildable.Builder<ResourceHealthBuilder, ResourceHealth> {

    /**
     * Set the unhealthy status of the resource.
     *
     * @param markUnhealthy
     * @return
     */
    ResourceHealthBuilder markUnhealthy(boolean markUnhealthy);

    /**
     * Set the resource status reason on the resource.
     *
     * @param resourceStatusReason
     * @return
     */
    ResourceHealthBuilder resourceStatusReason(String resourceStatusReason);
}
