package com.github.narcissujsk.openstackjsk.model.network;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.common.Resource;
import com.github.narcissujsk.openstackjsk.model.network.ExternalGateway;
import com.github.narcissujsk.openstackjsk.model.network.HostRoute;
import com.github.narcissujsk.openstackjsk.model.network.State;
import com.github.narcissujsk.openstackjsk.model.network.builder.RouterBuilder;

/**
 * A router is used to interconnect subnets and forward traffic among them. Another feature of the router is to NAT internal traffic to external networks.
 * 
 * @author Jeremy Unruh
 */
public interface Router extends Resource, Buildable<RouterBuilder> {

	/**
	 * Host Routing entries for the router
	 *
	 * @return the routes for the router
	 */
	List<? extends HostRoute> getRoutes();
	
	/**
	 * Administrative state of the router
	 *
	 * @return true, if the administrative state is up
	 */
	boolean isAdminStateUp();
	
	/**
	 * Indicates whether a router is currently operational or not
	 *
	 * @return the state/status of the router
	 */
	State getStatus();
	
	/**
	 * Information on external gateway for the router
	 *
	 * @return the external gateway info
	 */
	ExternalGateway getExternalGatewayInfo();
	
	/**
	 * true indicates a distributed router. It is available when dvr extension is enabled.
	 * @return
	 */
	Boolean getDistributed();
}
