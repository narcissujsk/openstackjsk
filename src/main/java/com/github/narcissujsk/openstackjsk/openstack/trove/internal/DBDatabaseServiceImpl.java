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

import com.github.narcissujsk.openstackjsk.api.trove.DatabaseService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.trove.Database;
import com.github.narcissujsk.openstackjsk.openstack.trove.domain.TroveDatabase.Databases;
import com.github.narcissujsk.openstackjsk.openstack.trove.internal.BaseTroveServices;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Database API Implementation
 *
 * @author sumit gandhi
 */
public class DBDatabaseServiceImpl extends BaseTroveServices implements DatabaseService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Database> list(String instanceId) {
        return get(Databases.class, uri("/instances/%s/databases",instanceId)).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse create(String instanceId, Databases databases) {
        checkNotNull(instanceId);
        checkNotNull(databases);
        return post(ActionResponse.class,uri("/instances/%s/databases", instanceId)).entity(databases).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String instanceId, String dbName) {
        checkNotNull(instanceId);
        checkNotNull(dbName);
        return deleteWithResponse(uri("/instances/%s/databases/%s",instanceId,dbName)).execute();
    }

}
