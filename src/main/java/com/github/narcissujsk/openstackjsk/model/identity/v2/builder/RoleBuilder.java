package com.github.narcissujsk.openstackjsk.model.identity.v2.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.identity.v2.Role;

/**
 * A Builder which creates an Identity Role
 * 
 * @author Jeremy Unruh
 */
public interface RoleBuilder extends Builder<RoleBuilder, Role> {

	/**
	 * @see Role#getId()
	 */
	RoleBuilder id(String id);
	
	/**
	 * @see Role#getTenantId()
	 */
	RoleBuilder tenantId(String tenantId);
	
	/**
	 * @see Role#getName()
	 */
	RoleBuilder name(String name);
	
	/**
	 * @see Role#getDescription()
	 */
	RoleBuilder description(String description);
	
	/**
	 * @see Role#isEnabled()
	 */
	RoleBuilder enabled(boolean enabled);
	
}
