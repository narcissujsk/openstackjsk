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
