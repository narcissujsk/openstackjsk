package com.github.narcissujsk.openstackjsk.model.senlin.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.senlin.NodeActionCreate;

import java.util.Map;

/**
 * This interface describes a builder for {@link NodeActionCreate} objects
 * 
 * @author lion
 */
public interface NodeActionCreateBuilder extends Buildable.Builder<NodeActionCreateBuilder, NodeActionCreate> {

	/**
	 *  Check the health status of a node
	 *
	 * @param check check info
	 * @return NodeActionCreateBuilder
	 */
	NodeActionCreateBuilder check(Map<String, String> check);

	/**
	 *  Recover a node from its current unhealthy status
	 *
	 * @param recover the operation of node
	 * @return NodeActionCreateBuilder
	 */
	NodeActionCreateBuilder recover(Map<String, String> recover);

}
