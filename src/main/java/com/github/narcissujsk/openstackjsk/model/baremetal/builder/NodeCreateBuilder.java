package com.github.narcissujsk.openstackjsk.model.baremetal.builder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.baremetal.*;
import net.sf.json.JSONObject;

import java.util.Map;


public interface NodeCreateBuilder extends Buildable.Builder<NodeCreateBuilder, NodeCreate> {


    NodeCreateBuilder name(String name);


    NodeCreateBuilder driver(String driver);


    NodeCreateBuilder driverInfo(JSONObject driverInfo);


    NodeCreateBuilder properties(JSONObject properties);

    NodeCreateBuilder resourceClass(String resourceClass);

    NodeCreateBuilder networkInterface(String networkInterface);

    NodeCreateBuilder bootInterface(String bootInterface);

    NodeCreateBuilder conductorGroup(String conductorGroup);

    NodeCreateBuilder consoleInterface(String consoleInterface);

    NodeCreateBuilder deployInterface(String deployInterface);

    NodeCreateBuilder extra(Map<String, String> extra);

    NodeCreateBuilder inspectInterface(String inspectInterface);

    NodeCreateBuilder managementInterface(String managementInterface);


    NodeCreateBuilder powerInterface(String powerInterface);

    NodeCreateBuilder raidInterface(String raidInterface);

    NodeCreateBuilder rescueInterface(String rescueInterface);


    NodeCreateBuilder storageInterface(String storageInterface);

    NodeCreateBuilder vendorInterface(String vendorInterface);

    NodeCreateBuilder owner(String owner);


    NodeCreateBuilder description(String description);

}
