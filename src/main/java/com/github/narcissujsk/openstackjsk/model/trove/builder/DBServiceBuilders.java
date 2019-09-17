package com.github.narcissujsk.openstackjsk.model.trove.builder;

import com.github.narcissujsk.openstackjsk.model.trove.builder.DatabaseBuilder;
import com.github.narcissujsk.openstackjsk.model.trove.builder.DatabaseUserBuilder;
import com.github.narcissujsk.openstackjsk.model.trove.builder.InstanceCreateBuilder;

public interface DBServiceBuilders {

    InstanceCreateBuilder instanceCreate();

    DatabaseBuilder databaseCreate();

    DatabaseUserBuilder databaseUserCreate();

}
