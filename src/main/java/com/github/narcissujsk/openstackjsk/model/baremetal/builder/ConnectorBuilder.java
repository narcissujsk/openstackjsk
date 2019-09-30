package com.github.narcissujsk.openstackjsk.model.baremetal.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.baremetal.Connector;
import com.github.narcissujsk.openstackjsk.model.baremetal.Target;
import net.sf.json.JSONObject;

import java.util.Map;


public interface ConnectorBuilder extends Buildable.Builder<ConnectorBuilder, Connector> {



    ConnectorBuilder nodeUuid(String nodeUuid);

    ConnectorBuilder type(String type);

    ConnectorBuilder connectorId(String connectorId);

    ConnectorBuilder extra(Map<String,String> extra);

}
