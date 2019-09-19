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

import com.github.narcissujsk.openstackjsk.api.workflow.WorkbookDefinitionService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.common.payloads.InputStreamPayload;
import com.github.narcissujsk.openstackjsk.model.workflow.Scope;
import com.github.narcissujsk.openstackjsk.model.workflow.WorkbookDefinition;
import com.github.narcissujsk.openstackjsk.openstack.workflow.domain.MistralWorkbookDefinition;
import com.github.narcissujsk.openstackjsk.openstack.workflow.domain.MistralWorkbookDefinition.MistralWorkbookDefinitions;

import java.io.InputStream;
import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Workbook definition service implementation.
 *
 * @author Renat Akhmerov
 */
public class WorkbookDefinitionServiceImpl extends BaseMistralService implements WorkbookDefinitionService {

    @Override
    public List<? extends WorkbookDefinition> list() {
        return get(MistralWorkbookDefinitions.class, uri("/workbooks")).execute().getList();
    }

    @Override
    public WorkbookDefinition create(InputStream wfText, Scope scope) {
        checkNotNull(wfText);
        checkNotNull(scope);

        Invocation<MistralWorkbookDefinition> invocation = post(
                MistralWorkbookDefinition.class,
                uri("/workbooks?scope=%s", scope.toString().toLowerCase())
        );

        return invocation.entity(new InputStreamPayload(wfText)).execute();
    }

    @Override
    public WorkbookDefinition get(String identifier) {
        return get(MistralWorkbookDefinition.class, uri("/workbooks/%s", identifier)).execute();
    }

    @Override
    public ActionResponse delete(String identifier) {
        return deleteWithResponse(uri("/workbooks/%s", identifier)).execute();
    }
}
