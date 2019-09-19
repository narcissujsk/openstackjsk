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
package com.github.narcissujsk.openstackjsk.model.trove.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.trove.DatabaseUser;
import com.github.narcissujsk.openstackjsk.openstack.trove.domain.TroveDatabase;

import java.util.List;

/**
 * Created by sumit gandhi on 9/3/2016.
 */
public interface DatabaseUserBuilder extends Buildable.Builder<DatabaseUserBuilder, DatabaseUser> {

    DatabaseUserBuilder username(String username);
    DatabaseUserBuilder password(String password);
    DatabaseUserBuilder troveDatabaseList(List<TroveDatabase> troveDatabaseList);

}
