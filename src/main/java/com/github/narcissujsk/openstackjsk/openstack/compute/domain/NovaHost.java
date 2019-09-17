package com.github.narcissujsk.openstackjsk.openstack.compute.domain;

import java.util.ArrayList;
import java.util.List;

import com.github.narcissujsk.openstackjsk.openstack.common.ListResult;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Nova OS Host contains a list of Nova Host Resources
 * 
 * @author Qin An
 */
public class NovaHost extends ListResult<NovaHostResource> {

	public static final long serialVersionUID = 1L;

	@JsonProperty("host")
	List<NovaHostResourceBody> hostItems;

	@Override
	protected List<NovaHostResource> value() {
		List<NovaHostResource> hostResources = new ArrayList<NovaHostResource>();
		for (NovaHostResourceBody body : hostItems) {
			hostResources.add((NovaHostResource) body.getHostResource());
		}
		return hostResources;
	}

}
