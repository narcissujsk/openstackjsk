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
package com.github.narcissujsk.openstackjsk.model.network.ext.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.network.ext.HealthMonitor;
import com.github.narcissujsk.openstackjsk.model.network.ext.HealthMonitorType;

/**
 * A builder to create a healthMonitor
 * 
 * @author liujunpeng
 *
 */
public interface HealthMonitorBuilder extends Builder<HealthMonitorBuilder, HealthMonitor> {

	/**
	 * 
	 * @param tenantId
	 *            Owner of the VIP. Only an administrative user can specify a
	 *            tenant ID other than its own.
	 * @return HealthMonitorBuilder
	 */
	public HealthMonitorBuilder tenantId(String tenantId);

	/**
	 * 
	 * @param type
	 *            The type of probe, which is PING, TCP, HTTP, or HTTPS, that is
	 *            sent by the load balancer to verify the member state.
	 * @return HealthMonitorBuilder
	 */
	public HealthMonitorBuilder type(HealthMonitorType type);

	/**
	 * 
	 * @param delay
	 *            The time, in seconds, between sending probes to members.
	 * @return HealthMonitorBuilder
	 */
	public HealthMonitorBuilder delay(Integer delay);

	/**
	 * 
	 * @param timeout
	 *            Time in seconds to timeout each probe.
	 * @return HealthMonitorBuilder
	 */
	public HealthMonitorBuilder timeout(Integer timeout);

	/**
	 * 
	 * @param maxRetries
	 *            Maximum consecutive health probe tries.
	 * @return HealthMonitorBuilder
	 */
	public HealthMonitorBuilder maxRetries(Integer maxRetries);

	/**
	 * 
	 * @param urlPath
	 *            Path portion of URI that will be probed if type is HTTP(S).
	 * @return HealthMonitorBuilder
	 */
	public HealthMonitorBuilder urlPath(String urlPath);

	/**
	 *
	 * @param expectedCodes
	 *            Expected HTTP codes for a passing HTTP(S) monitor.
	 * @return HealthMonitorBuilder
	 */
	public HealthMonitorBuilder expectedCodes(String expectedCodes);

	/**
	 * 
	 * @param httpMethod
	 *            GET/PUT/POST
	 * @return HealthMonitorBuilder
	 */
	public HealthMonitorBuilder httpMethod(String httpMethod);

	/**
	 * 
	 * @param adminStateUp
	 *            The administrative state of the VIP. A valid value is true
	 *            (UP) or false (DOWN).
	 * @return HealthMonitorBuilder
	 */
	public HealthMonitorBuilder adminStateUp(boolean adminStateUp);
}
