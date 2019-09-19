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
package com.github.narcissujsk.openstackjsk.model.octavia;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.octavia.LbMethod;
import com.github.narcissujsk.openstackjsk.model.octavia.Protocol;
import com.github.narcissujsk.openstackjsk.model.octavia.SessionPersistence;
import com.github.narcissujsk.openstackjsk.model.octavia.builder.LbPoolV2Builder;
import com.github.narcissujsk.openstackjsk.openstack.octavia.domain.ListItem;

import java.util.List;

/**
 * A v2 loadbanlance pool
 * @author wei
 */
public interface LbPoolV2 extends ModelEntity, Buildable<LbPoolV2Builder> {
    /**
     * @return id. The unique ID for the pool.
     */
    String getId();

    /**
     * @return the ID of the project/tenant that owns the resource
     */
    String getProjectId();

    /**
     * @return Pool name. Does not have to be unique.
     */
    String getName();

    /**
     * @return Description for the pool.
     */
    String getDescription();

    /**
     * @return The protocol of the pool, which is TCP, HTTP, or HTTPS.
     */
    Protocol getProtocol();

    /**
     * @return The load-balancer algorithm, which is round-robin, least-connections, and so on. This value, which must be supported, is dependent on the load-balancer provider. Round-robin must be supported.
     */
    LbMethod getLbMethod();

    /**
     *
     * @return SessionPersistence
     */
    SessionPersistence getSessionPersistence();

    /**
     * @return The administrative state of the lb pool, which is up (true) or
     *         down (false).
     */
    boolean isAdminStateUp();

    /**
     * Listeners associated with the pool
     * @return listeners associated with the pool
     */
    List<ListItem> getListeners();


    /**
     * @return List of members that belong to the pool.
     */
    List<ListItem> getMembers();

    /**
     * @return Health monitor associated with the pool.
     */
    String getHealthMonitorId();
}
