package com.github.narcissujsk.openstackjsk.api.networking.ext;

import java.util.List;
import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.network.Agent;

/**
 * Networking (Neutron) Agent Extension API
 *
 * @author Yin Zhang
 */
public interface AgentService extends RestService {

    /**
     * List neutron agents.
     *
     * @return a list of available neutron agents
     */
    List<? extends Agent> list();

    /**
     * Returns the agent with agentId.
     *
     * @param agentId id of agent
     * @return agent
     */
    Agent getAgent(String agentId);

    /**
     * Sets the admin_state_up.
     *
     * @param agentId the id of the agent to set state for
     * @param state the state to set
     * @return a new reference to the updated agent
     */
    Agent setAdminStateUp(String agentId, boolean state);
    
    /**
     * Schedules the network to that the specified DHCP agent.
     * @param agentId the id of agent with type DHCP
     * @param networkId the id of network 
     * @return the action response
     */
    ActionResponse attachNetworkToDhcpAgent(String agentId, String networkId);
    
    /**
     * Removes the network from that the specified DHCP agent.
     * @param agentId the id of agent with type DHCP
     * @param networkId the id of network 
     * @return the action response
     */
    ActionResponse detachNetworkToDhcpAgent(String agentId, String networkId);

}
