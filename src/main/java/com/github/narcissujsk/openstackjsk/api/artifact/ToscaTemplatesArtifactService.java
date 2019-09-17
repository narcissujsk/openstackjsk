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
