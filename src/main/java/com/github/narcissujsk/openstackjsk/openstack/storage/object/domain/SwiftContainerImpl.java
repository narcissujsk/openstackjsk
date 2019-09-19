/*******************************************************************************
 * 	Copyright 2019 ContainX and OpenStack4j
 *
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * 	use this file except in compliance with the License. You may obtain a copy of
 * 	the License at
 *
 * 	    http://www.apache.org/licenses/LICENSE-2.0
 *
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * 	License for the specific language governing permissions and limitations under
 * 	the License.
 *******************************************************************************/
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
