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

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.workflow.CronTrigger;
import com.github.narcissujsk.openstackjsk.model.workflow.Scope;

import java.util.Date;
import java.util.Map;

/**
 * Builder for a {@link CronTrigger} model class
 * 
 * @author Renat Akhmerov
 */
public interface CronTriggerBuilder<T extends CronTriggerBuilder<T, M>, M extends CronTrigger>
		extends Builder<T, M> {
	/**
	 * @see CronTrigger#getId()
	 */
	T id(String id);

	/**
	 * @see CronTrigger#getCreatedAt()
	 */
	T createdAt(Date createdAt);

	/**
	 * @see CronTrigger#getUpdatedAt()
	 */
	T updatedAt(Date updatedAt);

	/**
	 * @see CronTrigger#getScope()
	 */
	T scope(Scope scope);

	/**
	 * @see CronTrigger#getName()
	 */
	T name(String name);

	/**
	 * @see CronTrigger#getPattern()
	 */
	T pattern(String pattern);

	/**
	 * @see CronTrigger#getWorkflowName()
	 */
	T workflowName(String wfName);

	/**
	 * @see CronTrigger#getWorkflowId()
	 */
	T workflowId(String wfId);

	/**
	 * @see CronTrigger#getWorkflowInput()
	 */
	T workflowInput(Map<String, Object> wfInput);

	/**
	 * @see CronTrigger#getWorkflowParameters()
	 */
	T workflowParameters(Map<String, Object> wfParams);

	/**
	 * @see CronTrigger#getRemainingExecutionsCount()
	 */
	T remainingExecutionsCount(Integer cnt);

    /**
     * @see CronTrigger#getFirstExecutionTime()
     */
    T firstExecutionTime(Date firstExecTime);

	/**
	 * @see CronTrigger#getNextExecutionTime()
	 */
	T nextExecutionTime(Date nextExecTime);
}
