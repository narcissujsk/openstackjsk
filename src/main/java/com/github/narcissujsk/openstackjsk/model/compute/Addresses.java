package com.github.narcissujsk.openstackjsk.model.compute;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.compute.Address;

/**
 * A container which holds networks with 1 or more addresses
 * 
 * @author Jeremy Unruh
 */
public interface Addresses extends ModelEntity {

	/**
	 * Adds an address to the given network type
	 *
	 * @param key the type of address classification
	 * @param value of the address
	 */
	void add(String key, com.github.narcissujsk.openstackjsk.model.compute.Address value);
	
	/**
	 * @return the a Map<String, List<Address> 
	 */
	Map<String, List<? extends com.github.narcissujsk.openstackjsk.model.compute.Address>> getAddresses();
	
	/**
	 * Gets the addresses associated with the given network type
	 *
	 * @param type the type of network
	 * @return the List of Addresses
	 */
	List<? extends Address> getAddresses(String type);
	
}
