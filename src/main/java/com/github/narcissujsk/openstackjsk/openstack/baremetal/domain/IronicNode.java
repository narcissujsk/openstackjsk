package com.github.narcissujsk.openstackjsk.openstack.baremetal.domain;

import com.fasterxml.jackson.annotation.*;
import net.sf.json.JSONObject;
import com.github.narcissujsk.openstackjsk.model.baremetal.Node;
import com.github.narcissujsk.openstackjsk.openstack.common.GenericLink;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;



@JsonIgnoreProperties(ignoreUnknown=true)
public class IronicNode implements Node {
    public static final long serialVersionUID = 1L;

    @JsonProperty("uuid")
    public String uuid;

    @JsonProperty("name")
    public String name;


    @JsonProperty("power_state")
    public String powerState;

    @JsonProperty("target_power_state")
    public String targetPowerState;

    @JsonProperty("provision_state")
    public String provisionState;

    @JsonProperty("target_provision_state")
    public String targetProvisionState;

    @JsonProperty("maintenance")
    public String maintenance;


    @JsonProperty("maintenance_reason")
    public String maintenanceReason;

    @JsonProperty("fault")
    public String fault ;

    @JsonProperty("last_error")
    public String lastError ;


    @JsonProperty("reservation")
    public String reservation ;


    @JsonProperty("driver")
    public String driver ;

    @JsonProperty("driver_info")
    public JSONObject driverInfo ;

    @JsonProperty("properties")
    public JSONObject properties ;

    @JsonProperty("instance_info")
    public JSONObject instanceInfo ;

    @JsonProperty("instance_uuid")
    public String instanceUuid;

    @JsonProperty("chassis_uuid")
    public String chassisUuid;


    @JsonProperty("extra")
    public Map<String,String> extra;

    @JsonProperty("console_enabled")
    public boolean consoleEnabled;

    @JsonProperty("raid_config")
    public JSONObject raidConfig  ;

    @JsonProperty("target_raid_config")
    public JSONObject targetRaidConfig  ;

    @JsonProperty("clean_step")
    public JSONObject cleanStep   ;



    public List<GenericLink> links;

    public List<GenericLink> ports;

    public List<GenericLink> portgroups;

    public List<GenericLink> states;

    @JsonProperty("resource_class")
    public String resourceClass;

    @JsonProperty("boot_interface")
    public String bootInterface;

    @JsonProperty("console_interface")
    public String consoleInterface;

    @JsonProperty("deploy_interface")
    public String deployInterface;

    @JsonProperty("inspect_interface")
    public String inspectInterface;

    @JsonProperty("management_interface")
    public String managementInterface;

    @JsonProperty("network_interface")
    public String networkInterface;

    @JsonProperty("power_interface")
    public String powerInterface;

    @JsonProperty("raid_interface")
    public String raidInterface;

    @JsonProperty("rescue_interface")
    public String rescueInterface;

    @JsonProperty("storage_interface")
    public String storageInterface;

    @JsonProperty("traits")
    public ArrayList<String> traits;

    @JsonProperty("vendor_interface")
    public String vendorInterface;

    public List<GenericLink> volume;


    @JsonProperty("conductor_group")
    public String conductorGroup;


    @JsonProperty("protected")
    public Boolean isProtected ;


    @JsonProperty("protected_reason")
    public String protectedReason ;

    @JsonProperty("owner")
    public String owner  ;

    @JsonProperty("description")
    public String description ;

    @JsonProperty("conductor")
    public String conductor  ;

    @JsonProperty("allocation_uuid")
    public String allocationUuid ;


    @Override
    public String getUuid() {
        return uuid;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPowerState() {
        return powerState;
    }

    @Override
    public String getTargetPowerState() {
        return targetPowerState;
    }

    @Override
    public String getProvisionState() {
        return provisionState;
    }

    @Override
    public String getTargetProvisionState() {
        return targetProvisionState;
    }

    @Override
    public String getMaintenance() {
        return maintenance;
    }

    @Override
    public String getChassisUuid() {
        return chassisUuid;
    }

    @Override
    public Map<String, String> getExtra() {
        return extra;
    }

    @Override
    public boolean isConsoleEnabled() {
        return consoleEnabled;
    }

    @Override
    public JSONObject getRaidConfig() {
        return raidConfig;
    }

    @Override
    public JSONObject getTargetRaidConfig() {
        return targetRaidConfig;
    }

    @Override
    public JSONObject getCleanStep() {
        return cleanStep;
    }

    @Override
    public List<GenericLink> getPorts() {
        return ports;
    }

    @Override
    public List<GenericLink> getPortgroups() {
        return portgroups;
    }

    @Override
    public List<GenericLink> getStates() {
        return states;
    }

    @Override
    public String getResourceClass() {
        return resourceClass;
    }

    @Override
    public String getBootInterface() {
        return bootInterface;
    }

    @Override
    public String getConsoleInterface() {
        return consoleInterface;
    }

    @Override
    public String getDeployInterface() {
        return deployInterface;
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
    public String getNetworkInterface() {
        return networkInterface;
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
    public ArrayList<String> getTraits() {
        return traits;
    }

    @Override
    public String getVendorInterface() {
        return vendorInterface;
    }

    @Override
    public List<GenericLink> getVolume() {
        return volume;
    }

    @Override
    public String getConductorGroup() {
        return conductorGroup;
    }

    @Override
    public Boolean getProtected() {
        return isProtected;
    }

    @Override
    public String getProtectedReason() {
        return protectedReason;
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
    public String getConductor() {
        return conductor;
    }

    @Override
    public String getAllocationUuid() {
        return allocationUuid;
    }

    @Override
    public String getMaintenanceReason() {
        return maintenanceReason;
    }

    @Override
    public String getFault() {
        return fault;
    }

    @Override
    public String getLastError() {
        return lastError;
    }

    @Override
    public String getReservation() {
        return reservation;
    }

    @Override
    public String getDriver() {
        return driver;
    }

    @Override
    public JSONObject getDriverInfo() {
        return driverInfo;
    }

    @Override
    public JSONObject getProperties() {
        return properties;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPowerState(String powerState) {
        this.powerState = powerState;
    }

    public void setTargetPowerState(String targetPowerState) {
        this.targetPowerState = targetPowerState;
    }

    public void setProvisionState(String provisionState) {
        this.provisionState = provisionState;
    }

    public void setTargetProvisionState(String targetProvisionState) {
        this.targetProvisionState = targetProvisionState;
    }

    public void setMaintenance(String maintenance) {
        this.maintenance = maintenance;
    }

    public void setMaintenanceReason(String maintenanceReason) {
        this.maintenanceReason = maintenanceReason;
    }

    public void setFault(String fault) {
        this.fault = fault;
    }

    public void setLastError(String lastError) {
        this.lastError = lastError;
    }

    public void setReservation(String reservation) {
        this.reservation = reservation;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setDriverInfo(JSONObject driverInfo) {
        this.driverInfo = driverInfo;
    }

    public void setProperties(JSONObject properties) {
        this.properties = properties;
    }

    public void setLinks(List<GenericLink> links) {
        this.links = links;
    }

    public void setInstanceUuid(String instanceUuid) {
        this.instanceUuid = instanceUuid;
    }

    @Override
    public List<GenericLink> getLinks() {
        return links;
    }

    @Override
    public String getInstanceUuid() {
        return instanceUuid;
    }



    @Override
    public JSONObject getInstanceInfo() {
        return instanceInfo;
    }



    public void setInstanceInfo(JSONObject instanceInfo) {
        this.instanceInfo = instanceInfo;
    }

    public void setChassisUuid(String chassisUuid) {
        this.chassisUuid = chassisUuid;
    }

    public void setExtra(Map<String, String> extra) {
        this.extra = extra;
    }

    public void setConsoleEnabled(boolean consoleEnabled) {
        this.consoleEnabled = consoleEnabled;
    }

    public void setRaidConfig(JSONObject raidConfig) {
        this.raidConfig = raidConfig;
    }

    public void setTargetRaidConfig(JSONObject targetRaidConfig) {
        this.targetRaidConfig = targetRaidConfig;
    }

    public void setCleanStep(JSONObject cleanStep) {
        this.cleanStep = cleanStep;
    }


    public void setPorts(List<GenericLink> ports) {
        this.ports = ports;
    }

    public void setPortgroups(List<GenericLink> portgroups) {
        this.portgroups = portgroups;
    }

    public void setStates(List<GenericLink> states) {
        this.states = states;
    }

    public void setResourceClass(String resourceClass) {
        this.resourceClass = resourceClass;
    }

    public void setBootInterface(String bootInterface) {
        this.bootInterface = bootInterface;
    }

    public void setConsoleInterface(String consoleInterface) {
        this.consoleInterface = consoleInterface;
    }

    public void setDeployInterface(String deployInterface) {
        this.deployInterface = deployInterface;
    }

    public void setInspectInterface(String inspectInterface) {
        this.inspectInterface = inspectInterface;
    }

    public void setManagementInterface(String managementInterface) {
        this.managementInterface = managementInterface;
    }

    public void setNetworkInterface(String networkInterface) {
        this.networkInterface = networkInterface;
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

    public void setTraits(ArrayList<String> traits) {
        this.traits = traits;
    }

    public void setVendorInterface(String vendorInterface) {
        this.vendorInterface = vendorInterface;
    }

    public void setVolume(List<GenericLink> volume) {
        this.volume = volume;
    }

    public void setConductorGroup(String conductorGroup) {
        this.conductorGroup = conductorGroup;
    }

    public void setProtected(Boolean aProtected) {
        isProtected = aProtected;
    }

    public void setProtectedReason(String protectedReason) {
        this.protectedReason = protectedReason;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public void setAllocationUuid(String allocationUuid) {
        this.allocationUuid = allocationUuid;
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
