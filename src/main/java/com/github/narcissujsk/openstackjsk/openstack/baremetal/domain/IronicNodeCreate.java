package com.github.narcissujsk.openstackjsk.openstack.baremetal.domain;

import net.sf.json.JSONObject;
import com.github.narcissujsk.openstackjsk.model.baremetal.NodeCreate;
import com.github.narcissujsk.openstackjsk.model.baremetal.builder.NodeCreateBuilder;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.narcissujsk.openstackjsk.model.compute.builder.ServerCreateBuilder;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaServerCreate;

/**
 * @program: openstack4j-core
 * @description:
 * @author: jiangsk@inspur.com
 * @create: 2019-09-10 14:42
 **/
public class IronicNodeCreate implements NodeCreate {

    @JsonProperty("name")
    public String name;

    @JsonProperty("driver")
    public String driver ;

    @JsonProperty("driver_info")
    public JSONObject driverInfo ;

    @JsonProperty("properties")
    public JSONObject properties ;

    @JsonProperty("resource_class")
    public String resourceClass;

    @JsonProperty("network_interface")
    public String networkInterface;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Override
    public JSONObject getDriverInfo() {
        return driverInfo;
    }

    public void setDriverInfo(JSONObject driverInfo) {
        this.driverInfo = driverInfo;
    }

    @Override
    public JSONObject getProperties() {
        return properties;
    }

    public void setProperties(JSONObject properties) {
        this.properties = properties;
    }

    @Override
    public String getResourceClass() {
        return resourceClass;
    }

    public void setResourceClass(String resourceClass) {
        this.resourceClass = resourceClass;
    }

    @Override
    public String getNetworkInterface() {
        return networkInterface;
    }

    public void setNetworkInterface(String networkInterface) {
        this.networkInterface = networkInterface;
    }

    public static NodeCreateBuilder builder() {
        return  new NodeCreateConcreteBuilder();
    }


    @Override
    public  NodeCreateBuilder toBuilder() {
        return new NodeCreateConcreteBuilder(this);
    }

    public static class NodeCreateConcreteBuilder implements NodeCreateBuilder {

        IronicNodeCreate m;

        NodeCreateConcreteBuilder() {
            this(new IronicNodeCreate());
        }

        NodeCreateConcreteBuilder(IronicNodeCreate m) {
            this.m = m;
        }

        @Override
        public NodeCreateConcreteBuilder name(String name) {
            m.name = name;
            return this;
        }

        @Override
        public NodeCreateBuilder driver(String driver) {
            m.driver = driver;
            return this;
        }

        @Override
        public NodeCreate build() {
            return m;
        }

        @Override
        public NodeCreateBuilder from(NodeCreate in) {
            m = (IronicNodeCreate) in;
            return this;
        }
    }
}
