package com.github.narcissujsk.openstackjsk.api.workflow;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.workflow.ActionDefinition;
import com.github.narcissujsk.openstackjsk.model.workflow.Scope;

import java.io.InputStream;
import java.util.List;

/**
 * Service that provides CRUD operations for action definitions.
 * 
 * @author Renat Akhmerov
 */
public interface ActionDefinitionService extends RestService {

    /**
     * List all action definitions with details.
     *
     * @return List of action definitions.
     */
    List<? extends ActionDefinition> list();

    /**
     * Create a new action definition.
     *
     * @param actionText Text in YAML format (Mistral language) with one or more action definitions.
     * @param scope Scope of newly created workflows.
     * @return Created action definition.
     */
    List<? extends ActionDefinition> create(InputStream actionText, Scope scope);

    /**
     * Get action definition by its identifier.
     *
     * @param identifier Action definition identifier (either ID or name).
     * @return Action definition.
     */
    ActionDefinition get(String identifier);

    /**
     * Delete action definition by its identifier.
     *
     * @param identifier Action definition identifier (either ID or name).
     * @return Action response from the server.
     */
    ActionResponse delete(String identifier);
}


