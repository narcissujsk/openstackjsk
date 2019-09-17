package com.github.narcissujsk.openstackjsk.model.workflow.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.workflow.Definition;
import com.github.narcissujsk.openstackjsk.model.workflow.Scope;

import java.util.Date;
import java.util.List;

/**
 * Builder for {@link Definition} model class.
 * 
 * @author Renat Akhmerov
 */
public interface DefinitionBuilder<T extends DefinitionBuilder<T, M>, M extends Definition>
        extends Builder<T, M> {
	/**
	 * @see Definition#getId()
	 */
	T id(String id);

	/**
	 * @see Definition#getName()
	 */
	T name(String name);

	/**
	 * @see Definition#getDefinition()
	 */
	T definition(String definition);

	/**
	 * @see Definition#getCreatedAt()
	 */
	T created(Date created);

	/**
	 * @see Definition#getUpdatedAt()
	 */
	T updated(Date definition);

	/**
	 * @see Definition#isSystem()
	 */
	T system(Boolean system);

	/**
	 * @see Definition#getTags()
	 */
	T tags(List<String> tags);

	/**
	 * @see Definition#getScope()
	 */
	T scope(Scope scope);

	/**
	 * @see Definition#getProjectId()
	 */
	T projectId(String projectId);
}
