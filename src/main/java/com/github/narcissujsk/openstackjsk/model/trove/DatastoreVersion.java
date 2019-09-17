package com.github.narcissujsk.openstackjsk.model.trove;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

/**
 * Datastore Version Model Entity
 *
 * @author sumit gandhi
 */
public interface DatastoreVersion extends ModelEntity {

    String getName();
    String getId();
    String getDatastoreId();
    int getIsActive();
    String getImage();
    String getPackageName();
}
