package com.github.narcissujsk.openstackjsk.model.workflow.builder;

import com.github.narcissujsk.openstackjsk.model.workflow.ActionDefinition;
import com.github.narcissujsk.openstackjsk.model.workflow.builder.DefinitionBuilder;

/**
 * Builder for a {@link ActionDefinition} model class
 * 
 * @author Renat Akhmerov
 */
public interface ActionDefinitionBuilder<T extends ActionDefinitionBuilder<T, M>, M extends ActionDefinition>
		extends DefinitionBuilder<T, M> {

	/**
	 * @see ActionDefinition#getInput()
	 */
	T input(String input);
}
