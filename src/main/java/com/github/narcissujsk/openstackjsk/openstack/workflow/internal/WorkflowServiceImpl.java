package com.github.narcissujsk.openstackjsk.openstack.workflow.internal;

import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.trove.*;
import com.github.narcissujsk.openstackjsk.api.workflow.*;
import com.github.narcissujsk.openstackjsk.openstack.trove.internal.BaseTroveServices;

/**
 * Trove API Implementation
 *
 * @author sumit gandhi
 */
public class WorkflowServiceImpl extends BaseMistralService implements WorkflowService {
    @Override
    public WorkflowDefinitionService workflowDefinitions() {
        return Apis.get(WorkflowDefinitionService.class);
    }

    @Override
    public ActionDefinitionService actionDefinitions() {
        return Apis.get(ActionDefinitionService.class);
    }

    @Override
    public WorkbookDefinitionService workbookDefinitions() {
        return Apis.get(WorkbookDefinitionService.class);
    }

    @Override
    public WorkflowExecutionService workflowExecutions() {
        return Apis.get(WorkflowExecutionService.class);
    }

    @Override
    public TaskExecutionService taskExecutions() {
        return Apis.get(TaskExecutionService.class);
    }

    @Override
    public ActionExecutionService actionExecutions() {
        return Apis.get(ActionExecutionService.class);
    }

    @Override
    public ValidationService validation() {
        return Apis.get(ValidationService.class);
    }

    @Override
    public WorkflowEnvironmentService environments() {
        return Apis.get(WorkflowEnvironmentService.class);
    }

    @Override
    public CronTriggerService cronTriggers() {
        return Apis.get(CronTriggerService.class);
    }

    @Override
    public EventTriggerService eventTriggers() {
        return Apis.get(EventTriggerService.class);
    }
}
