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


    public String getName();

    public String getDriver() ;

    public JSONObject getDriverInfo();

    public JSONObject getProperties();

    public String getNetworkInterface() ;

    public String getResourceClass();


}
