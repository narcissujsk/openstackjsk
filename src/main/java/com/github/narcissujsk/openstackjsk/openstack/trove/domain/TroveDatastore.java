package com.github.narcissujsk.openstackjsk.openstack.trove.domain;

import java.util.List;

import com.github.narcissujsk.openstackjsk.model.trove.Datastore;
import com.github.narcissujsk.openstackjsk.openstack.common.ListResult;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.github.narcissujsk.openstackjsk.openstack.trove.domain.TroveDatastoreVersion;

/**
 * Model implementation for Datastore
 *
 * @author sumit gandhi
 */

@JsonRootName("datastore")
public class TroveDatastore implements Datastore {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String default_version;
    @JsonProperty("versions")
    private List<TroveDatastoreVersion> troveDatastoreVersionList;

    public String getDefault_version() {
        return default_version;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<TroveDatastoreVersion> getTroveDatastoreVersionList() {
        return troveDatastoreVersionList;
    }

    public static class Datastores extends ListResult<TroveDatastore> {

        private static final long serialVersionUID = 1L;
        @JsonProperty("datastores")
        private List<TroveDatastore> troveDatastoreList;

        @Override
        protected List<TroveDatastore> value() {
            return troveDatastoreList;
        }

    }

}
