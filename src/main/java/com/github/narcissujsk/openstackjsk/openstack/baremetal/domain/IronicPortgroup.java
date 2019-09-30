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
import java.util.Map;


@JsonIgnoreProperties(ignoreUnknown=true)
public class IronicPortgroup implements Portgroup {

    @JsonProperty("uuid")
    public String uuid;

    @JsonProperty("name")
    public String name;

    @JsonProperty("address")
    public String address;

    @JsonProperty("node_uuid")
    public String nodeUuid;

    @JsonProperty("standalone_ports_supported")
    public Boolean standalonePortsSupported;


    @JsonProperty("internal_info")
    public JSONObject internalInfo;


    @JsonProperty("extra")
    public Map<String,String> extra;

    @JsonProperty("mode")
    public String mode;

    @JsonProperty("properties")
    public JSONObject properties;

    @JsonProperty("created_at")
    public String createdAt;

    @JsonProperty("updated_at")
    public String updatedAt;


    public List<GenericLink> links;

    public List<GenericLink> ports;





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

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Boolean getStandalonePortsSupported() {
        return standalonePortsSupported;
    }

    public void setStandalonePortsSupported(Boolean standalonePortsSupported) {
        this.standalonePortsSupported = standalonePortsSupported;
    }

    @Override
    public JSONObject getInternalInfo() {
        return internalInfo;
    }

    public void setInternalInfo(JSONObject internalInfo) {
        this.internalInfo = internalInfo;
    }

    @Override
    public Map<String, String> getExtra() {
        return extra;
    }

    public void setExtra(Map<String, String> extra) {
        this.extra = extra;
    }

    @Override
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public JSONObject getProperties() {
        return properties;
    }

    public void setProperties(JSONObject properties) {
        this.properties = properties;
    }

    @Override
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public List<GenericLink> getLinks() {
        return links;
    }

    public void setLinks(List<GenericLink> links) {
        this.links = links;
    }

    @Override
    public List<GenericLink> getPorts() {
        return ports;
    }

    public void setPorts(List<GenericLink> ports) {
        this.ports = ports;
    }

    public static IronicPortgroupBuilder builder() {
         return new IronicPortgroupConcreteBuilder();
    }

    @Override
    public IronicPortgroupBuilder toBuilder() {
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
