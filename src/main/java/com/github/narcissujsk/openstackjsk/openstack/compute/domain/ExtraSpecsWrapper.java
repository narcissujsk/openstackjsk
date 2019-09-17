package com.github.narcissujsk.openstackjsk.openstack.compute.domain;

import java.util.Map;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Wrapper for flavor extra specs to get
 * 
 * @author Octopus Zhang
 */
public class ExtraSpecsWrapper implements ModelEntity {

	private static final long serialVersionUID = 1L;

	@JsonProperty("extra_specs")
	Map<String, String> extraSpecs;

	public ExtraSpecsWrapper() { }

	public ExtraSpecsWrapper(Map<String, String> extraSpecs) {
		this.extraSpecs = extraSpecs;
	}
	/**
	 * Wraps the given extraSpecs into the wrapper
	 * 
	 * @param extraSpecs
	 * @return extraSpecs wrapper
	 */
	public static ExtraSpecsWrapper wrap(Map<String, String> extraSpecs) {
		return new ExtraSpecsWrapper(extraSpecs);
	}
	
	/**
	 * @return the extraSpecs
	 */
	public Map<String, String> getExtraSpecs() {
		return extraSpecs;
	}

}
