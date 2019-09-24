package com.github.narcissujsk.openstackjsk.model.baremetal;
import net.sf.json.JSONObject;
import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.baremetal.builder.NodeCreateBuilder;
import com.github.narcissujsk.openstackjsk.openstack.common.GenericLink;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public interface NodeCreate extends ModelEntity, Buildable<NodeCreateBuilder> {


     String getName();

     String getDriver() ;

     JSONObject getDriverInfo();

     JSONObject getProperties();

     String getNetworkInterface() ;

     String getResourceClass();

     String getBootInterface() ;

     String getConductorGroup();

     String getConsoleInterface() ;

     String getDeployInterface();

     Map<String, String> getExtra();


     String getInspectInterface() ;

     String getManagementInterface() ;

     String getPowerInterface();

     String getRaidInterface() ;

     String getRescueInterface();

     String getStorageInterface();

     String getVendorInterface() ;

     String getOwner();

     String getDescription() ;

}
