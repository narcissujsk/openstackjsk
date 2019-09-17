package com.github.narcissujsk.openstackjsk.openstack.storage.object.domain;

import java.util.Map;

import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.storage.ObjectStorageContainerService;
import com.github.narcissujsk.openstackjsk.model.storage.object.SwiftContainer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;

/**
 * Represents an OpenStack Swift Container which holds Objects
 *
 * @author Jeremy Unruh
 */
public class SwiftContainerImpl implements SwiftContainer {

    private static final long serialVersionUID = 1L;

    @JsonProperty
    private String name;

    @JsonProperty("count")
    private int objectCount;

    @JsonProperty("bytes")
    private long totalSize;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getObjectCount() {
        return objectCount;
    }

    @Override
    public long getTotalSize() {
        return totalSize;
    }

    @Override
    public Map<String, String> getMetadata() {
        return Apis.get(ObjectStorageContainerService.class).getMetadata(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).omitNullValues()
                   .add("name", name).add("count", objectCount).add("total size", totalSize)
                   .toString();
    }
}
