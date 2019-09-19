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
import com.github.narcissujsk.openstackjsk.model.network.ext.Protocol;
import com.github.narcissujsk.openstackjsk.model.network.ext.SessionPersistence;
import com.github.narcissujsk.openstackjsk.model.network.ext.builder.VipBuilder;

/**
 * a vip of a pool
 * 
 * @author liujunpeng
 */
public interface Vip extends ModelEntity, Buildable<VipBuilder> {
	/**
	 * 
	 * @return The IP address of the VIP.
	 */
	public String getAddress();

	/**
	 * @return The administrative state of the VIP. A valid value is true (UP)
	 *         or false (DOWN).
	 */
	public boolean isAdminStateUp();

	/**
	 * 
	 * @return connectionLimit.The maximum number of connections allowed for the
	 *         VIP. Default is -1, meaning no limit.
	 */
	public Integer getConnectionLimit();

	/**
	 * @return Human-readable description for the VIP
	 */
	public String getDescription();

	/**
	 * 
	 * 
	 * @return The unique ID for the VIP.
	 */
	public String getId();

	/**
	 *
	 * 
	 * @return Human-readable name for the VIP. Does not have to be unique.
	 */
	public String getName();

	/**
	 * 
	 * @return The ID of the pool with which the VIP is associated.
	 */
	public String getPoolId();

	/**
	 * 
	 * @return The protocol of the VIP address. A valid value is TCP, HTTP, or
	 *         HTTPS.
	 */
	public Protocol getProtocol();

	/**
	 * 
	 * @return The port on which to listen to client traffic that is associated
	 *         with the VIP address. A valid value is from 1 to 65535.
	 */
	public Integer getProtocolPort();

	/**
	 * 
	 * @return SessionPersistence.Session persistence parameters for the VIP.
	 *         Omit the session_persistence parameter to prevent session
	 *         persistence. When no session persistence is used, the
	 *         session_persistence parameter does not appear in the API
	 *         response. To clear session persistence for the VIP, set the
	 *         session_persistence parameter to null in a VIP update request.
	 */
	public SessionPersistence getSessionPersistence();

	/**
	 * 
	 * @return status.The status of the VIP. Indicates whether the VIP is
	 *         operational.
	 */
	public String getStatus();

	/**
	 * 
	 * @return The ID of the subnet on which to allocate the VIP address.
	 */
	public String getSubnetId();

	/**
	 * 
	 * @return The Tenant Id.Owner of the VIP.
	 */
	public String getTenantId();
	
	
}
