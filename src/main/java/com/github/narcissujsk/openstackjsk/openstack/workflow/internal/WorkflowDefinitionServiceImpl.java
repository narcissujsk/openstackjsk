package com.github.narcissujsk.openstackjsk.openstack.workflow.internal;

import com.github.narcissujsk.openstackjsk.api.workflow.WorkflowDefinitionService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.common.payloads.InputStreamPayload;
import com.github.narcissujsk.openstackjsk.model.workflow.Scope;
import com.github.narcissujsk.openstackjsk.model.workflow.WorkflowDefinition;
import com.github.narcissujsk.openstackjsk.openstack.workflow.domain.MistralWorkflowDefinition;
import com.github.narcissujsk.openstackjsk.openstack.workflow.domain.MistralWorkflowDefinition.MistralWorkflowDefinitions;

import java.io.InputStream;
import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Workflow definition service implementation.
 *
 * @author Renat Akhmerov
 */
public class WorkflowDefinitionServiceImpl extends BaseMistralService implements WorkflowDefinitionService {

    @Override
    public List<? extends WorkflowDefinition> list() {
        return get(MistralWorkflowDefinitions.class, uri("/workflows")).execute().getList();
    }

    @Override
    public List<? extends WorkflowDefinition> create(InputStream wfText, Scope scope) {
        checkNotNull(wfText);
        checkNotNull(scope);

        Invocation<MistralWorkflowDefinitions> invocation = post(
                MistralWorkflowDefinitions.class,
                uri("/workflows?scope=%s", scope.toString().toLowerCase())
        );

        return invocation.entity(new InputStreamPayload(wfText)).execute().getList();
    }

    @Override
    public WorkflowDefinition get(String identifier) {
        return get(MistralWorkflowDefinition.class, uri("/workflows/%s", identifier)).execute();
    }

    @Override
    public ActionResponse delete(String identifier) {
        return deleteWithResponse(uri("/workflows/%s", identifier)).execute();
    }

}
