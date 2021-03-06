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
package com.github.narcissujsk.openstackjsk.openstack.networking.domain;

import com.github.narcissujsk.openstackjsk.model.network.NetworkUpdate;
import com.github.narcissujsk.openstackjsk.model.network.builder.NetworkUpdateBuilder;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;

/**
 * An entity used to update a network
 *
 * @author Jeremy Unruh
 */
@JsonRootName("network")
public class NeutronNetworkUpdate implements NetworkUpdate {

    private static final long serialVersionUID = 1L;

    @JsonProperty
    private String name;
    @JsonProperty("shared")
    private Boolean shared;
    @JsonProperty("admin_state_up")
    private Boolean adminStateUp;

    public static NetworkUpdateBuilder builder() {
        return new NetworkUpdateConcreteBuilder();
    }

    @Override
    public NetworkUpdateBuilder toBuilder() {
        return new NetworkUpdateConcreteBuilder(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @JsonIgnore
    @Override
    public boolean isAdminStateUp() {
        return adminStateUp == null ? false : adminStateUp;
    }

    @JsonIgnore
    @Override
    public boolean isShared() {
        return shared == null ? false : shared;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).omitNullValues()
                  .add("name", name).add("adminStateUp", adminStateUp).add("shared", shared)
                  .toString();
    }

    public static class NetworkUpdateConcreteBuilder implements NetworkUpdateBuilder {

        private NeutronNetworkUpdate model;

        public NetworkUpdateConcreteBuilder() {
            this.model = new NeutronNetworkUpdate();
        }

        public NetworkUpdateConcreteBuilder(NeutronNetworkUpdate model) {
            this.model = model;
        }

        @Override
        public NetworkUpdate build() {
            return model;
        }

        @Override
        public NetworkUpdateBuilder from(NetworkUpdate in) {
            model = (NeutronNetworkUpdate) in;
            return this;
        }

        @Override
        public NetworkUpdateBuilder name(String name) {
            model.name = name;
            return this;
        }

        @Override
        public NetworkUpdateBuilder adminStateUp(boolean enabled) {
            model.adminStateUp = enabled;
            return this;
        }

        @Override
        public NetworkUpdateBuilder shared(boolean shared) {
            model.shared = shared;
            return this;
        }

    }
}
