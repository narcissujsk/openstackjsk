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
import com.github.narcissujsk.openstackjsk.model.workflow.builder.CronTriggerBuilder;

import java.util.Date;
import java.util.Map;


/**
 * A cron trigger.
 *
 * @author Renat Akhmerov
 */
public interface CronTrigger extends ModelEntity, Buildable<CronTriggerBuilder> {

    /**
     * @return The id of this definition.
     */
    String getId();

    /**
     * @return The time that this trigger was createdAt at.
     */
    Date getCreatedAt();

    /**
     * @return The time that this trigger was last updatedAt at.
     */
    Date getUpdatedAt();

    /**
     * @return The scope of this trigger.
     */
    Scope getScope();

    /**
     * @return The name of this definition.
     */
    String getName();

    /**
     * @return The name of workflow that this trigger needs to run.
     */
    String getWorkflowName();

    /**
     * @return The Id of workflow that this trigger needs to run.
     */
    String getWorkflowId();

    /**
     * @return The input values with which the workflow needs to run.
     */
    Map<String, ?> getWorkflowInput();

    /**
     * @return The workflow type specific parameters with which the workflow needs to run.
     */
    Map<String, ?> getWorkflowParameters();

    /**
     * @return The cron pattern of this trigger.
     */
    String getPattern();

    /**
     * @return The number of remaining executions of this trigger.
     */
    Integer getRemainingExecutionsCount();

    /**
     * @return The first execution time of this trigger.
     */
    Date getFirstExecutionTime();

    /**
     * @return The next execution time of this trigger according the cron pattern.
     */
    Date getNextExecutionTime();
}
