package com.github.narcissujsk.openstackjsk.model.network.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.network.Network;
import com.github.narcissujsk.openstackjsk.model.network.NetworkType;

/**
 * A Builder which creates a Network
 * 
 * @author Jeremy Unruh
 */
public interface NetworkBuilder extends Builder<NetworkBuilder, Network> {

	/**
	 * @see Network#getName()
	 */
	NetworkBuilder name(String name);
	
	/**
	 * @see Network#isAdminStateUp()
	 */
	NetworkBuilder adminStateUp(boolean adminStateUp);
	
	/**
	 * @see Network#getNetworkType()
	 */	
	NetworkBuilder networkType(NetworkType networkType);
	
	/**
	 * @see Network#getProviderPhyNet()
	 */
	NetworkBuilder physicalNetwork(String providerPhysicalNetwork);
	
	/**
	 * @see Network#getProviderSegID()
	 */
	NetworkBuilder segmentId(String providerSegmentationId);
	
	/**
	 * @see Network#getTenantId()
	 */
	NetworkBuilder tenantId(String tenantId);

	/**
	 * @see Network#isShared()
	 */
	NetworkBuilder isShared(boolean shared);
	
	/**
	 * @see Network#isRouterExternal()
	 */
	NetworkBuilder isRouterExternal(boolean routerExternal);
	
	/**
	 * @see Network#getAvailabilityZoneHints()
	 */
	NetworkBuilder addAvailabilityZoneHints(String availabilityZone);
}
