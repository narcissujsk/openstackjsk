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
import com.github.narcissujsk.openstackjsk.model.magnum.Cluster;
import com.github.narcissujsk.openstackjsk.openstack.common.GenericLink;

public interface ClusterBuilder extends Builder<ClusterBuilder, com.github.narcissujsk.openstackjsk.model.magnum.Cluster> {
    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Cluster#getStatus
     */
    ClusterBuilder status(String status);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Cluster#getClusterTemplateId
     */
    ClusterBuilder clusterTemplateId(String clusterTemplateId);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Cluster#getUuid
     */
    ClusterBuilder uuid(String uuid);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Cluster#getLinks
     */
    ClusterBuilder links(List<GenericLink> links);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Cluster#getStackId
     */
    ClusterBuilder stackId(String stackId);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Cluster#getMasterCount
     */
    ClusterBuilder masterCount(Integer masterCount);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Cluster#getCreateTimeout
     */
    ClusterBuilder createTimeout(Integer createTimeout);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Cluster#getNodeCount
     */
    ClusterBuilder nodeCount(Integer nodeCount);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Cluster#getDiscoveryUrl
     */
    ClusterBuilder discoveryUrl(String discoveryUrl);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Cluster#getKeypair
     */
    ClusterBuilder keypair(String keypair);

    /**
     * @see Cluster#getName
     */
    ClusterBuilder name(String name);

}
