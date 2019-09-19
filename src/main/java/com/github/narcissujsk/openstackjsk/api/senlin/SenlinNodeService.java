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
package com.github.narcissujsk.openstackjsk.api.senlin;

import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.senlin.ActionID;
import com.github.narcissujsk.openstackjsk.model.senlin.Node;
import com.github.narcissujsk.openstackjsk.model.senlin.NodeActionCreate;
import com.github.narcissujsk.openstackjsk.model.senlin.NodeCreate;

import java.util.List;

/**
 * This interface defines all methods for the manipulation of Node
 * 
 * @author lion
 * 
 */
public interface SenlinNodeService {
	
	/**
	 * Gets a list of currently existing {@link Node}s.
	 * 
	 * @return the list of {@link Node}s
	 */
	List<? extends Node> list();

	/**
	 * <code>POST /v1/nodes</code><br \>
	 *
	 * Creates a new {@link Node} out of a {@link NodeCreate} object
	 *
	 * @param newNode
	 *            {@link NodeCreate} object out of which node is to be created
	 * @return new {@link Node} as returned from the server
	 */
	Node create(NodeCreate newNode);

	/**
	 * returns details of a {@link Node}.
	 *
	 * @param nodeID
	 *            Id of {@link Node}
	 * @return Node
	 */
	Node get(String nodeID);

	/**
	 * returns details of a {@link Node}
	 * @param nodeID Id of {@link Node}
	 * @param showDetails {@literal true} to retrieve the properties about the physical object that backs the node
	 * @return Node
	 */
	Node get(String nodeID, boolean showDetails);

	/**
	 * Deletes the specified {@link Node} from the server.
	 *
	 * @param nodeID
	 *            Id of {@link Node}
	 * @return the action response
	 */
	ActionResponse delete(String nodeID);

	/**
	 * <code>PATCH /v1/nodes/​{node_id}​</code><br \>
	 *
	 * Update a {@link Node} out of a {@link NodeCreate} object
	 *
	 * @param nodeID
	 *             Id of {@link Node}
	 * @param newNode
	 *            {@link NodeCreate} object out of which stack is to be update
	 * @return new {@link Node} as returned from the server
	 */
	Node update(String nodeID, NodeCreate newNode);

	/**
	 * Service implementation which provides methods for manipulation of action
	 *
	 * @return Action
	 */
	ActionID action(String nodeID, NodeActionCreate newNodeAction);
}
