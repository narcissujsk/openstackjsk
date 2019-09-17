package com.github.narcissujsk.openstackjsk.api.identity.v2;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.identity.v2.RoleService;
import com.github.narcissujsk.openstackjsk.api.identity.v2.ServiceManagerService;
import com.github.narcissujsk.openstackjsk.api.identity.v2.TenantService;
import com.github.narcissujsk.openstackjsk.api.identity.v2.UserService;
import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.common.Extension;
import com.github.narcissujsk.openstackjsk.model.identity.v2.Endpoint;

/**
 * Identity Serivce Operations API
 * 
 * @author Jeremy Unruh
 */
public interface IdentityService extends RestService {

	/**
	 * Tenants Service API
	 *
	 * @return the tenant service
	 */
	TenantService tenants();
	
	/**
	 * Users Service API
	 *
	 * @return the user service
	 */
	UserService users();
	
	/**
	 * Role Service API
	 *
	 * @return the role service
	 */
	RoleService roles();
	
	/**
	 * Service Management API
	 *
	 * @return the service manager service
	 */
	ServiceManagerService services();
	
	/**
	 * List extensions currently available on the OpenStack instance
	 *
	 * @return List of extensions
	 */
	List<? extends Extension> listExtensions();
	
	/**
	 * Lists endpoints available for the current authenticated token
	 *
	 * @return List of endpoints
	 */
	List<? extends Endpoint> listTokenEndpoints();
	
}
