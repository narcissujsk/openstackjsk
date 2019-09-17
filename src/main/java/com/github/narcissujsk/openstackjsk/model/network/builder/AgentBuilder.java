package com.github.narcissujsk.openstackjsk.model.network.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.network.Agent;

/**
 * <p>
 * <b>Copyright:</b> Copyright (c) 2016
 * </p>
 * <p>
 * <b>Company:</b> Ericsson
 * </p>
 *
 * @author emagnbr 2016- initial version
 *
 */
public interface AgentBuilder extends Builder<AgentBuilder, Agent> {

    /**
     * Sets the admin_state_up
     * @param state the state of admin_state_up
     * @return the agent builder
     */
    AgentBuilder adminStateUp(boolean state);

}
