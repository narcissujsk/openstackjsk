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

import com.github.narcissujsk.openstackjsk.api.trove.*;
import com.github.narcissujsk.openstackjsk.api.trove.UserService;
import com.github.narcissujsk.openstackjsk.common.RestService;

/**
 * This interface contains all available Trove Services
 *
 * @author sumit gandhi
 *
 */
public interface TroveService extends RestService {

    /**
     * Service implementation which provides methods for manipulation of databases
     *
     * @return DatabaseService
     */
    DatabaseService databaseService();

    /**
     * Service implementation which provides methods for manipulation of database users
     *
     * @return UserService
     */
    UserService databaseUsersService();

    /**
     * Service implementation which provides methods for manipulation of datastores
     *
     * @return DatastoreService
     */
    DatastoreService datastoreService();

    /**
     * Service implementation which provides methods for manipulation of database instance flavors
     *
     * @return DBInstanceFlavorService
     */
    InstanceFlavorService flavorService();

    /**
     * Service implementation which provides methods for manipulation of database instances
     *
     * @return InstanceService
     */
    InstanceService instanceService();

}
