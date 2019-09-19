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
import com.github.narcissujsk.openstackjsk.model.workflow.Definition;
import com.github.narcissujsk.openstackjsk.model.workflow.Execution;

import java.util.Date;
import java.util.List;

/**
 * Builder for {@link Execution} model class.
 * 
 * @author Renat Akhmerov
 */
public interface ExecutionBuilder<T extends ExecutionBuilder<T, M>, M extends Execution>
        extends Builder<T, M> {
	/**
	 * @see Execution#getId()
	 */
	T id(String id);

	/**
	 * @see Execution#getDescription()
	 */
	T description(String id);

	/**
	 * @see Execution#getWorkflowName()
	 */
	T workflowName(String wfName);

	/**
	 * @see Execution#getCreatedAt()
	 */
	T createdAt(Date createdAt);

	/**
	 * @see Execution#getUpdatedAt()
	 */
	T updatedAt(Date updatedAt);

	/**
	 * @see Execution#getTags()
	 */
	T tags(List<String> tags);
}
