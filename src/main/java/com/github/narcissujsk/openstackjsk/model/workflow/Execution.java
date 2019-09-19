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
/*
 * 
 */
package com.github.narcissujsk.openstackjsk.model.workflow;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.workflow.State;
import com.github.narcissujsk.openstackjsk.model.workflow.builder.ExecutionBuilder;

import java.util.Date;
import java.util.List;


/**
 * Base interface for all execution objects.
 * 
 * @author Renat Akhmerov
 */
public interface Execution extends ModelEntity, Buildable<ExecutionBuilder> {
	/**
	 * @return The id of this execution.
	 */
	String getId();

    /**
     * @return The description of this execution.
     */
    String getDescription();

    /**
     * @return The name of the workflow that this execution belongs to.
     */
    String getWorkflowName();

	/**
	 * @return Execution state.
	 */
	State getState();

	/**
	 * @return Execution state info.
	 */
	String getStateInfo();

    /**
     * @return The list of tags.
     */
    List<String> getTags();

    /**
	 * @return The time that this entity was created at.
	 */
	Date getCreatedAt();

	/**
	 * @return The time that this entity was last updated at.
	 */
	Date getUpdatedAt();
}
