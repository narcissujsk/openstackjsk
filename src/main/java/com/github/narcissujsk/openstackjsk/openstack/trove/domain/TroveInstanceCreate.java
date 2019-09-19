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
package com.github.narcissujsk.openstackjsk.openstack.trove.domain;

import com.github.narcissujsk.openstackjsk.model.trove.Datastore;
import com.github.narcissujsk.openstackjsk.model.trove.InstanceCreate;
import com.github.narcissujsk.openstackjsk.model.trove.builder.InstanceCreateBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Model implementation for Database instance creation
 *
 * @author Shital Patil
 */

@JsonRootName("instance")
public class TroveInstanceCreate implements InstanceCreate {

    private static final long serialVersionUID = 1L;

    @JsonProperty("volume")
    private Volume volume;
    @JsonProperty("flavorRef")
    private String flavorRef;
    @JsonProperty("name")
    private String name;
    @JsonProperty("datastore")
    private Datastore datastore;

    /**
     *
     * @param volume
     *            The volume
     */
    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    /**
     *
     * @param flavorRef
     *            The flavorRef
     */
    @Override
    public void setFlavor(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    /**
     *
     * @param name
     *            The name
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @param volumeType
     */
    @Override
    public void setVolumetype(String volumeType) {
        this.volume.setType(volumeType);
    }

    /**
     * 
     * @param size
     */
    @Override
    public void setvolumeSize(int size) {
        this.volume.setSize(size);
    }

    /**
     * @param datastore
     */
    @Override
    public void setDatastore(Datastore datastore) {
        this.datastore = datastore;
    }

    public class Volume {

        @JsonProperty("type")
        private String type;
        @JsonProperty("size")
        private Integer size;

        /**
         *
         * @return
         *         The type
         */

        public String getType() {
            return type;
        }

        /**
         *
         * @param type
         *            The type
         */

        public void setType(String type) {
            this.type = type;
        }

        /**
         *
         * @param size
         *            The size
         */

        public int getSize() {
            return size;
        }

        /**
         *
         * @param size
         *            The size
         */

        public void setSize(Integer size) {
            this.size = size;
        }

    }

    public static class ConcereteInstanceBuilder implements InstanceCreateBuilder {
        private TroveInstanceCreate instance;

        public ConcereteInstanceBuilder() {
            this(new TroveInstanceCreate());
        }

        public ConcereteInstanceBuilder(TroveInstanceCreate instance) {
            this.instance = instance;
            this.instance.setVolume(instance.new Volume());
        }

        @Override
        public InstanceCreate build() {
            return instance;
        }

        @Override
        public InstanceCreateBuilder from(InstanceCreate in) {
            instance = (TroveInstanceCreate) in;
            return this;
        }

        @Override
        public InstanceCreateBuilder flavor(String flavorRef) {
            instance.setFlavor(flavorRef);
            return this;
        }

        @Override
        public InstanceCreateBuilder name(String name) {
            instance.setName(name);
            return this;
        }

        @Override
        public InstanceCreateBuilder datastore(Datastore datastore) {
            instance.setDatastore(datastore);
            return this;
        }

        @Override
        public InstanceCreateBuilder volumeType(String volumeType) {
            instance.setVolumetype(volumeType);
            return this;
        }

        @Override
        public InstanceCreateBuilder volumeSize(int size) {
            instance.setvolumeSize(size);
            return this;
        }

    }

    public static InstanceCreateBuilder builder() {
        return new ConcereteInstanceBuilder();
    }

    @Override
    public InstanceCreateBuilder toBuilder() {
        return new ConcereteInstanceBuilder(this);
    }

}
