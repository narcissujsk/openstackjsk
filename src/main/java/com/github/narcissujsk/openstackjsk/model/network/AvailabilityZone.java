package com.github.narcissujsk.openstackjsk.model.network;

import java.util.List;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

/**
 * An availability zone groups network nodes that run services like DHCP, L3, FW, and others. 
 * 
 * @author Taemin
 */
public interface AvailabilityZone extends ModelEntity {

	/**
	 * @return State
	 */
	String getState();

	/**
	 * @return Resource
	 */
	String getResource();
		
	/**
	 * @return The Zone Name of Neutron
	 */
	String getName();

	

}
