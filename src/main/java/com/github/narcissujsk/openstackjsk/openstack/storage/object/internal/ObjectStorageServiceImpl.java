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
