package com.github.narcissujsk.openstackjsk.openstack.networking.internal.ext;

import static com.google.common.base.Preconditions.checkNotNull;
import java.util.List;
import com.github.narcissujsk.openstackjsk.api.networking.ext.AgentService;
import com.github.narcissujsk.openstackjsk.core.transport.ExecutionOptions;
import com.github.narcissujsk.openstackjsk.core.transport.propagation.PropagateOnStatus;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.network.Agent;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.NeutronAgent;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.NeutronAgent.Agents;
import com.github.narcissujsk.openstackjsk.openstack.networking.internal.BaseNetworkingServices;

/**
 * Networking (Neutron) Agent Extension API
 *
 * @author Yin Zhang
 */
public class AgentServiceImpl extends BaseNetworkingServices implements AgentService {

    @Override
    public List<? extends Agent> list() {
        return get(Agents.class, uri("/agents")).execute().getList();
    }

    @Override
    public Agent getAgent(String agentId) {
        checkNotNull(agentId);
        return get(NeutronAgent.class, uri("/agents/%s", agentId)).execute();
    }

    @Override
    public Agent setAdminStateUp(String agentId, boolean state) {
        checkNotNull(agentId);
        String json = String.format("{\"%s\": { \"%s\": \"%b\"}}", "agent", "admin_state_up", state);
        return put(NeutronAgent.class, uri("/agents/%s", agentId)).json(json).execute(
                ExecutionOptions.<NeutronAgent> create(PropagateOnStatus.on(404)));
    }

    @Override
    public ActionResponse attachNetworkToDhcpAgent(String agentId, String networkId) {
        checkNotNull(agentId);
        String json = String.format("{\"%s\": \"%s\"}", "network_id", networkId);
        return postWithResponse(uri("/agents/%s/dhcp-networks", agentId)).json(json).execute(ExecutionOptions.<ActionResponse> create(PropagateOnStatus.on(404)));
    }
    
    @Override
    public ActionResponse detachNetworkToDhcpAgent(String agentId, String networkId) {
        checkNotNull(agentId);
        return deleteWithResponse(uri("/agents/%s/dhcp-networks/%s", agentId, networkId)).execute(ExecutionOptions.<ActionResponse> create(PropagateOnStatus.on(404)));
    }
}
