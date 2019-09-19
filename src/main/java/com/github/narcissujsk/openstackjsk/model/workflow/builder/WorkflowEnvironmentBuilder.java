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
import com.github.narcissujsk.openstackjsk.model.workflow.Scope;
import com.github.narcissujsk.openstackjsk.model.workflow.WorkflowEnvironment;

import java.util.Date;
import java.util.Map;

/**
 * Builder for a {@link WorkflowEnvironment} model class
 * 
 * @author Renat Akhmerov
 */
public interface WorkflowEnvironmentBuilder<T extends WorkflowEnvironmentBuilder<T, M>, M extends WorkflowEnvironment>
        extends Builder<T, M> {
	/**
	 * @see WorkflowEnvironment#getId()
	 */
	T id(String id);

	/**
	 * @see WorkflowEnvironment#getCreatedAt()
	 */
	T createdAt(Date createdAt);

	/**
	 * @see WorkflowEnvironment#getUpdatedAt()
	 */
	T updatedAt(Date updatedAt);

	/**
	 * @see WorkflowEnvironment#getProjectId()
	 */
	T projectId(String projectId);

	/**
	 * @see WorkflowEnvironment#getScope()
	 */
	T scope(Scope scope);

	/**
	 * @see WorkflowEnvironment#getName()
	 */
	T name(String name);

	/**
	 * @see WorkflowEnvironment#getDescription()
	 */
	T description(String description);

    /**
     * @see WorkflowEnvironment#getVariables()
     */
    T variables(Map<String, Object> variables);
}
