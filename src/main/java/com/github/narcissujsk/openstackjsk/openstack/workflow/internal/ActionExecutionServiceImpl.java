package com.github.narcissujsk.openstackjsk.openstack.workflow.internal;

import com.github.narcissujsk.openstackjsk.api.workflow.ActionExecutionService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.workflow.ActionExecution;
import com.github.narcissujsk.openstackjsk.openstack.workflow.domain.MistralActionExecution;
import com.github.narcissujsk.openstackjsk.openstack.workflow.domain.MistralActionExecution.MistralActionExecutions;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Action execution service implementation.
 *
 * @author Renat Akhmerov
 */
public class ActionExecutionServiceImpl extends BaseMistralService implements ActionExecutionService {

    @Override
    public List<? extends ActionExecution> list() {
        return get(MistralActionExecutions.class, uri("/action_executions")).execute().getList();
    }

    @Override
    public ActionExecution create(ActionExecution actionExec) {
        checkNotNull(actionExec);

        Invocation<MistralActionExecution> invocation = post(
                MistralActionExecution.class,
                uri("/executions")
        );

        return invocation.entity(actionExec).execute();
    }

    @Override
    public ActionExecution get(String id) {
        return get(MistralActionExecution.class, uri("/action_executions/%s", id)).execute();
    }

    @Override
    public ActionResponse delete(String id) {
        return deleteWithResponse(uri("/action_executions/%s", id)).execute();
    }
}
