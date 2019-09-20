package com.github.narcissujsk.openstackjsk.model.baremetal;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.baremetal.builder.IronicPortBuilder;
import com.github.narcissujsk.openstackjsk.model.baremetal.builder.IronicPortgroupBuilder;
import com.github.narcissujsk.openstackjsk.model.common.Link;
import net.sf.json.JSONObject;

import java.util.List;

public interface Portgroup extends ModelEntity, Buildable<IronicPortgroupBuilder> {

    String getUuid();

    String getAddress();

    String getNodeUuid();


}
