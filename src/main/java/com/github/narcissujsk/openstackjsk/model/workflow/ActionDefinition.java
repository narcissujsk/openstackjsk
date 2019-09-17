/*
 * 
 */
package com.github.narcissujsk.openstackjsk.model.workflow;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.workflow.Definition;
import com.github.narcissujsk.openstackjsk.model.workflow.builder.ActionDefinitionBuilder;


/**
 * An action definition.
 *
 * @author Renat Akhmerov
 */
public interface ActionDefinition extends Definition {

    /**
     * @return The comma-separated list of input parameters of this workflow
     * definition.
     */
    String getInput();
}
