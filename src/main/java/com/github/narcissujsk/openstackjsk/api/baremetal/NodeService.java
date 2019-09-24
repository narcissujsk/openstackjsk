package com.github.narcissujsk.openstackjsk.api.baremetal;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.baremetal.*;
import com.github.narcissujsk.openstackjsk.model.baremetal.builder.NodeCreateBuilder;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.openstack.common.OpenstackUpdate;

import java.util.List;
import java.util.Map;

public interface NodeService extends RestService {

	List<? extends Node> list();

    List<? extends Node> list(boolean detail);

    List<? extends Node> list(Map<String, String> filteringParams);

	Node get(String nodeid);

    Node create(NodeCreate nodeid);

    ActionResponse delete(String nodeid);

    NodeCreateBuilder nodeBuilder();

    Node update(String nodeid, List<OpenstackUpdate> update);

    ActionResponse power(String nodeid, NodePowerState nodePowerState);

    ActionResponse provision(String nodeid, NodeProvisionState nodeProvisionState);

}
