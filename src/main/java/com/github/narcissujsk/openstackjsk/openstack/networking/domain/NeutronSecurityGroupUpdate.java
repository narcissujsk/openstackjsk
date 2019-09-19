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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;
import com.github.narcissujsk.openstackjsk.model.network.SecurityGroupUpdate;
import com.github.narcissujsk.openstackjsk.model.network.builder.NetSecurityGroupUpdateBuilder;

/**
 * An OpenStack Neutron Security Group Update model.
 * <p>
 * Created by Ayberk CAL on 17.03.2017.
 */
@JsonRootName("security_group")
public class NeutronSecurityGroupUpdate implements SecurityGroupUpdate {

    private static final long serialVersionUID = 1L;
    @JsonProperty("security_group_id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;


    /**
     * {@inheritDoc}
     */
    public static NetSecurityGroupUpdateBuilder builder() {
        return new NetSecurityGroupUpdateConcreteBuilder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).omitNullValues()
                .add("name", name).add("description", description).add("id", id)
                .toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetSecurityGroupUpdateBuilder toBuilder() {
        return new NetSecurityGroupUpdateConcreteBuilder(this);
    }


    /**
     * The Class NetSecurityGroupUpdateConcreteBuilder.
     *
     * @author ayberk
     */
    public static class NetSecurityGroupUpdateConcreteBuilder implements NetSecurityGroupUpdateBuilder {

        private NeutronSecurityGroupUpdate model;

        public NetSecurityGroupUpdateConcreteBuilder() {
            this.model = new NeutronSecurityGroupUpdate();
        }

        public NetSecurityGroupUpdateConcreteBuilder(NeutronSecurityGroupUpdate model) {
            this.model = model;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public NeutronSecurityGroupUpdate build() {
            return model;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public NetSecurityGroupUpdateBuilder from(SecurityGroupUpdate in) {
            model = (NeutronSecurityGroupUpdate) in;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public NetSecurityGroupUpdateBuilder name(String name) {
            model.name = name;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public NetSecurityGroupUpdateBuilder description(String description) {
            model.description = description;
            return this;
        }
    }
}
