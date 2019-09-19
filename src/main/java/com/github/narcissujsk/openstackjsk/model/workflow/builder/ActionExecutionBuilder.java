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
