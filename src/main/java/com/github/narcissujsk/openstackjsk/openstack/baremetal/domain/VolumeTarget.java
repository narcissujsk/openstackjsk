package com.github.narcissujsk.openstackjsk.openstack.baremetal.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.narcissujsk.openstackjsk.model.baremetal.Target;
import com.github.narcissujsk.openstackjsk.model.baremetal.Target;
import com.github.narcissujsk.openstackjsk.model.baremetal.builder.TargetBuilder;
import com.github.narcissujsk.openstackjsk.model.baremetal.builder.TargetBuilder;
import com.github.narcissujsk.openstackjsk.openstack.common.GenericLink;
import net.sf.json.JSONObject;

import java.util.List;
import java.util.Map;

/**
 * @program: openstackjsk
 * @description:
 * @author: jiangsk@inspur.com
 * @create: 2019-09-30 14:41
 **/
@JsonIgnoreProperties(ignoreUnknown=true)
public class VolumeTarget implements Target {

    @JsonProperty("uuid")
    public String uuid;

    @JsonProperty("volume_type")
    public String volumeType;

    @JsonProperty("properties")
    public Map<String,String> properties;

    @JsonProperty("boot_index")
    public Integer bootIndex;

    @JsonProperty("volume_id")
    public String volumeId;

    @JsonProperty("node_uuid")
    public String nodeUuid;


    @JsonProperty("extra")
    public Map<String,String> extra;

    @JsonProperty("links")
    public List<GenericLink> links;

    @Override
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    @Override
    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    @Override
    public Integer getBootIndex() {
        return bootIndex;
    }

    public void setBootIndex(Integer bootIndex) {
        this.bootIndex = bootIndex;
    }

    @Override
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    @Override
    public String getNodeUuid() {
        return nodeUuid;
    }

    public void setNodeUuid(String nodeUuid) {
        this.nodeUuid = nodeUuid;
    }

    @Override
    public Map<String, String> getExtra() {
        return extra;
    }

    public void setExtra(Map<String, String> extra) {
        this.extra = extra;
    }

    @Override
    public List<GenericLink> getLinks() {
        return links;
    }

    public void setLinks(List<GenericLink> links) {
        this.links = links;
    }


    @Override
    public TargetBuilder toBuilder() {
        return new VloumeTargetBuilder(this);
    }
    public static TargetBuilder builder() {
        return new  VloumeTargetBuilder();
    }


    public static class VloumeTargetBuilder implements TargetBuilder{
        private VolumeTarget m;

        public VloumeTargetBuilder(VolumeTarget volumeTarget) {
            this.m = volumeTarget;
        }

        public VloumeTargetBuilder() {
            this(new VolumeTarget());
        }


        @Override
        public TargetBuilder bootIndex(Integer bootIndex) {
            return null;
        }

        @Override
        public TargetBuilder nodeUuid(String nodeUuid) {
            m.nodeUuid=nodeUuid;
            return this;
        }

        @Override
        public TargetBuilder properties(Map<String, String> properties) {
            m.properties=properties;
            return this;
        }

        @Override
        public TargetBuilder volumeId(String volumeId) {
            m.volumeId=volumeId;
            return this;
        }

        @Override
        public TargetBuilder volumeType(String volumeType) {
            m.volumeType=volumeType;
            return this;
        }


        @Override
        public TargetBuilder extra(Map<String,String> extra) {
            m.extra=extra;
            return this;
        }

        @Override
        public Target build() {
            return m;
        }

        @Override
        public TargetBuilder from(Target in) {
            m = (VolumeTarget) in;
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
