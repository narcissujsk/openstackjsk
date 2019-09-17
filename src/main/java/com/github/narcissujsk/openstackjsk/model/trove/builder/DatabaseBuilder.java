package com.github.narcissujsk.openstackjsk.model.trove.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.trove.Database;

/**
 * Created by sumit gandhi on 8/19/2016.
 */
public interface DatabaseBuilder extends Buildable.Builder<DatabaseBuilder, Database>{

    DatabaseBuilder name(String name);
    DatabaseBuilder dbCharacterSet(String dbCharacterSet);
    DatabaseBuilder dbCollation(String dbCollation);

}
