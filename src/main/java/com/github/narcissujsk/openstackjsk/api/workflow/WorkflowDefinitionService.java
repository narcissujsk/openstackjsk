package com.github.narcissujsk.openstackjsk.api.workflow;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.workflow.Scope;
import com.github.narcissujsk.openstackjsk.model.workflow.WorkflowDefinition;

import java.io.InputStream;
import java.util.List;

/**
 * Service that provides CRUD operations for workflow definitions.
 * 
 * @author Renat Akhmerov
 */
public interface WorkflowDefinitionService extends RestService {

    /**
     * List all workflow definitions with details.
     *
     * @return List of workflow definitions.
     */
    List<? extends WorkflowDefinition> list();

    /**
     * Create one or more workflow definitions.
     *
     * @param wfText Text in YAML format (Mistral language) with one or more workflow definitions.
     * @param scope Scope of newly created workflows.
     * @return Created workflow definitions.
     */
    List<? extends WorkflowDefinition> create(InputStream wfText, Scope scope);

    /**
     * Get workflow definition by its identifier.
     *
     * @param identifier Workflow definition identifier (either ID or name).
     * @return Workflow definition.
     */
    WorkflowDefinition get(String identifier);

    /**
     * Delete workflow definition by its identifier.
     *
     * @param identifier Workflow definition identifier (either ID or name).
     * @return Action response from the server.
     */
    ActionResponse delete(String identifier);
}
