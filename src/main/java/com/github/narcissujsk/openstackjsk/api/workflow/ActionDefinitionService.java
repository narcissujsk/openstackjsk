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
package com.github.narcissujsk.openstackjsk.api.workflow;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.workflow.ActionDefinition;
import com.github.narcissujsk.openstackjsk.model.workflow.Scope;

import java.io.InputStream;
import java.util.List;

/**
 * Service that provides CRUD operations for action definitions.
 * 
 * @author Renat Akhmerov
 */
public interface ActionDefinitionService extends RestService {

    /**
     * List all action definitions with details.
     *
     * @return List of action definitions.
     */
    List<? extends ActionDefinition> list();

    /**
     * Create a new action definition.
     *
     * @param actionText Text in YAML format (Mistral language) with one or more action definitions.
     * @param scope Scope of newly created workflows.
     * @return Created action definition.
     */
    List<? extends ActionDefinition> create(InputStream actionText, Scope scope);

    /**
     * Get action definition by its identifier.
     *
     * @param identifier Action definition identifier (either ID or name).
     * @return Action definition.
     */
    ActionDefinition get(String identifier);

    /**
     * Delete action definition by its identifier.
     *
     * @param identifier Action definition identifier (either ID or name).
     * @return Action response from the server.
     */
    ActionResponse delete(String identifier);
}


