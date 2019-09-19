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

import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.storage.ObjectStorageAccountService;
import com.github.narcissujsk.openstackjsk.api.storage.ObjectStorageContainerService;
import com.github.narcissujsk.openstackjsk.api.storage.ObjectStorageObjectService;
import com.github.narcissujsk.openstackjsk.api.storage.ObjectStorageService;

/**
 * OpenStack Object Storage service implementation
 * 
 * @author Jeremy Unruh
 */
public class ObjectStorageServiceImpl implements ObjectStorageService {

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjectStorageAccountService account() {
        return Apis.get(ObjectStorageAccountService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjectStorageContainerService containers() {
        return Apis.get(ObjectStorageContainerService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjectStorageObjectService objects() {
        return Apis.get(ObjectStorageObjectService.class);
    }

}
