package com.github.narcissujsk.openstackjsk.api.baremetal.ext;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.artifact.ArtifactUpdate;
import com.github.narcissujsk.openstackjsk.model.baremetal.Node;
import com.github.narcissujsk.openstackjsk.model.baremetal.NodeCreate;
import com.github.narcissujsk.openstackjsk.model.baremetal.NodePowerState;
import com.github.narcissujsk.openstackjsk.model.baremetal.NodeProvisionState;
import com.github.narcissujsk.openstackjsk.model.baremetal.builder.NodeCreateBuilder;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;

import java.util.List;
import java.util.Map;

public interface NodePortService extends RestService {

	List<? extends Node> list();

    List<? extends Node> list(boolean detail);

    List<? extends Node> list(Map<String, String> filteringParams);

	Node get(String nodeid);



}
