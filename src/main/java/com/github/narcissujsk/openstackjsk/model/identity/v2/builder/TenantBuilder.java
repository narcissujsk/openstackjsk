package com.github.narcissujsk.openstackjsk.model.identity.v2.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.identity.v2.Tenant;

/**
 * A Builder which creates a Identity Tenant
 * 
 * @author jeremy
 */
public interface TenantBuilder extends Builder<TenantBuilder, Tenant> {
	
	/**
	 * @see Tenant#getName()
	 */
	TenantBuilder name(String name);
	
	/**
	 * @see Tenant#getDescription()
	 */
	TenantBuilder description(String desc);
	
	/**
	 * @see Tenant#getId()
	 */
	TenantBuilder id(String id);
	
	/**
	 * @see Tenant#getEnabled()
	 */
	TenantBuilder enabled(boolean enabled);

}
