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
import com.github.narcissujsk.openstackjsk.model.artifact.Artifact;
import com.github.narcissujsk.openstackjsk.model.artifact.Template;
import com.github.narcissujsk.openstackjsk.model.artifact.builder.ToscaTemplatesArtifactBuilder;
import com.github.narcissujsk.openstackjsk.model.common.BasicResource;

/**
 * A Glare Tosca Templates Artifact
 *
 * @author Pavan Vadavi
 */
public interface ToscaTemplatesArtifact extends Artifact, Buildable<ToscaTemplatesArtifactBuilder> {

    Template getTemplate();

    String getTemplateFormat();

}
