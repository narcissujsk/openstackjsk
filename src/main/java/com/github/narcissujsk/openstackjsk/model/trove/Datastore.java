package com.github.narcissujsk.openstackjsk.model.trove;

import java.util.List;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.openstack.trove.domain.TroveDatastoreVersion;

/**
 * Datastore Model Entity
 *
 * @author sumit gandhi
 */
public interface Datastore extends ModelEntity {

    String getName();

    String getId();

    String getDefault_version();

    List<TroveDatastoreVersion> getTroveDatastoreVersionList();
}
