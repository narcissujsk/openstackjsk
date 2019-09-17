package com.github.narcissujsk.openstackjsk.openstack.compute.domain;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A wrapper model class to return the console output from a server
 * 
 * @author Jeremy Unruh
 *
 */
public class ConsoleOutput implements ModelEntity {

	private static final long serialVersionUID = 1L;

	@JsonProperty
	private String output;
	
	/**
	 * @return the console output from a VM/Server or null
	 */
	public String getOutput() {
		return output;
	}
	
}
