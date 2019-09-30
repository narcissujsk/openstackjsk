package com.github.narcissujsk.openstackjsk.model.baremetal.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.baremetal.Portgroup;
import com.github.narcissujsk.openstackjsk.model.baremetal.Target;
import net.sf.json.JSONObject;

import java.util.Map;


public interface TargetBuilder extends Buildable.Builder<TargetBuilder, Target> {

    TargetBuilder bootIndex(Integer bootIndex);

    TargetBuilder nodeUuid(String nodeUuid);

    TargetBuilder properties(Map<String,String> properties);

    TargetBuilder volumeId(String volumeId);

    TargetBuilder volumeType(String volumeType);

    TargetBuilder extra(Map<String,String>  extra);

}
