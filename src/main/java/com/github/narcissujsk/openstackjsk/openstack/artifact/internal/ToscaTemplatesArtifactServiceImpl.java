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
package com.github.narcissujsk.openstackjsk.openstack.artifact.internal;

import com.google.common.base.Preconditions;
import com.github.narcissujsk.openstackjsk.api.artifact.ToscaTemplatesArtifactService;
import com.github.narcissujsk.openstackjsk.core.transport.HttpResponse;
import com.github.narcissujsk.openstackjsk.model.artifact.ArtifactType;
import com.github.narcissujsk.openstackjsk.model.artifact.ArtifactUpdate;
import com.github.narcissujsk.openstackjsk.model.artifact.ToscaTemplatesArtifact;
import com.github.narcissujsk.openstackjsk.model.artifact.ToscaTemplatesArtifacts;
import com.github.narcissujsk.openstackjsk.model.artifact.builder.ArtifactUpdateBuilder;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.common.Payload;
import com.github.narcissujsk.openstackjsk.model.common.payloads.FilePayload;
import com.github.narcissujsk.openstackjsk.openstack.artifact.domain.ArtifactUpdateModel;
import com.github.narcissujsk.openstackjsk.openstack.artifact.domain.ToscaTemplates;
import com.github.narcissujsk.openstackjsk.openstack.artifact.domain.ToscaTemplatesList;
import com.github.narcissujsk.openstackjsk.openstack.common.ListEntity;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static com.github.narcissujsk.openstackjsk.core.transport.ClientConstants.CONTENT_TYPE_OCTECT_STREAM;
import static com.github.narcissujsk.openstackjsk.core.transport.ClientConstants.HEADER_ACCEPT;

/**
 * Created by vadavi on 19-01-2017.
 */
public class ToscaTemplatesArtifactServiceImpl extends BaseArtifactServiceImpl implements ToscaTemplatesArtifactService {

    public ToscaTemplatesArtifactServiceImpl() {
        super(ArtifactType.TOSCA_TEMPLATES);
    }

    @Override
    public ToscaTemplatesArtifacts list() {

        return super.list(ToscaTemplatesList.class);

    }

    @Override
    public ToscaTemplatesArtifact get(String artifactId) {
        Preconditions.checkNotNull(artifactId);
        return super.get(artifactId, ToscaTemplates.class);
    }

    @Override
    public ToscaTemplatesArtifact create(ToscaTemplatesArtifact toscaTemplatesArtifact) {
        Preconditions.checkNotNull(toscaTemplatesArtifact);
        return super.create(toscaTemplatesArtifact, ToscaTemplates.class);
    }

    @Override
    public ToscaTemplatesArtifact upload(String artifactId, File file) {
        Preconditions.checkNotNull(artifactId);
        return super.upload(artifactId, file, ToscaTemplates.class, "template");
    }

    @Override
    public InputStream download(String artifactId) {
        Preconditions.checkNotNull(artifactId);
        return super.download(artifactId, "template");
    }

    @Override
    public ActionResponse delete(String artifactId) {
        Preconditions.checkNotNull(artifactId);
        return super.delete(artifactId);
    }

    @Override
    public ToscaTemplatesArtifact update(String artifactId, List<ArtifactUpdate> artifactUpdates) {
        Preconditions.checkNotNull(artifactId);
        Preconditions.checkNotNull(artifactUpdates);
        return super.update(artifactId, artifactUpdates, ToscaTemplates.class);
    }

    @Override
    public ToscaTemplatesArtifact activate(String artifactId) {
        Preconditions.checkNotNull(artifactId);
        return update(artifactId, "replace", "/status", "active", ToscaTemplates.class);
    }

    @Override
    public ToscaTemplatesArtifact deactivate(String artifactId) {
        Preconditions.checkNotNull(artifactId);
        return update(artifactId, "replace", "/status", "deactivated", ToscaTemplates.class);
    }

    @Override
    public ToscaTemplatesArtifact reactivate(String artifactId) {
        Preconditions.checkNotNull(artifactId);
        return update(artifactId, "replace", "/status", "active", ToscaTemplates.class);
    }

    @Override
    public ToscaTemplatesArtifact publish(String artifactId) {
        Preconditions.checkNotNull(artifactId);
        return update(artifactId, "replace", "/visibility", "public", ToscaTemplates.class);
    }

}
