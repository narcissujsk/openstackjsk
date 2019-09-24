
package com.github.narcissujsk.openstackjsk.openstack.baremetal.internal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.narcissujsk.openstackjsk.api.baremetal.NodeService;
import com.github.narcissujsk.openstackjsk.core.transport.HttpResponse;
import com.github.narcissujsk.openstackjsk.model.baremetal.*;
import com.github.narcissujsk.openstackjsk.model.baremetal.builder.NodeCreateBuilder;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.openstack.baremetal.domain.IronicNode;
import com.github.narcissujsk.openstackjsk.openstack.baremetal.domain.IronicNodeCreate;
import com.github.narcissujsk.openstackjsk.openstack.baremetal.domain.Target;
import com.github.narcissujsk.openstackjsk.openstack.common.ListEntity;
import com.github.narcissujsk.openstackjsk.openstack.common.ListResult;
import com.github.narcissujsk.openstackjsk.openstack.common.OpenstackUpdate;
import com.github.narcissujsk.openstackjsk.openstack.compute.functions.ToActionResponseFunction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.github.narcissujsk.openstackjsk.openstack.compute.domain.actions.CreateSnapshotAction.create;


public class NodeServiceImpl extends BaseBaremetalServices implements NodeService {

    private static final Logger LOG = LoggerFactory.getLogger(NodeServiceImpl.class);

    public static class Nodes extends ListResult<IronicNode> {

        private static final long serialVersionUID = 1L;

        @JsonProperty("nodes")
        private List<IronicNode> nodes;

        @Override
        public List<IronicNode> value() {
            return nodes;
        }
    }

    @Override
    public List<? extends Node> list() {
       return listAll(false);
    }

    @Override
    public List<? extends Node> list(boolean detail) {
        return listAll(detail);
    }

    @Override
    public List<? extends Node> list(Map<String, String> filteringParams) {
        Invocation<Nodes> invocation = get(Nodes.class, "v1/nodes/detail");
        if (filteringParams != null) {
            for (Map.Entry<String, String> entry : filteringParams.entrySet()) {
                invocation = invocation.param(entry.getKey(), entry.getValue());
            }
        }
        return invocation.execute().getList();
    }

    @Override
    public Node get(String nodeid) {
        checkNotNull(nodeid);
        return get(IronicNode.class, uri("/nodes/%s", nodeid)).execute();
    }


    @Override
    public Node create(NodeCreate node) {
        checkNotNull(node);
        return post(IronicNode.class, uri("/v1/nodes"))
                .entity(node)
                .execute();
    }
    @Override
    public Node update(String nodeid, List<OpenstackUpdate> update) {
        checkNotNull(update);
        return  patch(IronicNode.class, uri("/v1/nodes/%s", nodeid)).entity(new ListEntity<OpenstackUpdate>(update)).execute();

    }
    @Override
    public ActionResponse delete(String nodeid) {
        checkNotNull(nodeid);
        return ToActionResponseFunction.INSTANCE.apply(
                delete(Void.class, uri("/v1/nodes/%s", nodeid)).executeWithResponse()
        );
    }

    @Override
    public NodeCreateBuilder nodeBuilder() {
        return  IronicNodeCreate.builder();
    }

    @Override
    public ActionResponse power(String nodeid, NodePowerState nodePowerState) {
        return ToActionResponseFunction.INSTANCE.apply(invokePowerActionWithResponse(nodeid, nodePowerState), nodePowerState.getTarget());
    }



    protected HttpResponse invokePowerActionWithResponse(String nodeid, NodePowerState powerState)  {
        Target action = new Target();
        action.setTarget(powerState.getTarget());
        HttpResponse response  = put(Void.class, uri("v1/nodes/%s/states/power", nodeid))
                .entity(action)
                .executeWithResponse();
        return response;
    }
    @Override
    public ActionResponse provision(String nodeid, NodeProvisionState nodeProvisionState) {
        return ToActionResponseFunction.INSTANCE.apply(invokeProvisionActionWithResponse(nodeid, nodeProvisionState), nodeProvisionState.name());

    }

    protected HttpResponse invokeProvisionActionWithResponse(String nodeid, NodeProvisionState nodeProvisionState)  {
        Target action = new Target();
        action.setTarget(nodeProvisionState.getTarget());
        HttpResponse response  = put(Void.class, uri("v1/nodes/%s/states/provision", nodeid))
                .entity(action)
                .executeWithResponse();
        return response;
    }
    public List<? extends Node> listAll(boolean detail) {
        Invocation<Nodes> req = get(Nodes.class, uri("/v1/nodes"+  ((detail) ? "/detail" : "")));
        return req.execute().getList();
    }



}
