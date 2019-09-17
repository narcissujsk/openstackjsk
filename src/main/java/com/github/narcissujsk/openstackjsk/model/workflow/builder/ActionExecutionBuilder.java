package com.github.narcissujsk.openstackjsk.model.workflow.builder;

import com.github.narcissujsk.openstackjsk.model.workflow.ActionExecution;
import com.github.narcissujsk.openstackjsk.model.workflow.builder.ExecutionBuilder;

import java.util.Map;

/**
 * Builder for a {@link ActionExecution} model class
 * 
 * @author Renat Akhmerov
 */
public interface ActionExecutionBuilder<T extends ActionExecutionBuilder<T, M>, M extends ActionExecution>
		extends ExecutionBuilder<T, M> {

    /**
     * @see ActionExecution#getName()
     */
    T name(String name);

    /**
	 * @see ActionExecution#getTaskName()
	 */
	T taskName(String taskName);

	/**
	 * @see ActionExecution#getTaskExecutionId()
	 */
	T taskExecutionId(String taskExecId);

    /**
     * @see ActionExecution#isAccepted()
     */
    T accepted(Boolean accepted);

    /**
     * @see ActionExecution#getInput()
     */
    T input(Map<String, Object> input);

    /**
     * @see ActionExecution#getOutput()
     */
    T output(Map<String, Object> output);
}
