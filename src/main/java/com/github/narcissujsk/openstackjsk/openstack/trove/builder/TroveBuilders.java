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
