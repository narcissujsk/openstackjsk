package com.github.narcissujsk.openstackjsk.model.manila.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.manila.ShareNetworkCreate;

/**
 * Builds a {@link ShareNetworkCreate}.
 *
 * @author Daniel Gonzalez Nothnagel
 */
public interface ShareNetworkCreateBuilder extends Buildable.Builder<ShareNetworkCreateBuilder, ShareNetworkCreate> {
    /**
     * Set the neutron network and subnet.
     *
     * @param neutronNetId the neutron network ID
     * @param neutronSubnetId the neutron subnet ID
     * @return ShareNetworkCreateBuilder
     */
    ShareNetworkCreateBuilder neutronNet(String neutronNetId, String neutronSubnetId);

    /**
     * Set the nova network.
     *
     * @param novaNetId the nova network ID
     * @return ShareNetworkCreateBuilder
     */
    ShareNetworkCreateBuilder novaNet(String novaNetId);

    /**
     * Set the share network name.
     *
     * @param name the share network name
     * @return ShareNetworkCreateBuilder
     */
    ShareNetworkCreateBuilder name(String name);

    /**
     * Set the share network description.
     *
     * @param description the share network description
     * @return ShareNetworkCreateBuilder
     */
    ShareNetworkCreateBuilder description(String description);
}
