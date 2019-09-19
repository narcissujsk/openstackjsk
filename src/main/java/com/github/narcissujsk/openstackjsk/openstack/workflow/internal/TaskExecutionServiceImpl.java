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

import com.github.narcissujsk.openstackjsk.api.workflow.TaskExecutionService;
import com.github.narcissujsk.openstackjsk.model.workflow.TaskExecution;
import com.github.narcissujsk.openstackjsk.openstack.workflow.domain.MistralTaskExecution;
import com.github.narcissujsk.openstackjsk.openstack.workflow.domain.MistralTaskExecution.MistralTaskExecutions;

import java.util.List;

/**
 * Task execution service implementation.
 *
 * @author Renat Akhmerov
 */
public class TaskExecutionServiceImpl extends BaseMistralService implements TaskExecutionService {

    @Override
    public List<? extends TaskExecution> list() {
        return get(MistralTaskExecutions.class, uri("/tasks")).execute().getList();
    }

    @Override
    public TaskExecution get(String id) {
        return get(MistralTaskExecution.class, uri("/tasks/%s", id)).execute();
    }
}
