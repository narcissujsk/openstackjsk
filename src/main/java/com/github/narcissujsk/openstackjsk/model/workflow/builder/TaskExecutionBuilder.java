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

import com.github.narcissujsk.openstackjsk.model.workflow.TaskExecution;
import com.github.narcissujsk.openstackjsk.model.workflow.builder.ExecutionBuilder;

import java.util.Map;

/**
 * Builder for a {@link TaskExecution} model class
 * 
 * @author Renat Akhmerov
 */
public interface TaskExecutionBuilder<T extends TaskExecutionBuilder<T, M>, M extends TaskExecution>
		extends ExecutionBuilder<T, M> {

	/**
	 * @see TaskExecution#getType()
	 */
	T type(String type);

	/**
	 * @see TaskExecution#getWorkflowDefinitionId()
	 */
	T workflowDefinitionId(String wfDefId);

	/**
	 * @see TaskExecution#getWorkflowExecutionId()
	 */
	T workflowExecutionId(String wfExecId);

	/**
	 * @see TaskExecution#getRuntimeContext()
	 */
	T runtimeContext(Map<String, Object> runtimeContext);

	/**
	 * @see TaskExecution#getResult()
	 */
	T result(Object result);

	/**
	 * @see TaskExecution#getPublished()
	 */
	T published(Map<String, Object> published);

	/**
	 * @see TaskExecution#isProcessed()
	 */
	T processed(Boolean processed);

	/**
	 * @see TaskExecution#isReset()
	 */
	T reset(Boolean reset);

	/**
	 * @see TaskExecution#getEnvironment()
	 */
	T environment(Map<String, Object> env);
}
