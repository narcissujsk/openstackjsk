package com.github.narcissujsk.openstackjsk.model.baremetal;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.baremetal.builder.ConnectorBuilder;
import com.github.narcissujsk.openstackjsk.openstack.common.GenericLink;
import net.sf.json.JSONObject;

import java.util.List;
import java.util.Map;

public interface Connector extends ModelEntity, Buildable<ConnectorBuilder> {

    String getUuid();

    String getType();

    String getConnectorId();

    String getNodeUuid();

    List<GenericLink> getLinks();

    Map<String,String> getExtra();


}
