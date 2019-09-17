package com.github.narcissujsk.openstackjsk.api.trove;

import com.github.narcissujsk.openstackjsk.model.trove.Datastore;
import com.github.narcissujsk.openstackjsk.model.trove.DatastoreVersion;

import java.util.List;

/**
 * This interface defines all methods for the manipulation of trove datastores
 *
 * @author sumit gandhi
 */

public interface DatastoreService {

    /**
     * Returns list of available datastores
     * @return the list of datastores
     */
    List<? extends Datastore> list();

    /**
     * Gets a datastore specified by ID
     * @param id
     * @return the datastore or null if not found
     */
    Datastore get(String id);

    /**
     * Returns list of all datastore versions
     * @param datasoreId
     * @return list of datastore versions
     */
    List<? extends DatastoreVersion> listDatastoreVersions(String datasoreId);

    /**
     * Get the datastore version specified by ID
     * @param datastoreId
     * @param versionId
     * @return the datastore version or null if not found
     */
    DatastoreVersion getDatastoreVersion(String datastoreId, String versionId);

}
