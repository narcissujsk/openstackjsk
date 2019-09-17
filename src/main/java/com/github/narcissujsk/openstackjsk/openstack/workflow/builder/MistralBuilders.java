package com.github.narcissujsk.openstackjsk.openstack.workflow.builder;

import com.github.narcissujsk.openstackjsk.model.workflow.builder.*;
import com.github.narcissujsk.openstackjsk.openstack.workflow.domain.MistralActionDefinition;
import com.github.narcissujsk.openstackjsk.openstack.workflow.domain.MistralWorkbookDefinition;
import com.github.narcissujsk.openstackjsk.openstack.workflow.domain.MistralWorkflowDefinition;
import com.github.narcissujsk.openstackjsk.openstack.workflow.domain.MistralWorkflowExecution;

/**
 * The Mistral v2 Builders.
 */
public class MistralBuilders implements WorkflowBuilders {

    @Override
    public WorkflowDefinitionBuilder workflowDefinition() {
        return MistralWorkflowDefinition.builder();
    }

    @Override
    public WorkbookDefinitionBuilder workbookDefinition() {
        return MistralWorkbookDefinition.builder();
    }

    @Override
    public ActionDefinitionBuilder actionDefinition() {
        return MistralActionDefinition.builder();
    }

    @Override
    public WorkflowExecutionBuilder workflowExecution() {
        return MistralWorkflowExecution.builder();
    }
}
