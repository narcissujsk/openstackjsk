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
