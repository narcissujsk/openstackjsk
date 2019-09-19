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
package com.github.narcissujsk.openstackjsk.openstack.trove.internal;

import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.trove.InstanceFlavorService;
import com.github.narcissujsk.openstackjsk.api.trove.DatabaseService;
import com.github.narcissujsk.openstackjsk.api.trove.DatastoreService;
import com.github.narcissujsk.openstackjsk.api.trove.InstanceService;
import com.github.narcissujsk.openstackjsk.api.trove.TroveService;
import com.github.narcissujsk.openstackjsk.api.trove.UserService;
import com.github.narcissujsk.openstackjsk.openstack.trove.internal.BaseTroveServices;

/**
 * Trove API Implementation
 *
 * @author sumit gandhi
 */
public class TroveServiceImpl extends BaseTroveServices implements TroveService {

    /**
     * {@inheritDoc}
     */
    @Override
    public DatastoreService datastoreService() {
        return Apis.get(DatastoreService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatabaseService databaseService() {
        return Apis.get(DatabaseService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserService databaseUsersService() {
        return Apis.get(UserService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstanceFlavorService flavorService() {
        return Apis.get(InstanceFlavorService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstanceService instanceService() {
        return Apis.get(InstanceService.class);
    }

}
