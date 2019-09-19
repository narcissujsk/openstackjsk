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
package com.github.narcissujsk.openstackjsk.model.identity.v3;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.identity.v3.Domain;
import com.github.narcissujsk.openstackjsk.model.identity.v3.builder.ProjectBuilder;

/**
 * Project Model class use to group/isolate resources and/or identity objects
 * 
 * @see <a href="http://developer.openstack.org/api-ref-identity-v3.html#projects-v3">API reference</a>
 */
public interface Project extends ModelEntity, Buildable<ProjectBuilder> {

    /**
     * Globally unique within the owning domain.
     *
     * @return the Id of the project
     */
    String getId();

    /**
     * @return the DomainId of the project
     */
    String getDomainId();

    /**
     * 
     * @return the domain
     */
    Domain getDomain();

    /**
     * @return the Description of the project
     */
    String getDescription();

    /**
     * 
     * @return the Name of the project
     */
    String getName();

    /**
     * 
     * @return the links of the project
     */
    Map<String, String> getLinks();

    /**
     * 
     * @return the parentId of the project
     */
    String getParentId();

    /**
     * 
     * @return the subtree of the project
     */
    String getSubtree();

    /**
     * 
     * @return the parents of the project
     */
    String getParents();

    /**
     * 
     * @return if the project is enabled
     */
    boolean isEnabled();

    /**
     *
     * @return value for the given key
     */
    String getExtra(String key);
    
    /**
     * 
     * @return list of tags
     */
    List<String> getTags();
}
