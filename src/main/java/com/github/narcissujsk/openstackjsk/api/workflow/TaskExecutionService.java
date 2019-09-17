package com.github.narcissujsk.openstackjsk.api.workflow;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.workflow.TaskExecution;

import java.util.List;

/**
 * Service that provides CRUD operations for task executions.
 *
 * @author Renat Akhmerov
 */
public interface TaskExecutionService extends RestService {
    /**
     * List all task executions with details.
     *
     * @return List of task executions.
     */
    List<? extends TaskExecution> list();

    /**
     * Get task execution by its ID.
     *
     * @param id Task execution ID.
     * @return Task execution.
     */
    TaskExecution get(String id);
}
