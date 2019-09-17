package com.github.narcissujsk.openstackjsk.model.trove;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.trove.builder.DatabaseUserBuilder;
import com.github.narcissujsk.openstackjsk.openstack.trove.domain.TroveDatabase;

import java.util.List;

/**
 * Database User Model Entity
 *
 * @author sumit gandhi
 */
public interface DatabaseUser extends ModelEntity, Buildable<DatabaseUserBuilder> {

    String getUsername();
    List<TroveDatabase> getTroveDatabaseList();
}
