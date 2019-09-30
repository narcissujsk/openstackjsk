package com.github.narcissujsk.openstackjsk.openstack.baremetal.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.narcissujsk.openstackjsk.model.baremetal.Connector;
import com.github.narcissujsk.openstackjsk.model.baremetal.builder.ConnectorBuilder;
import com.github.narcissujsk.openstackjsk.openstack.common.GenericLink;
import net.sf.json.JSONObject;

import java.util.List;
import java.util.Map;

/**
 * @program: openstackjsk
 * @description:
 * @author: jiangsk@inspur.com
 * @create: 2019-09-30 14:43
 **/
@JsonIgnoreProperties(ignoreUnknown=true)
public class VolumeConnector implements Connector {

    @JsonProperty("uuid")
    public String uuid;

    @JsonProperty("type")
    public String type;

    @JsonProperty("connector_id")
    public String connectorId;

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
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
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
    public ConnectorBuilder toBuilder() {
        return new VloumeConnectorBuilder(this);
    }
    public static ConnectorBuilder builder() {
        return new VloumeConnectorBuilder();
    }


    public static class VloumeConnectorBuilder implements ConnectorBuilder{
        private VolumeConnector m;

        public VloumeConnectorBuilder(VolumeConnector volumeConnector) {
            this.m = volumeConnector;
        }

        public VloumeConnectorBuilder() {
            this(new VolumeConnector());
        }


        @Override
        public ConnectorBuilder nodeUuid(String nodeUuid) {
            m.nodeUuid=nodeUuid;
            return this;
        }

        @Override
        public ConnectorBuilder type(String type) {
            m.type=type;
            return this;
        }

        @Override
        public ConnectorBuilder connectorId(String connectorId) {
            m.connectorId=connectorId;
            return this;
        }

        @Override
        public ConnectorBuilder extra(Map<String,String> extra) {
            m.extra=extra;
            return this;
        }

        @Override
        public Connector build() {
            return m;
        }

        @Override
        public ConnectorBuilder from(Connector in) {
            m = (VolumeConnector) in;
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
