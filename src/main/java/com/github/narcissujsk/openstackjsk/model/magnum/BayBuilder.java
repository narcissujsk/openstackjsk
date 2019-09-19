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
package com.github.narcissujsk.openstackjsk.model.magnum;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.magnum.Bay;
import com.github.narcissujsk.openstackjsk.openstack.common.GenericLink;

public interface BayBuilder extends Builder<BayBuilder, com.github.narcissujsk.openstackjsk.model.magnum.Bay> {
	/**
	 * @see com.github.narcissujsk.openstackjsk.model.magnum.Bay#getStatus
	 */
	BayBuilder status(String status);

	/**
	 * @see com.github.narcissujsk.openstackjsk.model.magnum.Bay#getUuid
	 */
	BayBuilder uuid(String uuid);

	/**
	 * @see com.github.narcissujsk.openstackjsk.model.magnum.Bay#getLinks
	 */
	BayBuilder links(List<GenericLink> links);

	/**
	 * @see com.github.narcissujsk.openstackjsk.model.magnum.Bay#getStackId
	 */
	BayBuilder stackId(String stackId);

	/**
	 * @see com.github.narcissujsk.openstackjsk.model.magnum.Bay#getCreatedAt
	 */
	BayBuilder createdAt(String createdAt);

	/**
	 * @see com.github.narcissujsk.openstackjsk.model.magnum.Bay#getApiAddress
	 */
	BayBuilder apiAddress(String apiAddress);

	/**
	 * @see com.github.narcissujsk.openstackjsk.model.magnum.Bay#getDiscoveryUrl
	 */
	BayBuilder discoveryUrl(String discoveryUrl);

	/**
	 * @see com.github.narcissujsk.openstackjsk.model.magnum.Bay#getUpdatedAt
	 */
	BayBuilder updatedAt(String updatedAt);

	/**
	 * @see com.github.narcissujsk.openstackjsk.model.magnum.Bay#getMasterCount
	 */
	BayBuilder masterCount(Integer masterCount);

	/**
	 * @see com.github.narcissujsk.openstackjsk.model.magnum.Bay#getCoeVersion
	 */
	BayBuilder coeVersion(String coeVersion);

	/**
	 * @see com.github.narcissujsk.openstackjsk.model.magnum.Bay#getBaymodelId
	 */
	BayBuilder baymodelId(String baymodelId);

	/**
	 * @see com.github.narcissujsk.openstackjsk.model.magnum.Bay#getMasterAddresses
	 */
	BayBuilder masterAddresses(List<String> masterAddresses);

	/**
	 * @see com.github.narcissujsk.openstackjsk.model.magnum.Bay#getNodeCount
	 */
	BayBuilder nodeCount(Integer nodeCount);

	/**
	 * @see com.github.narcissujsk.openstackjsk.model.magnum.Bay#getNodeAddresses
	 */
	BayBuilder nodeAddresses(List<String> nodeAddresses);

	/**
	 * @see com.github.narcissujsk.openstackjsk.model.magnum.Bay#getStatusReason
	 */
	BayBuilder statusReason(String statusReason);

	/**
	 * @see com.github.narcissujsk.openstackjsk.model.magnum.Bay#getBayCreateTimeout
	 */
	BayBuilder bayCreateTimeout(String bayCreateTimeout);

	/**
	 * @see Bay#getName
	 */
	BayBuilder name(String name);

}
