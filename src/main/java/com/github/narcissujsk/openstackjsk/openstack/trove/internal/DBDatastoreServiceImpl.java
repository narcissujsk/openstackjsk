package com.github.narcissujsk.openstackjsk.openstack.trove.internal;

import com.github.narcissujsk.openstackjsk.api.trove.DatastoreService;
import com.github.narcissujsk.openstackjsk.model.trove.Datastore;
import com.github.narcissujsk.openstackjsk.model.trove.DatastoreVersion;
import com.github.narcissujsk.openstackjsk.openstack.trove.domain.TroveDatastore;
import com.github.narcissujsk.openstackjsk.openstack.trove.domain.TroveDatastore.Datastores;
import com.github.narcissujsk.openstackjsk.openstack.trove.domain.TroveDatastoreVersion;
import com.github.narcissujsk.openstackjsk.openstack.trove.domain.TroveDatastoreVersion.Versions;
import com.github.narcissujsk.openstackjsk.openstack.trove.internal.BaseTroveServices;

import java.util.List;

/**
 * Datastore API Implementation
 *
 * @author sumit gandhi
 */
public class DBDatastoreServiceImpl extends BaseTroveServices implements DatastoreService {

    @Override
    public List<? extends Datastore> list() {
        return get(Datastores.class, uri("/datastores")).execute().getList();
    }

    @Override
    public Datastore get(String id) {
        return get(TroveDatastore.class, uri("/datastores/%s", id)).execute();
    }

    @Override
    public List<? extends DatastoreVersion> listDatastoreVersions(String datasoreId) {
        return get(Versions.class, uri("/datastores/%s/versions",datasoreId)).execute().getList();
    }

    @Override
    public DatastoreVersion getDatastoreVersion(String datastoreId, String versionId) {
        return get(TroveDatastoreVersion.class, uri("/datastores/%s/versions/%s",datastoreId,versionId)).execute();
    }

}
