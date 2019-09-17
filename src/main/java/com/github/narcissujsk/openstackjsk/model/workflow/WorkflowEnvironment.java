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
