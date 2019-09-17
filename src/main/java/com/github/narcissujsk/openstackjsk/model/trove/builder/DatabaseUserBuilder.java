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
