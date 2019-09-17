package com.github.narcissujsk.openstackjsk.api.manila;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.manila.SecurityService;
import com.github.narcissujsk.openstackjsk.model.manila.SecurityServiceCreate;
import com.github.narcissujsk.openstackjsk.model.manila.SecurityServiceUpdateOptions;
import com.github.narcissujsk.openstackjsk.model.manila.builder.SecurityServiceCreateBuilder;

import java.util.List;

/**
 * Security Services Service for Manila Shared File Systems.
 *
 * @author Daniel Gonzalez Nothnagel
 */
public interface SecurityServiceService extends RestService {
    /**
     * Creates a security service.
     *
     * @param securityServiceCreate the security service to create
     * @return the created security service
     */
    SecurityService create(SecurityServiceCreate securityServiceCreate);

    /**
     * Lists all security services.
     *
     * @return list of all security services
     */
    List<? extends SecurityService> list();

    /**
     * Lists all security services with details.
     *
     * @return list of all security services with details
     */
    List<? extends SecurityService> listDetails();

    /**
     * Shows details for a security service.
     *
     * @param securityServiceId the security service ID
     * @return the security service or null if not found
     */
    SecurityService get(String securityServiceId);

    /**
     * Updates a security service.
     *
     * @param securityServiceId the security service id
     * @param securityServiceUpdateOptions the options to update on the security service
     * @return the updated security service
     */
    SecurityService update(String securityServiceId, SecurityServiceUpdateOptions securityServiceUpdateOptions);

    /**
     * Deletes a security service.
     *
     * @param securityServiceId the security service ID
     * @return the action response
     */
    ActionResponse delete(String securityServiceId);

    /**
     * @return a builder to create a security service
     */
    SecurityServiceCreateBuilder securityServiceCreateBuilder();
}
