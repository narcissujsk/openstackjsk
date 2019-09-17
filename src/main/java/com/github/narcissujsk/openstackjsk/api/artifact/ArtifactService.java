package com.github.narcissujsk.openstackjsk.api.artifact;

import com.github.narcissujsk.openstackjsk.api.OSClient;
import com.github.narcissujsk.openstackjsk.api.artifact.ToscaTemplatesArtifactService;
import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.artifact.Artifacts;

/**
 * OpenStack (Glare) Artifact Type
 *
 * @author Pavan Vadavi
 */
public interface ArtifactService extends RestService {

    /**
     * Tosca Template Service
     *
     * @return Tosca Template Service
     */
    ToscaTemplatesArtifactService toscaTemplatesArtifact();
}
