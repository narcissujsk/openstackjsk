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
