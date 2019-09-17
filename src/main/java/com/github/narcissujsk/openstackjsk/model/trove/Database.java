package com.github.narcissujsk.openstackjsk.model.trove;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.trove.builder.DatabaseBuilder;

/**
 * Database Model Entity
 *
 * @author sumit gandhi
 */
public interface Database extends ModelEntity, Buildable<DatabaseBuilder> {

    String getName();
    String getDbCharacterSet();
    String getDbCollation();

}
