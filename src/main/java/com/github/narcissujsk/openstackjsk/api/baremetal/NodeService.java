package com.github.narcissujsk.openstackjsk.api.baremetal;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.artifact.ArtifactUpdate;
import com.github.narcissujsk.openstackjsk.model.baremetal.*;
import com.github.narcissujsk.openstackjsk.model.baremetal.builder.NodeCreateBuilder;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.compute.builder.ServerCreateBuilder;

import java.util.List;
import java.util.Map;


/**
 * @author jiangsk
 */
public interface NodeService extends RestService {

	List<? extends Node> list();

    List<? extends Node> list(boolean detail);

	Node get(String nodeid);

    Node create(NodeCreate nodeid);

    ActionResponse delete(String nodeid);

    NodeCreateBuilder nodeBuilder();

    Node update(String nodeid, List<ArtifactUpdate> update);

    ActionResponse power(String nodeid, NodePowerState nodePowerState);

    ActionResponse provision(String nodeid, NodeProvisionState nodeProvisionState);

}
