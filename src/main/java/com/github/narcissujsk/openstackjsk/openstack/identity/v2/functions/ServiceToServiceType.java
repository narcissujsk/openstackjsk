package com.github.narcissujsk.openstackjsk.openstack.identity.v2.functions;

import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.model.identity.v2.Access.Service;

import com.google.common.base.Function;

/**
 * A Function which takes a ServiceCatalog -> Service and returns the corresponding common ServiceType
 * 
 * @author Jeremy Unruh
 */
public class ServiceToServiceType implements Function<Service, ServiceType> {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ServiceType apply(Service input) {
		return input.getServiceType();
	}

}
