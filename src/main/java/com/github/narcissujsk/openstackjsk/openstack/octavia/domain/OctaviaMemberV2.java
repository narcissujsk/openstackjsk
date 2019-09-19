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
package com.github.narcissujsk.openstackjsk.openstack.octavia.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;
import com.github.narcissujsk.openstackjsk.model.octavia.MemberV2;
import com.github.narcissujsk.openstackjsk.model.octavia.builder.MemberV2Builder;
import com.github.narcissujsk.openstackjsk.openstack.common.ListResult;

import java.util.List;

/**
 * A member of a v2 lbaas pool
 * @author wei
 */
@JsonRootName("member")
@JsonIgnoreProperties(ignoreUnknown = true)
public class OctaviaMemberV2 implements MemberV2 {
    private String id;

    @JsonProperty("project_id")
    private String projectId;

    private String address;

    @JsonProperty("protocol_port")
    private Integer protocolPort;

    /**
     * 1~100
     */
    private Integer weight;

    @JsonProperty("subnet_id")
    private String subnetId;

    @JsonProperty("admin_state_up")
    private boolean adminStateUp = true;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isAdminStateUp(){
        return adminStateUp;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getSubnetId(){
        return subnetId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer getWeight(){
        return weight;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer getProtocolPort(){
        return protocolPort;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getAddress(){
        return address;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getProjectId(){
        return projectId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getId(){
        return id;
    }

    @Override
    public String toString(){
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("projectId", projectId)
                .add("address", address)
                .add("protocolPort", protocolPort)
                .add("adminStateUp", adminStateUp)
                .add("weight",weight)
                .add("subnetId",subnetId)
                .toString();
    }

    public static class MembersV2 extends ListResult<OctaviaMemberV2> {
        @JsonProperty("members")
        List<OctaviaMemberV2> members;

        /**
         * {@inheritDoc}
         */
        @Override
        protected List<OctaviaMemberV2> value() {
            return members;
        }

        @Override
        public String toString() {
            return MoreObjects.toStringHelper(this)
                    .add("members", members)
                    .toString();
        }
    }

    /**
     * MemberV2 create builder
     */
    public static class MemberV2ConcreteBuilder implements MemberV2Builder {
        private OctaviaMemberV2 m;

        public MemberV2ConcreteBuilder() {
            this(new OctaviaMemberV2());
        }

        public MemberV2ConcreteBuilder(OctaviaMemberV2 m) {
            this.m = m;
        }

        @Override
        public MemberV2 build(){
            return m;
        }

        @Override
        public MemberV2Builder from(MemberV2 in){
            m = (OctaviaMemberV2) in;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public MemberV2Builder projectId(String projectId){
            m.projectId = projectId;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public MemberV2Builder address(String address){
            m.address = address;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public MemberV2Builder protocolPort(Integer protocolPort){
            m.protocolPort = protocolPort;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public MemberV2Builder subnetId(String subnetId){
            m.subnetId = subnetId;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public MemberV2Builder weight(Integer weight){
            m.weight = weight;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public MemberV2Builder adminStateUp(boolean adminStateUp){
            m.adminStateUp = adminStateUp;
            return this;
        }
    }

    @Override
    public MemberV2Builder toBuilder(){
        return new MemberV2ConcreteBuilder(this);
    }

    public static MemberV2Builder builder(){
        return new MemberV2ConcreteBuilder();
    }
}
