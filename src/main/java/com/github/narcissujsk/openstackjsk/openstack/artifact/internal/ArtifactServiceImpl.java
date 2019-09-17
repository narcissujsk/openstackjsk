package com.github.narcissujsk.openstackjsk.openstack.artifact.internal;

import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.artifact.ArtifactService;
import com.github.narcissujsk.openstackjsk.api.artifact.ToscaTemplatesArtifactService;
import com.github.narcissujsk.openstackjsk.model.artifact.ArtifactType;
import com.github.narcissujsk.openstackjsk.model.artifact.Artifacts;
import com.github.narcissujsk.openstackjsk.model.artifact.ToscaTemplatesArtifacts;

/**
 * Created by vadavi on 18-01-2017.
 */
public class ArtifactServiceImpl implements ArtifactService {


    @Override
    public ToscaTemplatesArtifactService toscaTemplatesArtifact() {
        return Apis.get(ToscaTemplatesArtifactService.class);
    }
}
