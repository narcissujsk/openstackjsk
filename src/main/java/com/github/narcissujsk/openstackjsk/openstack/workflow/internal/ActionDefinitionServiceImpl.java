/*******************************************************************************
 * 	Copyright 2019 ContainX and OpenStack4j
 *
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * 	use this file except in compliance with the License. You may obtain a copy of
 * 	the License at
 *
 * 	    http://www.apache.org/licenses/LICENSE-2.0
 *
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * 	License for the specific language governing permissions and limitations under
 * 	the License.
 *******************************************************************************/
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
