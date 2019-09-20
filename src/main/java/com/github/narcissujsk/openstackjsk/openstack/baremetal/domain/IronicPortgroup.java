package com.github.narcissujsk.openstackjsk.openstack.baremetal.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.narcissujsk.openstackjsk.model.baremetal.Portgroup;
import com.github.narcissujsk.openstackjsk.model.baremetal.builder.IronicPortgroupBuilder;
import com.github.narcissujsk.openstackjsk.openstack.common.GenericLink;
import net.sf.json.JSONObject;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown=true)
public class IronicPortgroup implements Portgroup {

    @JsonProperty("name")
    public String name;

    @JsonProperty("uuid")
    public String uuid;
    @JsonProperty("address")
    public String address;

    @JsonProperty("created_at")
    public String createdAt;

    @JsonProperty("updated_at")
    public String updatedAt;


    @JsonProperty("node_uuid")
    public String nodeUuid;

    public List<GenericLink> links;




    @JsonProperty("extra")
    public JSONObject extra;

    @JsonProperty("internal_info")
    public JSONObject internalInfo;



    @Override
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getNodeUuid() {
        return nodeUuid;
    }

    public void setNodeUuid(String nodeUuid) {
        this.nodeUuid = nodeUuid;
    }



    public static IronicPortgroupConcreteBuilder builder() {
         return new IronicPortgroupConcreteBuilder();
    }

    @Override
    public IronicPortgroupConcreteBuilder toBuilder() {
        return new IronicPortgroupConcreteBuilder(this);
    }

    public static class IronicPortgroupConcreteBuilder implements IronicPortgroupBuilder {

        private IronicPortgroup m;

        IronicPortgroupConcreteBuilder() {
            this(new IronicPortgroup());
        }

        IronicPortgroupConcreteBuilder(IronicPortgroup model) {
            this.m = model;
        }

        @Override
        public IronicPortgroup build() {
            return m;
        }

        @Override
        public IronicPortgroupBuilder from(Portgroup in) {
            m = (IronicPortgroup) in;
            return this;
        }

        @Override
        public IronicPortgroupBuilder name(String name) {
            m.name = name;
            return this;
        }

        @Override
        public IronicPortgroupBuilder address(String address) {
            m.address = address;
            return this;
        }

        @Override
        public IronicPortgroupBuilder nodeUuid(String nodeUuid) {
            m.nodeUuid = nodeUuid;
            return this;
        }
    }
    @Override
    public String toString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return this.uuid;
    }
}
