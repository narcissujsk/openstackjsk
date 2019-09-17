package com.github.narcissujsk.openstackjsk.openstack.compute.domain;

import com.github.narcissujsk.openstackjsk.model.compute.HostResource;
import com.github.narcissujsk.openstackjsk.model.compute.HostResourceBody;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Nova Host Resource Body contains Nova host resource
 * 
 * @author Qin An
 */
public class NovaHostResourceBody implements HostResourceBody {

	public static final long serialVersionUID = 1L;

	@JsonProperty("resource")
	private NovaHostResource resource;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HostResource getHostResource() {
		return resource;
	}
}
