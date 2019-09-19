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
import com.github.narcissujsk.openstackjsk.model.trove.DatabaseUser;
import com.github.narcissujsk.openstackjsk.openstack.trove.domain.TroveDatabase.Databases;
import com.github.narcissujsk.openstackjsk.openstack.trove.domain.TroveDatabaseUser.DatabaseUsers;

import java.util.List;

/**
 * This interface defines all methods for the manipulation of trove database instance users
 *
 * @author sumit gandhi
 */

public interface UserService {

    /**
     * Returns list of all users for the database instance
     * @param instanceId
     * @return the list of users for the database instance
     */
    List<? extends DatabaseUser> list(String instanceId);

    /**
     * Returns list of all databases which the user has access to on the database instance
     * @param instanceId
     * @param userName
     * @return the list of databases for a user
     */
    List<? extends Database> listUserDatabases(String instanceId, String userName);

    /**
     * Create a user for the database instance
     * @param instanceId
     * @param databaseUsers
     * @return the action response
     */
    ActionResponse create(String instanceId, DatabaseUsers databaseUsers);

    /**
     * Deletes a user for the database instance
     * @param instanceId
     * @param userName
     * @return the action response
     */
    ActionResponse delete(String instanceId, String userName);

    /**
     * Grant user access to a database on the database instance
     * @param instanceId
     * @param userName
     * @param databases
     * @return the action response
     */
    ActionResponse grantUserDBAccess(String instanceId, String userName, Databases databases);

    /**
     * Revoke user access to a database on the database instance
     * @param instanceId
     * @param userName
     * @param dbName
     * @return the action response
     */
    ActionResponse revokeUserDBAccess(String instanceId, String userName, String dbName);


}
