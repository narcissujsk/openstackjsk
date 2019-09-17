package com.github.narcissujsk.openstackjsk.model.baremetal;
import net.sf.json.JSONObject;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.common.Link;
import com.github.narcissujsk.openstackjsk.openstack.common.GenericLink;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public interface Node extends ModelEntity {



    public String getUuid() ;


    public String getName();
    public String getPowerState() ;
    public String getTargetPowerState() ;
    public String getProvisionState();

    public String getTargetProvisionState() ;


    public String getMaintenance() ;

    public String getMaintenanceReason() ;

    public String getFault() ;

    public String getLastError() ;

    public String getReservation();

    public String getDriver() ;

    public JSONObject getDriverInfo();

    public JSONObject getProperties();

    public JSONObject getInstanceInfo();

    public List<GenericLink> getLinks();


    public String getInstanceUuid() ;


    public String getChassisUuid() ;

    public Map<String, Object> getExtra() ;

    public boolean isConsoleEnabled() ;

    public JSONObject getRaidConfig() ;

    public JSONObject getTargetRaidConfig() ;

    public JSONObject getCleanStep() ;


    public List<GenericLink> getPorts();

    public List<GenericLink> getPortgroups();

    public List<GenericLink> getStates();

    public String getResourceClass();

    public String getBootInterface() ;

    public String getConsoleInterface();

    public String getDeployInterface() ;
    public String getInspectInterface() ;

    public String getManagementInterface() ;

    public String getNetworkInterface() ;

    public String getPowerInterface() ;

    public String getRaidInterface() ;

    public String getRescueInterface();

    public String getStorageInterface() ;

    public ArrayList<String> getTraits() ;

    public String getVendorInterface() ;

    public List<GenericLink> getVolume() ;

    public String getConductorGroup() ;
    public Boolean getProtected();

    public String getProtectedReason() ;

    public String getOwner() ;

    public String getDescription() ;

    public String getConductor() ;

    public String getAllocationUuid() ;
}
