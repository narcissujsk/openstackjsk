package com.github.narcissujsk.openstackjsk.model.tacker.builder;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.tacker.Vnfd;
import com.github.narcissujsk.openstackjsk.openstack.tacker.domain.VnfdAttributes;
import com.github.narcissujsk.openstackjsk.openstack.tacker.domain.VnfdServiceTypes;

/**
 *
 * @author Vishvesh Deshmukh
 * @date Aug 11, 2016
 */
public interface VnfdBuilder extends Builder<VnfdBuilder, Vnfd> {

	/**
	 * @param tenantId : Owner of the Vnfd. Only an administrative user can specify a tenant ID other than its own.
	 * @return VnfdBuilder
	 */
	VnfdBuilder tenantId(String tenantId);
	
	/**
	 * @param name : Human readable name for the Vnfd (255 characters limit). Does not have to be unique.
	 * @return VnfdBuilder
	 */
	VnfdBuilder name(String name);

	/**
	 * @param description : Human readable description for the Vnfd (1024 characters limit).
	 * @return VnfdBuilder
	 */
	VnfdBuilder description(String description);
	
	/**
	 * @param managementDriver
	 * @return VnfdBuilder
	 */
	VnfdBuilder managementDriver(String managementDriver);
	
	/**
	 * @param infrastructureDriver
	 * @return VnfdBuilder
	 */
	VnfdBuilder infrastructureDriver(String infrastructureDriver);
	
	/**
	 * @param attributes
	 * @return VnfdBuilder
	 */
	VnfdBuilder attributes(VnfdAttributes attributes);
	
	/**
	 * @param serviceTypes
	 * @return VnfdBuilder
	 */
	VnfdBuilder serviceTypes(List<VnfdServiceTypes> serviceTypes);
	
}
