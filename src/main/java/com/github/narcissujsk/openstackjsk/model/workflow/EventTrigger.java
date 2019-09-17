/*
 * 
 */
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
public interface EventTrigger extends ModelEntity, Buildable<CronTriggerBuilder> {

    /**
     * @return The id of this definition.
     */
    String getId();

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
     * @return The name of the exchange for this triger.
     */
    String getExchange();

    /**
     * @return The name of the topic for this triger.
     */
    String getTopic();

    /**
     * @return The name of the event for this triger.
     */
    String getEvent();

    /**
     * @return The id of the project (tenant) this trigger belongs to.
     */
    String getProjectId();

    /**
     * @return The scope of this trigger.
     */
    Scope getScope();

    /**
     * @return The time that this trigger was createdAt at.
     */
    Date getCreated();

    /**
     * @return The time that this trigger was last updatedAt at.
     */
    Date getUpdated();
}
