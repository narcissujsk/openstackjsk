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

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.magnum.ContainerBuilder;
import com.github.narcissujsk.openstackjsk.openstack.common.GenericLink;
import com.github.narcissujsk.openstackjsk.openstack.magnum.MagnumEnvironment;

public interface Container extends ModelEntity, Buildable<ContainerBuilder> {
    /**
     * Gets status
     * 
     * @return status
     */
    String getStatus();

    /**
     * Gets uuid
     * 
     * @return uuid
     */
    String getUuid();

    /**
     * Gets links
     * 
     * @return links
     */
    List<GenericLink> getLinks();

    /**
     * Gets image
     * 
     * @return image
     */
    String getImage();

    /**
     * Gets environment
     * 
     * @return environment
     */
    MagnumEnvironment getEnvironment();

    /**
     * Gets command
     * 
     * @return command
     */
    String getCommand();

    /**
     * Gets memory
     * 
     * @return memory
     */
    String getMemory();

    /**
     * Gets bayUuid
     * 
     * @return bayUuid
     */
    String getBayUuid();

    /**
     * Gets name
     * 
     * @return name
     */
    String getName();

}