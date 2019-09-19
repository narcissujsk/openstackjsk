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
import com.github.narcissujsk.openstackjsk.model.magnum.Container;
import com.github.narcissujsk.openstackjsk.openstack.common.GenericLink;
import com.github.narcissujsk.openstackjsk.openstack.magnum.MagnumEnvironment;


public interface ContainerBuilder extends Builder<ContainerBuilder, com.github.narcissujsk.openstackjsk.model.magnum.Container> {
    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Container#getStatus
     */
    ContainerBuilder status(String status);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Container#getUuid
     */
    ContainerBuilder uuid(String uuid);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Container#getLinks
     */
    ContainerBuilder links(List<GenericLink> links);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Container#getImage
     */
    ContainerBuilder image(String image);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Container#getEnvironment
     */
    ContainerBuilder environment(MagnumEnvironment environment);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Container#getCommand
     */
    ContainerBuilder command(String command);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Container#getMemory
     */
    ContainerBuilder memory(String memory);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Container#getBayUuid
     */
    ContainerBuilder bayUuid(String bayUuid);

    /**
     * @see Container#getName
     */
    ContainerBuilder name(String name);

}
