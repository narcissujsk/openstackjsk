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
import com.github.narcissujsk.openstackjsk.model.octavia.builder.MemberV2Builder;

/**
 * A member of a Lbaas V2 pool
 * @author wei
 */
public interface MemberV2  extends ModelEntity, Buildable<MemberV2Builder> {
    /**
     * @return the member identifier
     */
    String getId();

    /**
     * @return the ID of the project/tenant that owns the resource
     */
    String getProjectId();

    /**
     * @return address the IP address of a member
     */
    String getAddress();

    /**
     * @return The port on which the application is hosted.such as 80
     */
    Integer getProtocolPort();

    /**
     * @return Weight of member.1~256
     */
    Integer getWeight();

    /**
     * @return The subnet in which to access the member
     */
    String getSubnetId();

    /**
     * @return The administrative state of the member, which is up (true) or
     *         down (false).
     */
    boolean isAdminStateUp();

}
