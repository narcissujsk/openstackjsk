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
package com.github.narcissujsk.openstackjsk.openstack.networking.domain.ext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;
import com.github.narcissujsk.openstackjsk.model.network.ext.LoadBalancerV2Update;
import com.github.narcissujsk.openstackjsk.model.network.ext.builder.LoadBalancerV2UpdateBuilder;

/**
 * Entity used to update lbaas v2 loadbalancer
 * @author emjburns
 */
@JsonRootName("loadbalancer")
@JsonIgnoreProperties(ignoreUnknown = true)
public class NeutronLoadBalancerV2Update implements LoadBalancerV2Update {

    private String name;

    private String description;

    @JsonProperty("admin_state_up")
    private boolean adminStateUp = true;

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDescription(){
        return description;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName(){
        return name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isAdminStateUp(){
        return adminStateUp;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("adminStateUp", adminStateUp)
                .add("description", description)
                .add("name", name)
                .toString();
    }

    public static class LoadBalancerV2UpdateConcreteBuilder implements LoadBalancerV2UpdateBuilder {

        private NeutronLoadBalancerV2Update m;

        public LoadBalancerV2UpdateConcreteBuilder (){
            this(new NeutronLoadBalancerV2Update());
        }

        public LoadBalancerV2UpdateConcreteBuilder (NeutronLoadBalancerV2Update m){
            this.m = m;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public LoadBalancerV2Update build(){
            return m;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public LoadBalancerV2UpdateBuilder from(LoadBalancerV2Update in){
            m = (NeutronLoadBalancerV2Update) in;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public LoadBalancerV2UpdateBuilder description(String description){
            m.description = description;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public LoadBalancerV2UpdateBuilder name(String name){
            m.name = name;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public LoadBalancerV2UpdateBuilder adminStateUp(boolean adminStateUp){
            m.adminStateUp = adminStateUp;
            return this;
        }

    }
    public static LoadBalancerV2UpdateBuilder builder(){
        return new LoadBalancerV2UpdateConcreteBuilder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoadBalancerV2UpdateBuilder toBuilder(){
        return new LoadBalancerV2UpdateConcreteBuilder();
    }
}
