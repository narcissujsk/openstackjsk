package com.github.narcissujsk.openstackjsk.api.identity.v3;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.identity.v3.*;
import com.github.narcissujsk.openstackjsk.api.identity.v3.DomainService;
import com.github.narcissujsk.openstackjsk.api.identity.v3.GroupService;
import com.github.narcissujsk.openstackjsk.api.identity.v3.PolicyService;
import com.github.narcissujsk.openstackjsk.api.identity.v3.ProjectService;
import com.github.narcissujsk.openstackjsk.api.identity.v3.RegionService;
import com.github.narcissujsk.openstackjsk.api.identity.v3.RoleService;
import com.github.narcissujsk.openstackjsk.api.identity.v3.TokenService;
import com.github.narcissujsk.openstackjsk.api.identity.v3.UserService;
import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.common.Extension;

/**
 * Identity v3 Service Operations API
 *
 */
public interface IdentityService extends RestService {

    /**
     * Credential Service API
     *
     * @return the credential service
     */
    CredentialService credentials();

    /**
     * Domain Service API
     *
     * @return the domain service
     */
    DomainService domains();

    /**
     * Projects Service API
     *
     * @return the project service
     */
    ProjectService projects();

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
     * Group Service API
     *
     * @return the group service
     */
    GroupService groups();
    
    /**
     * Token Service API
     * 
     * @return the token service
     */
    TokenService tokens();

    /**
     * Policy Service API
     *
     * @return the policy service
     */
    PolicyService policies();

    /**
     * ServiceEndpoint Service API
     *
     * @return the service and endpoint service
     */
    ServiceEndpointService serviceEndpoints();

    /**
     * Region Service API
     *
     * @return the region service
     */
    RegionService regions();
    
    /**
     * List extensions currently available on the OpenStack instance
     *
     * @return List of extensions
     */
    List<? extends Extension> listExtensions();

}
