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
package com.github.narcissujsk.openstackjsk.openstack.compute.internal.ext;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.compute.ext.MigrationService;
import com.github.narcissujsk.openstackjsk.model.compute.ext.Migration;
import com.github.narcissujsk.openstackjsk.model.compute.ext.MigrationsFilter;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.ext.ExtMigration.Migrations;
import com.github.narcissujsk.openstackjsk.openstack.compute.internal.BaseComputeServices;

/**
 * API which supports the "os-migrations" extension.  
 * 
 * @author Jeremy Unruh
 */
public class MigrationServiceImpl extends BaseComputeServices implements MigrationService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Migration> list() {
        return list(null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Migration> list(MigrationsFilter filter) {
        Invocation<Migrations> inv = get(Migrations.class, uri("/os-migrations"));
        if (filter != null) {
            inv.params(filter.getConstraints());
        }
        return inv.execute().getList();
    }

}
