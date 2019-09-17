package com.github.narcissujsk.openstackjsk.model.compute;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

/**
 * An OpenStack Flavor Access for tenants
 * 
 * @author Moodpo
 */
public interface FlavorAccess extends ModelEntity{
	
	/**
	 * @return the id for this flavor
	 */
	String getFlavorId();
	
	/**
	 * @return the id for this tenant
	 */
	String getTenantId();
	
}
