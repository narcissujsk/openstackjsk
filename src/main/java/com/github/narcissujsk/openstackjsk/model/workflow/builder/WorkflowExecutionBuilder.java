package com.github.narcissujsk.openstackjsk.model.workflow.builder;

import com.github.narcissujsk.openstackjsk.model.workflow.WorkflowExecution;
import com.github.narcissujsk.openstackjsk.model.workflow.builder.ExecutionBuilder;

import java.util.Map;

/**
 * Builder for a {@link WorkflowExecution} model class
 * 
 * @author Renat Akhmerov
 */
public interface WorkflowExecutionBuilder<T extends WorkflowExecutionBuilder<T, M>, M extends WorkflowExecution>
		extends ExecutionBuilder<T, M> {

    /**
     * @see WorkflowExecution#getParameters()
     */
    T parameters(Map<String, Object> params);

    /**
	 * @see WorkflowExecution#getInput()
	 */
	T input(Map<String, Object> input);

    /**
     * @see WorkflowExecution#getOutput()
     */
    T output(Map<String, Object> output);

    /**
     * @see WorkflowExecution#getTaskExecutionId()
     */
    T taskExecutionId(String taskExecutionId);
}
