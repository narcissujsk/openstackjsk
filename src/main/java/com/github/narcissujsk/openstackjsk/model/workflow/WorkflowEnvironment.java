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
package com.github.narcissujsk.openstackjsk.model.workflow;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.workflow.Scope;
import com.github.narcissujsk.openstackjsk.model.workflow.builder.WorkflowEnvironmentBuilder;

import java.util.Date;
import java.util.Map;


/**
 * A workflow environment.
 *
 * @author Renat Akhmerov
 */
public interface WorkflowEnvironment extends ModelEntity, Buildable<WorkflowEnvironmentBuilder> {
    /**
     * @return The id of this environment.
     */
    String getId();

    /**
     * @return The project id of this environment.
     */
    String getProjectId();

    /**
     * @return The scope of this environment.
     */
    Scope getScope();

    /**
     * @return The time that this entity was created at.
     */
    Date getCreatedAt();

    /**
     * @return The time that this entity was last updated at.
     */
    Date getUpdatedAt();

    /**
     * @return The name of this environment.
     */
    String getName();

    /**
     * @return The description of this environment.
     */
    String getDescription();

    /**
     * @return The variables of this environment.
     */
    Map<String, Object> getVariables();
}
