package com.github.narcissujsk.openstackjsk.api.heat;

import com.github.narcissujsk.openstackjsk.api.Builders;
import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.heat.SoftwareConfig;

/**
 * Software Configuration Service for HEAT Orchestration
 * 
 * @author Jeremy Unruh
 */
public interface SoftwareConfigService extends RestService {

    /**
     * Creates a new Software Config.  See {@link Builders#softwareConfig()} for creating the model
     * @param sc the software config to create
     * @return the newly created SoftwareConfig
     */
    SoftwareConfig create(SoftwareConfig sc);
    
    /**
     * Fetches a Software Configuration by ID
     * @param configId the configuration ID
     * @return SoftwareConfig
     */
    SoftwareConfig show(String configId);
    
    /**
     * Deletes a Software Config by ID
     * 
     * @param configId the software config ID to delete
     * @return the action response
     */
    ActionResponse delete(String configId);
    
}
