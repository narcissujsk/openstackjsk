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
package com.github.narcissujsk.openstackjsk.model.octavia.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.octavia.MemberV2;

public interface MemberV2Builder extends Buildable.Builder<MemberV2Builder, MemberV2> {
    /**
     * @param projectId
     *            the ID of the project/tenant that owns the resource
     * @return MemberV2Builder
     */
    MemberV2Builder projectId(String projectId);

    /**
     *
     * @param address
     *            The IP address of the member.
     * @return MemberV2Builder
     */
    MemberV2Builder address(String address);

    /**
     * @param protocolPort
     *            The port on which the application is hosted. A valid value
     *            is from 1 to 65535
     * @return MemberV2Builder
     */
    MemberV2Builder protocolPort(Integer protocolPort);

    /**
     * @param subnetId
     *            The subnet in which to access the member
     * @return MemberV2Builder
     */
    MemberV2Builder subnetId(String subnetId);

    /**
     * Optional
     *
     * @param weight
     *           Weight of member.from 1 to 256
     *           Default 1
     * @return MemberV2Builder
     */
    MemberV2Builder weight(Integer weight);


    /**
     * Optional
     *
     * @param adminStateUp
     *            The administrative state of the member, which is up (true) or
     *            down (false). Default true.
     * @return MemberV2Builder
     */
    MemberV2Builder adminStateUp(boolean adminStateUp);
}
