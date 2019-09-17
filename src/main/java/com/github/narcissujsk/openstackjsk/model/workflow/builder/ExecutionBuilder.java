package com.github.narcissujsk.openstackjsk.model.workflow.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.workflow.Definition;
import com.github.narcissujsk.openstackjsk.model.workflow.Execution;

import java.util.Date;
import java.util.List;

/**
 * Builder for {@link Execution} model class.
 * 
 * @author Renat Akhmerov
 */
public interface ExecutionBuilder<T extends ExecutionBuilder<T, M>, M extends Execution>
        extends Builder<T, M> {
	/**
	 * @see Execution#getId()
	 */
	T id(String id);

	/**
	 * @see Execution#getDescription()
	 */
	T description(String id);

	/**
	 * @see Execution#getWorkflowName()
	 */
	T workflowName(String wfName);

	/**
	 * @see Execution#getCreatedAt()
	 */
	T createdAt(Date createdAt);

	/**
	 * @see Execution#getUpdatedAt()
	 */
	T updatedAt(Date updatedAt);

	/**
	 * @see Execution#getTags()
	 */
	T tags(List<String> tags);
}
