package com.github.narcissujsk.openstackjsk.model.baremetal;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.baremetal.builder.IronicPortgroupBuilder;
import com.github.narcissujsk.openstackjsk.model.baremetal.builder.TargetBuilder;
import com.github.narcissujsk.openstackjsk.openstack.common.GenericLink;
import net.sf.json.JSONObject;

import java.util.List;
import java.util.Map;

public interface Target extends ModelEntity, Buildable<TargetBuilder> {

    String getUuid();

    String getVolumeType();


    Map<String,String> getProperties();

    Integer getBootIndex();

    String getVolumeId();

    Map<String,String> getExtra();


    String getNodeUuid();

    List<GenericLink> getLinks();




}
