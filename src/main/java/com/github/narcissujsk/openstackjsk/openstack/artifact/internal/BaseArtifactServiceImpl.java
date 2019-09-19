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

import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.core.transport.HttpResponse;
import com.github.narcissujsk.openstackjsk.model.artifact.*;
import com.github.narcissujsk.openstackjsk.model.artifact.builder.ArtifactUpdateBuilder;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.common.Payload;
import com.github.narcissujsk.openstackjsk.model.common.payloads.FilePayload;
import com.github.narcissujsk.openstackjsk.openstack.artifact.domain.ArtifactUpdateModel;
import com.github.narcissujsk.openstackjsk.openstack.common.ListEntity;
import com.github.narcissujsk.openstackjsk.openstack.common.functions.EnforceVersionToURL;
import com.github.narcissujsk.openstackjsk.openstack.internal.BaseOpenStackService;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static com.github.narcissujsk.openstackjsk.core.transport.ClientConstants.CONTENT_TYPE_ARTIFACT_PATCH;
import static com.github.narcissujsk.openstackjsk.core.transport.ClientConstants.CONTENT_TYPE_OCTECT_STREAM;
import static com.github.narcissujsk.openstackjsk.core.transport.ClientConstants.HEADER_ACCEPT;
import static com.github.narcissujsk.openstackjsk.core.transport.ClientConstants.PATH_ARTIFACTS;
import static com.github.narcissujsk.openstackjsk.core.transport.ClientConstants.URI_SEP;

/**
 * Created by vadavi on 18-01-2017.
 */
public class BaseArtifactServiceImpl extends BaseOpenStackService {
    private ArtifactType artifactType;

    protected BaseArtifactServiceImpl(ArtifactType artifactType) {

        super(ServiceType.ARTIFACT, EnforceVersionToURL.instance(""));
        this.artifactType = artifactType;

    }

    protected <T> T list(Class<T> clazz) {

        return get(clazz,uri(PATH_ARTIFACTS+URI_SEP+ artifactType.value())).execute();

    }

    protected <T> T get(String artifactId, Class<T> clazz) {
        return get(clazz,uri(PATH_ARTIFACTS+URI_SEP+ artifactType.value()+"/%s",artifactId)).execute();
    }

    protected <T> T create(ToscaTemplatesArtifact toscaTemplatesArtifact, Class<T> clazz) {
        return post(clazz,uri(PATH_ARTIFACTS+URI_SEP+ artifactType.value())).entity(toscaTemplatesArtifact).execute();
    }

    protected <T> T upload(String artifactId, File file, Class<T> clazz, String blobName) {
        Payload<?> payload = new FilePayload(file);
        Invocation<T> invocation = put(clazz,uri(PATH_ARTIFACTS+URI_SEP+ artifactType.value()+"/%s/%s",artifactId,blobName));
        invocation.entity(payload);
        return invocation.execute();
    }

    protected InputStream download(String artifactId, String blobName) {
        Invocation<Void> invocation = get(Void.class, uri(PATH_ARTIFACTS+URI_SEP+ artifactType.value()+"/%s/%s",artifactId, blobName));
        invocation.header(HEADER_ACCEPT, CONTENT_TYPE_OCTECT_STREAM);
        HttpResponse response = invocation.executeWithResponse();
        if (response.getStatus() < 400) {
            return response.getInputStream();
        }
        return null;
    }

    protected ActionResponse delete(String artifactId) {
        return deleteWithResponse(uri(PATH_ARTIFACTS+URI_SEP+ artifactType.value()+"/%s",artifactId)).execute();
    }

    protected <T> T update(String artifactId, List<ArtifactUpdate> artifactUpdates, Class<T> clazz) {
        Invocation<T> invocation = patch(clazz,uri(PATH_ARTIFACTS+URI_SEP+ artifactType.value()+"/%s",artifactId));
        invocation.entity(new ListEntity<ArtifactUpdate>(artifactUpdates));
        invocation.contentType(CONTENT_TYPE_ARTIFACT_PATCH);
        return invocation.execute();
    }

    protected <T> T update(String artifactId, String op, String path, String value, Class<T> clazz)
    {
        ArtifactUpdateBuilder updateBuilder = ArtifactUpdateModel.builder();
        updateBuilder.op(op);
        updateBuilder.path(path);
        updateBuilder.value(value);

        List<ArtifactUpdate> artifactUpdates = new ArrayList<>();
        artifactUpdates.add(updateBuilder.build());

        Invocation<T> invocation = patch(clazz,uri(PATH_ARTIFACTS+URI_SEP+ artifactType.value()+"/%s",artifactId));
        invocation.entity(new ListEntity<ArtifactUpdate>(artifactUpdates));
        invocation.contentType(CONTENT_TYPE_ARTIFACT_PATCH);
        return invocation.execute();
    }

}
