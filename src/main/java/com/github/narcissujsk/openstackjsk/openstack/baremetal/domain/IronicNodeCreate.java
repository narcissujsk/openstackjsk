package com.github.narcissujsk.openstackjsk.openstack.baremetal.domain;

import net.sf.json.JSONObject;
import com.github.narcissujsk.openstackjsk.model.baremetal.NodeCreate;
import com.github.narcissujsk.openstackjsk.model.baremetal.builder.NodeCreateBuilder;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * @author jiangsk
 */
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

    @JsonProperty("boot_interface")
    public String bootInterface;

    @JsonProperty("conductor_group")
    public String conductorGroup;

    @JsonProperty("console_interface")
    public String consoleInterface;


    @JsonProperty("deploy_interface")
    public String deployInterface;

    @JsonProperty("extra")
    public Map<String,String> extra;

    @JsonProperty("inspect_interface")
    public String inspectInterface ;


    @JsonProperty("management_interface")
    public String managementInterface  ;
    

    @JsonProperty("power_interface")
    public String powerInterface;

    @JsonProperty("raid_interface")
    public String raidInterface;

    @JsonProperty("rescue_interface")
    public String rescueInterface;


    @JsonProperty("storage_interface")
    public String storageInterface;

    @JsonProperty("vendor_interface")
    public String vendorInterface;

    @JsonProperty("owner")
    public String owner;

    @JsonProperty("description")
    public String description;

    @Override
    public String getBootInterface() {
        return bootInterface;
    }

    @Override
    public String getConductorGroup() {
        return conductorGroup;
    }

    @Override
    public String getConsoleInterface() {
        return consoleInterface;
    }

    public void setBootInterface(String bootInterface) {
        this.bootInterface = bootInterface;
    }

    public void setConductorGroup(String conductorGroup) {
        this.conductorGroup = conductorGroup;
    }

    public void setConsoleInterface(String consoleInterface) {
        this.consoleInterface = consoleInterface;
    }

    public void setDeployInterface(String deployInterface) {
        this.deployInterface = deployInterface;
    }

    public void setExtra(Map<String, String> extra) {
        this.extra = extra;
    }

    public void setInspectInterface(String inspectInterface) {
        this.inspectInterface = inspectInterface;
    }

    public void setManagementInterface(String managementInterface) {
        this.managementInterface = managementInterface;
    }

    public void setPowerInterface(String powerInterface) {
        this.powerInterface = powerInterface;
    }

    public void setRaidInterface(String raidInterface) {
        this.raidInterface = raidInterface;
    }

    public void setRescueInterface(String rescueInterface) {
        this.rescueInterface = rescueInterface;
    }

    public void setStorageInterface(String storageInterface) {
        this.storageInterface = storageInterface;
    }

    public void setVendorInterface(String vendorInterface) {
        this.vendorInterface = vendorInterface;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getDeployInterface() {
        return deployInterface;
    }

    @Override
    public Map<String, String> getExtra() {
        return extra;
    }

    @Override
    public String getInspectInterface() {
        return inspectInterface;
    }

    @Override
    public String getManagementInterface() {
        return managementInterface;
    }

    @Override
    public String getPowerInterface() {
        return powerInterface;
    }

    @Override
    public String getRaidInterface() {
        return raidInterface;
    }

    @Override
    public String getRescueInterface() {
        return rescueInterface;
    }

    @Override
    public String getStorageInterface() {
        return storageInterface;
    }

    @Override
    public String getVendorInterface() {
        return vendorInterface;
    }

    @Override
    public String getOwner() {
        return owner;
    }

    @Override
    public String getDescription() {
        return description;
    }

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
        public NodeCreateBuilder driverInfo(JSONObject driverInfo) {
            m.driverInfo = driverInfo;
            return this;
        }

        @Override
        public NodeCreateBuilder properties(JSONObject properties) {
             m.properties = properties;
            return this;
        }

        @Override
        public NodeCreateBuilder resourceClass(String resourceClass) {
             m.resourceClass = resourceClass;
            return this;
        }

        @Override
        public NodeCreateBuilder networkInterface(String networkInterface) {
             m.networkInterface = networkInterface;
            return this;
        }

        @Override
        public NodeCreateBuilder bootInterface(String bootInterface) {
             m.bootInterface = bootInterface;
            return this;
        }

        @Override
        public NodeCreateBuilder conductorGroup(String conductorGroup) {
             m.conductorGroup = conductorGroup;
            return this;
        }

        @Override
        public NodeCreateBuilder consoleInterface(String consoleInterface) {
             m.consoleInterface = consoleInterface;
            return this;
        }

        @Override
        public NodeCreateBuilder deployInterface(String deployInterface) {
             m.deployInterface = deployInterface;
            return this;
        }


        @Override
        public NodeCreateBuilder extra(Map<String, String> extra) {
             m.extra = extra;
            return this;
        }

        @Override
        public NodeCreateBuilder inspectInterface(String inspectInterface) {
             m.inspectInterface = inspectInterface;
            return this;
        }

        @Override
        public NodeCreateBuilder managementInterface(String managementInterface) {
             m.managementInterface = managementInterface;
            return this;
        }

        @Override
        public NodeCreateBuilder powerInterface(String powerInterface) {
             m.powerInterface = powerInterface;
            return this;
        }

        @Override
        public NodeCreateBuilder raidInterface(String raidInterface) {
             m.raidInterface = raidInterface;
            return this;
        }

        @Override
        public NodeCreateBuilder rescueInterface(String rescueInterface) {
             m.rescueInterface = rescueInterface;
            return this;
        }

        @Override
        public NodeCreateBuilder storageInterface(String storageInterface) {
             m.storageInterface = storageInterface;
            return this;
        }

        @Override
        public NodeCreateBuilder vendorInterface(String vendorInterface) {
             m.vendorInterface = vendorInterface;
            return this;
        }

        @Override
        public NodeCreateBuilder owner(String owner) {
             m.owner = owner;
            return this;
        }

        @Override
        public NodeCreateBuilder description(String description) {
             m.description = description;
            return this;
        }

        @Override
        public NodeCreate build()  {
            return m;
        }

        @Override
        public NodeCreateBuilder from(NodeCreate in) {
            m = (IronicNodeCreate) in;
            return this;
        }
    }
}
