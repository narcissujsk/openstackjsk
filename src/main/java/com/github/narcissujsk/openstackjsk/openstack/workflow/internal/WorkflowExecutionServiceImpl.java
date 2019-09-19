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

import com.github.narcissujsk.openstackjsk.api.workflow.WorkflowExecutionService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.workflow.WorkflowExecution;
import com.github.narcissujsk.openstackjsk.openstack.workflow.domain.MistralWorkflowExecution;
import com.github.narcissujsk.openstackjsk.openstack.workflow.domain.MistralWorkflowExecution.MistralWorkflowExecutions;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Workflow execution service implementation.
 *
 * @author Renat Akhmerov
 */
public class WorkflowExecutionServiceImpl extends BaseMistralService implements WorkflowExecutionService {

    @Override
    public List<? extends WorkflowExecution> list() {
        return get(MistralWorkflowExecutions.class, uri("/executions")).execute().getList();
    }

    @Override
    public WorkflowExecution create(WorkflowExecution wfExec) {
        checkNotNull(wfExec);

        Invocation<MistralWorkflowExecution> invocation = post(
                MistralWorkflowExecution.class,
                uri("/executions")
        );

        return invocation.entity(wfExec).execute();
    }

    @Override
    public WorkflowExecution get(String identifier) {
        return get(MistralWorkflowExecution.class, uri("/executions/%s", identifier)).execute();
    }

    @Override
    public ActionResponse delete(String identifier) {
        return deleteWithResponse(uri("/executions/%s", identifier)).execute();
    }

}
