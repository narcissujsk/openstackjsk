package com.github.narcissujsk.openstackjsk.model.tacker;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.tacker.builder.VnfdBuilder;
import com.github.narcissujsk.openstackjsk.openstack.tacker.domain.VnfdAttributes;
import com.github.narcissujsk.openstackjsk.openstack.tacker.domain.VnfdServiceTypes;

/**
 *
 * @author Vishvesh Deshmukh
 * @date Aug 11, 2016
 */
public interface Vnfd extends ModelEntity, Buildable<VnfdBuilder> {
	/**
	 * 
	 * @return id : Unique identifier for the Vnfd.
	 */
	String getId();
	
	/**
	 * 
	 * @return name : Human readable name for the Vnfd (255 characters limit). Does not have to be unique.
	 */
	String getName();

	/**
	 * 
	 * @return tenantId : Owner of the Vnfd. Only an administrative user can specify a tenant ID other than its own.
	 */
	String getTenantId();

	/**
	 * 
	 * @return description : Human readable description for the Vnfd (1024 characters limit).
	 */
	String getDescription();
	
	/**
	 * 
	 * @return managementDriver
	 */
	String getManagementDriver();
	
	/**
	 * 
	 * @return infrastructureDriver
	 */
	String getInfrastructureDriver();
	
	/**
	 * 
	 * @return attributes
	 */
	VnfdAttributes getAttributes();
	
	/**
	 * 
	 * @return serviceTypes
	 */
	List<VnfdServiceTypes> getServiceTypes();

}
