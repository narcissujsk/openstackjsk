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

import com.github.narcissujsk.openstackjsk.api.workflow.WorkflowEnvironmentService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.workflow.WorkflowEnvironment;
import com.github.narcissujsk.openstackjsk.openstack.workflow.domain.MistralWorkflowEnvironment;
import com.github.narcissujsk.openstackjsk.openstack.workflow.domain.MistralWorkflowEnvironment.MistralWorkflowEnvironments;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Workflow environment service implementation.
 *
 * @author Renat Akhmerov
 */
public class WorkflowEnvironmentServiceImpl extends BaseMistralService implements WorkflowEnvironmentService {

    @Override
    public List<? extends WorkflowEnvironment> list() {
        return get(MistralWorkflowEnvironments.class, uri("/environments")).execute().getList();
    }

    @Override
    public WorkflowEnvironment create(WorkflowEnvironment env) {
        checkNotNull(env);

        Invocation<MistralWorkflowEnvironment> invocation = post(
                MistralWorkflowEnvironment.class,
                uri("/environments")
        );

        return invocation.entity(env).execute();
    }

    @Override
    public WorkflowEnvironment get(String identifier) {
        return get(MistralWorkflowEnvironment.class, uri("/environments/%s", identifier)).execute();
    }

    @Override
    public ActionResponse delete(String identifier) {
        return deleteWithResponse(uri("/environments/%s", identifier)).execute();
    }
}
