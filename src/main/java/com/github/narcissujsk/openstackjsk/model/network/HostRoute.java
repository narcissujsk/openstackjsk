package com.github.narcissujsk.openstackjsk.model.network;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

/**
 * A Network Host based Routing Entry
 * 
 * @author Jeremy Unruh
 */
public interface HostRoute extends ModelEntity {

	/**
	 * Gets the destination for the route
	 *
	 * @return the destination host for this host route
	 */
	String getDestination();

	/**
	 * Gets the NextHop for this route
	 *
	 * @return the NextHop for this host route
	 */
	String getNexthop();
}
