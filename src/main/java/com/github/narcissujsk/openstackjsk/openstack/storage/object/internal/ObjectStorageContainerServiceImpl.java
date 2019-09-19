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
package com.github.narcissujsk.openstackjsk.openstack.storage.object.internal;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.github.narcissujsk.openstackjsk.core.transport.ClientConstants.CONTENT_TYPE_DIRECTORY;
import static com.github.narcissujsk.openstackjsk.core.transport.ClientConstants.URI_SEP;
import static com.github.narcissujsk.openstackjsk.core.transport.HttpEntityHandler.closeQuietly;
import static com.github.narcissujsk.openstackjsk.model.storage.object.SwiftHeaders.CONTAINER_METADATA_PREFIX;
import static com.github.narcissujsk.openstackjsk.model.storage.object.SwiftHeaders.CONTAINER_REMOVE_METADATA_PREFIX;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.storage.ObjectStorageContainerService;
import com.github.narcissujsk.openstackjsk.api.storage.ObjectStorageObjectService;
import com.github.narcissujsk.openstackjsk.core.transport.HttpResponse;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.storage.object.SwiftContainer;
import com.github.narcissujsk.openstackjsk.model.storage.object.options.ContainerListOptions;
import com.github.narcissujsk.openstackjsk.model.storage.object.options.CreateUpdateContainerOptions;
import com.github.narcissujsk.openstackjsk.model.storage.object.options.ObjectPutOptions;
import com.github.narcissujsk.openstackjsk.openstack.compute.functions.ToActionResponseFunction;
import com.github.narcissujsk.openstackjsk.openstack.storage.object.domain.SwiftContainerImpl;
import com.github.narcissujsk.openstackjsk.openstack.storage.object.functions.MapWithoutMetaPrefixFunction;
import com.github.narcissujsk.openstackjsk.openstack.storage.object.functions.MetadataToHeadersFunction;

/**
 * Provides access to the OpenStack Object Storage (Swift) Container API features.
 * 
 * @author Jeremy Unruh
 */
public class ObjectStorageContainerServiceImpl extends BaseObjectStorageService implements ObjectStorageContainerService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends SwiftContainer> list() {
          return toList(get(SwiftContainerImpl[].class).param("format", "json").execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends SwiftContainer> list(ContainerListOptions options) {
        if (options == null)
            return list();
        
        return toList(get(SwiftContainerImpl[].class).param("format", "json").params(options.getOptions()).execute());
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse create(String name) {
        return create(name, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse create(String name, CreateUpdateContainerOptions options) {
        checkNotNull(name);
        return put(ActionResponse.class, URI_SEP, name).headers(options != null ? options.getOptions() : null).execute();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public String createPath(String containerName, String path) {
        checkNotNull(containerName);
        checkNotNull(path);
        return Apis.get(ObjectStorageObjectService.class).put(containerName, path, null, 
                        ObjectPutOptions.create().contentType(CONTENT_TYPE_DIRECTORY));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse update(String name, CreateUpdateContainerOptions options) {
        checkNotNull(name);
        
         return post(ActionResponse.class, URI_SEP, name)
                      .headers(options != null ? options.getOptions() : null)
                      .execute();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String name) {
        checkNotNull(name);
        HttpResponse resp = delete(Void.class, URI_SEP, name).executeWithResponse();
        
        try {
            if (resp.getStatus() == 409)
                return ActionResponse.actionFailed(String.format("Container %s is not empty", name), 409);
        }
        finally {
            closeQuietly(resp);
        }
        
        return ToActionResponseFunction.INSTANCE.apply(resp);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, String> getMetadata(String name) {
        checkNotNull(name);
        HttpResponse resp = head(Void.class, URI_SEP, name).executeWithResponse();
        try
        {
            return MapWithoutMetaPrefixFunction.INSTANCE.apply(resp.headers());
        }
        finally {
            closeQuietly(resp);
        }
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean updateMetadata(String name, Map<String, String> metadata) {
        return invokeMetadata(name, CONTAINER_METADATA_PREFIX, metadata);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean deleteMetadata(String name, Map<String, String> metadata) {
        return invokeMetadata(name, CONTAINER_REMOVE_METADATA_PREFIX, metadata);
    }
    
    private boolean invokeMetadata(String name, String prefix, Map<String, String> metadata) {
        checkNotNull(name);
        checkNotNull(metadata);
        
        return isResponseSuccess(post(Void.class, URI_SEP, name)
                                    .headers(MetadataToHeadersFunction.create(prefix).apply(metadata))
                                    .executeWithResponse(), 204);
    }
}
