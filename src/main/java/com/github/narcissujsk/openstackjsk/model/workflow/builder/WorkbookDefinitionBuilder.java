package com.github.narcissujsk.openstackjsk.model.workflow.builder;

import com.github.narcissujsk.openstackjsk.model.workflow.WorkbookDefinition;
import com.github.narcissujsk.openstackjsk.model.workflow.builder.DefinitionBuilder;

/**
 * Builder for a {@link WorkbookDefinition} model class
 * 
 * @author Renat Akhmerov
 */
public interface WorkbookDefinitionBuilder <T extends WorkbookDefinitionBuilder<T, M>, M extends WorkbookDefinition>
		extends DefinitionBuilder<T, M> {
	// No-op.
}
