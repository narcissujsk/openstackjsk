/*
 * 
 */
package com.github.narcissujsk.openstackjsk.model.workflow;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.workflow.Execution;
import com.github.narcissujsk.openstackjsk.model.workflow.builder.TaskExecutionBuilder;

import java.util.Map;


/**
 * A task execution.
 *
 * @author Renat Akhmerov
 */
public interface TaskExecution extends Execution {
    /**
     * @return The task name.
     */
    String getName();

    /**
     * TODO: do we need a enum for task types?
     *
     * @return The task type.
     */
    String getType();

    /**
     * @return The ID of the workflow definition that this task belongs to.
     */
    String getWorkflowDefinitionId();

    /**
     * @return The ID of the workflow execution that this task belongs to.
     */
    String getWorkflowExecutionId();

    /**
     * @return The runtime context of the task.
     */
    Map<String, Object> getRuntimeContext();

    /**
     * @return The result of this task.
     */
    Object getResult();

    /**
     * @return The variables published into workflow context by this task.
     */
    Map<String, Object> getPublished();

    /**
     * @return {@code True} if this task is fully processed (all decisions made based on its result).
     */
    Boolean isProcessed();

    /**
     * @return {@code True} if "reset" flag of the task execution is set and its action
     * executions should be dropped when rerunning the task.
     */
    Boolean isReset();

    /**
     * @return The environment of the task execution.
     */
    Map<String, Object> getEnvironment();

}
