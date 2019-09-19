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
package com.github.narcissujsk.openstackjsk.api.trove;

import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.trove.Database;
import com.github.narcissujsk.openstackjsk.openstack.trove.domain.TroveDatabase.Databases;

import java.util.List;

/**
 * This interface defines all methods for the manipulation of databases
 *
 * @author sumit gandhi
 */

public interface DatabaseService {

    /**
     * Gets the database specified by ID
     * @param instanceId
     * @return the database or null if not found
     */
    List<? extends Database> list(String instanceId);

    /**
     * Create a new database
     * @param id
     * @param databases
     * @return the action response
     */
    ActionResponse create(String id, Databases databases);

    /**
     * Deletes the database
     * @param instanceId
     * @param name
     * @return the action response
     */
    ActionResponse delete(String instanceId, String name);

}
