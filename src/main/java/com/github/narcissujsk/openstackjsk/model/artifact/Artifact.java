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
package com.github.narcissujsk.openstackjsk.model.artifact;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.artifact.Metadata;
import com.github.narcissujsk.openstackjsk.model.artifact.builder.ArtifactBuilder;
import com.github.narcissujsk.openstackjsk.model.common.BasicResource;

import java.util.List;

/**
 * A Glare Artifact
 *
 * @author Pavan Vadavi
 */
public interface Artifact extends BasicResource {

    String getDescription();

    List<Object> getTags();

    Metadata getMetadata();

    List<Object> getRelease();

    String getOwner();

    Object getSupportedBy();

    Object getLicenseUrl();

    String getVersion();

    Object getProvidedBy();

    String getVisibility();

    String getUpdatedAt();

    String getActivatedAt();

    String getCreatedAt();

    Object getLicense();

    Object getIcon();

    String getStatus();
}
