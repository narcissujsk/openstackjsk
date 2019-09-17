package com.github.narcissujsk.openstackjsk.openstack.workflow.internal;

import com.github.narcissujsk.openstackjsk.api.workflow.ActionDefinitionService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.common.payloads.InputStreamPayload;
import com.github.narcissujsk.openstackjsk.model.workflow.ActionDefinition;
import com.github.narcissujsk.openstackjsk.model.workflow.Scope;
import com.github.narcissujsk.openstackjsk.openstack.workflow.domain.MistralActionDefinition;
import com.github.narcissujsk.openstackjsk.openstack.workflow.domain.MistralActionDefinition.MistralActionDefinitions;

import java.io.InputStream;
import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Action definition service implementation.
 *
 * @author Renat Akhmerov
 */
public class ActionDefinitionServiceImpl extends BaseMistralService implements ActionDefinitionService {

    @Override
    public List<? extends ActionDefinition> list() {
        return get(MistralActionDefinitions.class, uri("/actions")).execute().getList();
    }

    @Override
    public List<? extends ActionDefinition> create(InputStream wfText, Scope scope) {
        checkNotNull(wfText);
        checkNotNull(scope);

        Invocation<MistralActionDefinitions> invocation = post(
                MistralActionDefinitions.class,
                uri("/actions?scope=%s", scope.toString().toLowerCase())
        );

        return invocation.entity(new InputStreamPayload(wfText)).execute().getList();
    }

    @Override
    public ActionDefinition get(String identifier) {
        return get(MistralActionDefinition.class, uri("/actions/%s", identifier)).execute();
    }

    @Override
    public ActionResponse delete(String identifier) {
        return deleteWithResponse(uri("/actions/%s", identifier)).execute();
    }
}
