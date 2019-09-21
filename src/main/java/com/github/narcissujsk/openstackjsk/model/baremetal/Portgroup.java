package com.github.narcissujsk.openstackjsk.model.baremetal;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.baremetal.builder.IronicPortBuilder;
import com.github.narcissujsk.openstackjsk.model.baremetal.builder.IronicPortgroupBuilder;
import com.github.narcissujsk.openstackjsk.model.common.Link;
import com.github.narcissujsk.openstackjsk.openstack.common.GenericLink;
import net.sf.json.JSONObject;

import java.util.List;
import java.util.Map;

public interface Portgroup extends ModelEntity, Buildable<IronicPortgroupBuilder> {

    String getUuid();

    String getName();

    String getAddress();

    String getNodeUuid();

    Boolean getStandalonePortsSupported();

    JSONObject getInternalInfo();

    Map<String, String> getExtra();

    String getMode();

    JSONObject getProperties();

    String getCreatedAt();

    String getUpdatedAt();


    List<GenericLink> getLinks();

    List<GenericLink> getPorts();


}
