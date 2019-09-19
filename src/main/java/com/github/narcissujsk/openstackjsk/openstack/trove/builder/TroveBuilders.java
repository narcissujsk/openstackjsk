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
package com.github.narcissujsk.openstackjsk.openstack.trove.builder;

import com.github.narcissujsk.openstackjsk.model.trove.builder.DBServiceBuilders;
import com.github.narcissujsk.openstackjsk.model.trove.builder.DatabaseBuilder;
import com.github.narcissujsk.openstackjsk.model.trove.builder.DatabaseUserBuilder;
import com.github.narcissujsk.openstackjsk.model.trove.builder.InstanceCreateBuilder;
import com.github.narcissujsk.openstackjsk.openstack.trove.domain.TroveDatabase;
import com.github.narcissujsk.openstackjsk.openstack.trove.domain.TroveDatabaseUser;
import com.github.narcissujsk.openstackjsk.openstack.trove.domain.TroveInstanceCreate;

/**
 * Databse service builders
 *
 * @author Shital Patil
 */

public class TroveBuilders implements DBServiceBuilders {

    @Override
    public InstanceCreateBuilder instanceCreate() {
        return TroveInstanceCreate.builder();
    }

    @Override
    public DatabaseBuilder databaseCreate() {
        return TroveDatabase.builder();
    }

    @Override
    public DatabaseUserBuilder databaseUserCreate() {
        return TroveDatabaseUser.builder();
    }

}
