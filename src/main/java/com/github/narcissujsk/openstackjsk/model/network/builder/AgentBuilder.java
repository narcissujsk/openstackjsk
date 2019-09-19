/*******************************************************************************
 * 	Copyright 2019 ContainX and OpenStack4j
 *
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * 	use this file except in compliance with the License. You may obtain a copy of
 * 	the License at
 *
 * 	    http://www.apache.org/licenses/LICENSE-2.0
 *
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * 	License for the specific language governing permissions and limitations under
 * 	the License.
 *******************************************************************************/
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
