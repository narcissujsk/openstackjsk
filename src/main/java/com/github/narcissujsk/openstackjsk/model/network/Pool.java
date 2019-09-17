package com.github.narcissujsk.openstackjsk.model.network;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

/**
 * An IP Address Pool which has a starting network and a ending network which becomes a pool of addresses
 * 
 * @author Jeremy Unruh
 */
public interface Pool extends ModelEntity {

	/**
	 * @return the starting IP
	 */
	String getStart();
	
	/**
	 * @return the ending IP
	 */
	String getEnd();
	
}
