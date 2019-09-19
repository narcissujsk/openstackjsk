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
package com.github.narcissujsk.openstackjsk.model.gbp;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.common.Resource;
import com.github.narcissujsk.openstackjsk.model.gbp.PolicyTargetGroup;
import com.github.narcissujsk.openstackjsk.model.gbp.builder.NetworkServicePolicyBuilder;
import com.github.narcissujsk.openstackjsk.openstack.gbp.domain.GbpNetworkServiceParams;

import java.util.List;

/**
 * Created by sumit gandhi on 7/4/2016.
 */
public interface NetworkServicePolicy extends Resource, Buildable<NetworkServicePolicyBuilder> {

    /**
     * Is the network service policy shared
     * @return boolean
     */
    boolean isShared();

    /**
     * Gets the network service parameters
     * @return network service parameters
     */
    List<GbpNetworkServiceParams>  getGbpNetworkServiceParamsList();

    /**
     * Gets the policy target groups associated with the service policy
     * @return list of policy target groups
     */
    List<PolicyTargetGroup> getPolicyTargetGroupList();

    /**
     * Gets the description of the network service policy
     * @return description
     */
    String getDescription();

}
