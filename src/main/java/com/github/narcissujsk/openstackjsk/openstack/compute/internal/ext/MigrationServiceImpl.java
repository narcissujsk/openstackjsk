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
