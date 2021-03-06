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
package com.github.narcissujsk.openstackjsk.api.heat;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.heat.AdoptStackData;
import com.github.narcissujsk.openstackjsk.model.heat.Stack;
import com.github.narcissujsk.openstackjsk.model.heat.StackCreate;
import com.github.narcissujsk.openstackjsk.model.heat.StackUpdate;

/**
 * This interface defines all methods for the manipulation of stacks
 * 
 * @author Matthias Reisser
 * 
 */
public interface StackService {
	/**
	 * <code>POST /v1/{tenant_id}/stacks</code><br \>
	 * 
	 * Creates a new {@link Stack} out of a {@link StackCreate} object
	 * 
	 * @param newStack
	 *            {@link StackCreate} object out of which stack is to be created
	 * @return new {@link Stack} as returned from the server
	 */
	Stack create(StackCreate newStack);
	
	/**
     * Updates an existing Stack
     * 
     * @param stackName the stack name
     * @param stackId the specific stack identifier
     * @param stackUpdate the stack update options
     * @return the action response
     */
	ActionResponse update(String stackName, String stackId, StackUpdate stackUpdate);

	/**
	 * <code> POST /v1/{tenant_id}/stacks </code> <br\>
	 * Creates a new {@link StackCreate} Object and returns a new {@link Stack} as sent from the
	 * server.
	 * 
	 * @param name
	 *            Name of Stack
	 * @param template
	 *            Template in Json-Format or YAML format
	 * @param parameters
	 *            Map of parameters
	 * @param disableRollback boolean to enable or disable rollback
	 * @param timeOutMins timeout in minutes
	 * @return new {@link Stack} as returned from the server
	 */
	Stack create(String name, String template, Map<String, String> parameters,
                 boolean disableRollback, Long timeOutMins);

	/**
     * returns details of a {@link Stack}.
     * @param stackName
     *            Name of {@link Stack}
     * @return {@link Stack}
     */
	Stack getStackByName(String name);
	
	/**
	 * Gets a list of currently existing {@link Stack}s.
	 * 
	 * @return the list of {@link Stack}s
	 */
	List<? extends Stack> list();

	/**
	 * Gets a list of currently existing {@link Stack} objects, filtered by parameters.
	 *
	 * @param filteringParams The parameters used to filter the stacks returned.
	 *
	 * @return the list of {@link Stack} objects.
	 */
	public List<? extends Stack> list(Map<String, String> filteringParams);

	/**
	 * returns details of a {@link Stack}.
	 * 
	 * @param stackName
	 *            Name of {@link Stack}
	 * @param stackId
	 *            Id of {@link Stack}
	 * @return
	 */
	Stack getDetails(String stackName, String stackId);

	/**
	 * Deletes the specified {@link Stack} from the server.
	 * 
	 * @param stackName
	 *            Name of {@link Stack}
	 * @param stackId
	 *            Id of {@link Stack}
	 * @return the action response
	 */
	ActionResponse delete(String stackName, String stackId);

        /**
         * Deletes a stack but leaves its resources intact, and returns data that describes the stack and its resources.
         * 
         * @param stackName Name of {@link Stack}
         * @param stackId Id of {@link Stack}
         * 
         * @return <code>adopt_stack_data</code> element representing by {@link AdoptStackData}
         */
        AdoptStackData abandon(String stackName, String stackId);
        
        /**
         * Creates a stack from existing resources.
         * 
         * @param adoptStackData Structure {@link AdoptStackData}, representing existing resources
         * @param parameters Map of parameters
         * @param disableRollback Enable or disable rollback
         * @param timeOutMins Timeout in minutes
         * @param template Template in Json-Format or YAML format. It is optional, used just in case there will be new resources (not included in adoptStackData)
         * @return 
         */
        Stack adopt(AdoptStackData adoptStackData, Map<String, String> parameters,
                    boolean disableRollback, Long timeOutMins, String template);
}
