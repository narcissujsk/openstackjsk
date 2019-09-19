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
import com.github.narcissujsk.openstackjsk.model.network.ext.builder.MemberBuilder;
/**
 * A member of a Lbaas pool
 * @author liujunpeng
 */
public interface Member extends ModelEntity, Buildable<MemberBuilder> {

	/**
	 * 
	 * @return status The status of the member. Indicates whether the member is
	 *         operational.
	 */
	public String getStatus();

	/**
	 * @return address the IP address of a member
	 */
	public String getAddress();

	/**
	 * 
	 * @return The administrative state of the member, which is up (true) or
	 *         down (false).
	 */
	public boolean isAdminStateUp();

	/**
	 *
	 * @return the id of a tenant. Owner of the member.
	 */
	public String getTenantId();

	/**
	 * 
	 * @return the member identifier
	 */
	public String getId();

	/**
	 *
	 * @return The port on which the application is hosted.such as 80
	 */
	public Integer getProtocolPort();

	/**
	 * 
	 * @return Weight of member.1~256
	 */
	public Integer getWeight();

	/**
	 * @return The Loadbalance pool identifier
	 */
	public String getPoolId();
	
}
