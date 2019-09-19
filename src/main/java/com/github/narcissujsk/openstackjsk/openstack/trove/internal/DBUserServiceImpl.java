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

import com.github.narcissujsk.openstackjsk.api.trove.UserService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.trove.Database;
import com.github.narcissujsk.openstackjsk.model.trove.DatabaseUser;
import com.github.narcissujsk.openstackjsk.openstack.trove.domain.TroveDatabase.Databases;
import com.github.narcissujsk.openstackjsk.openstack.trove.domain.TroveDatabaseUser.DatabaseUsers;
import com.github.narcissujsk.openstackjsk.openstack.trove.internal.BaseTroveServices;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * User API Implementation
 *
 * @author sumit gandhi
 */
public class DBUserServiceImpl extends BaseTroveServices implements UserService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends DatabaseUser> list(String instanceId) {
        return get(DatabaseUsers.class, uri("/instances/%s/users",instanceId)).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Database> listUserDatabases(String instanceId, String userName) {
        return get(Databases.class, uri("/instances/%s/users/%s/databases",instanceId,userName)).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse create(String instanceId, DatabaseUsers databaseUsers) {
        return post(ActionResponse.class, uri("/instances/%s/users",instanceId)).entity(databaseUsers).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String instanceId, String userName) {
        checkNotNull(instanceId);
        checkNotNull(userName);
        return deleteWithResponse(uri("/instances/%s/users/%s",instanceId,userName)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse grantUserDBAccess(String instanceId, String userName, Databases databases) {
        checkNotNull(instanceId);
        checkNotNull(userName);
        checkNotNull(databases);
        return put(ActionResponse.class, uri("/instances/%s/users/%s/databases",instanceId,userName)).entity(databases).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse revokeUserDBAccess(String instanceId, String userName, String dbName) {
        checkNotNull(instanceId);
        checkNotNull(userName);
        checkNotNull(dbName);
        return deleteWithResponse(uri("/instances/%s/users/%s/databases/%s",instanceId,userName,dbName)).execute();
    }

}
