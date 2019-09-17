package com.github.narcissujsk.openstackjsk.model.workflow.builder;

import com.github.narcissujsk.openstackjsk.model.workflow.WorkflowDefinition;
import com.github.narcissujsk.openstackjsk.model.workflow.builder.DefinitionBuilder;

/**
 * Builder for {@link WorkflowDefinition} model class.
 * 
 * @author Renat Akhmerov
 */
public interface WorkflowDefinitionBuilder<T extends WorkflowDefinitionBuilder<T, M>, M extends WorkflowDefinition>
        extends DefinitionBuilder<T, M> {

	/**
	 * @see WorkflowDefinition#getInput()
	 */
	T input(String input);
}
