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
package com.github.narcissujsk.openstackjsk.model.network.ext;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.network.ext.HealthMonitorType;
import com.github.narcissujsk.openstackjsk.model.network.ext.builder.HealthMonitorV2Builder;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.ext.ListItem;

import java.util.List;

/**
 * A healthMonitor of a Lbaas V2 pool
 * @author emjburns
 */
public interface HealthMonitorV2 extends ModelEntity, Buildable<HealthMonitorV2Builder>{
    /**
     * @return id the healthMonitor identifier
     */
    String getId();

    /**
     * @return tenantId Owner of the VIP. Only an administrative user can
     *         specify a tenant ID other than its own.
     */
    String getTenantId();

    /**
     *
     * @return type The type of probe sent by the load balancer to verify the
     *         member state, which is TCP, HTTP, or HTTPS.
     */
    HealthMonitorType getType();

    /**
     * @return delay The time, in seconds, between sending probes to members.
     */
    Integer getDelay();

    /**
     * @return timeout The maximum number of seconds for a monitor to wait for a
     *         connection to be established before it times out. This value must
     *         be less than the delay value.
     */
    Integer getTimeout();

    /**
     * @return maxRetries Number of allowed connection failures before changing
     *         the status of the member to INACTIVE. A valid value is from 1 to
     *         10.
     */
    Integer getMaxRetries();

    /**
     * Optional.
     *
     * @return httpMethod The HTTP method that the monitor uses for requests.
     */
    String getHttpMethod();

    /**
     * Optional.
     *
     * @return urlPath The HTTP path of the request sent by the monitor to test
     *         the health of a member. Must be a string beginning with a forward
     *         slash (/).
     */
    String getUrlPath();

    /**
     * Optional.
     *
     * @return expectedCodes Expected HTTP codes for a passing HTTP(S) monitor.
     */
    String getExpectedCodes();

    /**
     * Optional.
     *
     * @return adminstateup The administrative state of the health monitor,
     *         which is up (true) or down (false). Default true.
     */
    boolean isAdminStateUp();

    /**
     * The pools that this health monitor will monitor.
     * @return pools
     */
    List<ListItem> getPools();

}
