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
package com.github.narcissujsk.openstackjsk.api.artifact;


import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.artifact.ArtifactUpdate;
import com.github.narcissujsk.openstackjsk.model.artifact.Artifacts;
import com.github.narcissujsk.openstackjsk.model.artifact.ToscaTemplatesArtifact;
import com.github.narcissujsk.openstackjsk.model.artifact.ToscaTemplatesArtifacts;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;

import java.io.File;
import java.io.InputStream;
import java.util.List;

/**
 * OpenStack (Glare) Artifact based Operations for Tosca Templates type
 *
 * @author Pavan Vadavi
 */
public interface ToscaTemplatesArtifactService extends RestService {

    /**
     * Lists all artifacts
     *
     * @return Tosca templates artifact list
     */
    ToscaTemplatesArtifacts list();

    /**
     * Get specific artifact
     *
     * @return Tosca template artifact
     */
    ToscaTemplatesArtifact get(String artifactId);

    /**
     * Create artifact
     *
     * @return Tosca template artifact
     */
    ToscaTemplatesArtifact create(ToscaTemplatesArtifact toscaTemplatesArtifact);

    /**
     * Upload template to artifact
     *
     * @return Tosca template artifact
     */
    ToscaTemplatesArtifact upload(String artifactId, File file);

    /**
     * Download template from artifact
     *
     * @return Input stream
     */
    InputStream download(String artifactId);

    /**
     * Delete specific artifact
     *
     * @return Action response
     */
    ActionResponse delete(String artifactId);

    /**
     * Update specific artifact
     *
     * @return Tosca template artifact
     */
    ToscaTemplatesArtifact update(String artifactId, List<ArtifactUpdate> artifactUpdates);

    /**
     * Activate specific artifact
     *
     * @return Tosca template artifact
     */
    ToscaTemplatesArtifact activate(String artifactId);

    /**
     * Deactivate specific artifact
     *
     * @return Tosca template artifact
     */
    ToscaTemplatesArtifact deactivate(String artifactId);

    /**
     * Reactivate specific artifact
     *
     * @return Tosca template artifact
     */
    ToscaTemplatesArtifact reactivate(String artifactId);

    /**
     * Publish specific artifact
     *
     * @return Tosca template artifact
     */
    ToscaTemplatesArtifact publish(String artifactId);

}
