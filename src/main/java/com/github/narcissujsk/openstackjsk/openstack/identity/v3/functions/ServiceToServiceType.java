package com.github.narcissujsk.openstackjsk.openstack.identity.v3.functions;

import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.model.identity.v3.Service;

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
                ServiceType serviceType = ServiceType.forName(input.getType());
                if (serviceType == ServiceType.UNKNOWN)
                   serviceType = ServiceType.forName(input.getName());
		return serviceType;
	}

}
