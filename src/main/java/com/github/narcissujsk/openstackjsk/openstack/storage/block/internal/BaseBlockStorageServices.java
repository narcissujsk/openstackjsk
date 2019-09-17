package com.github.narcissujsk.openstackjsk.openstack.storage.block.internal;

import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.openstack.internal.BaseOpenStackService;

/**
 * Base Cinder Service Layer
 *
 * @author Jeremy Unruh
 */
public class BaseBlockStorageServices extends BaseOpenStackService {

	public BaseBlockStorageServices() {
		super(ServiceType.BLOCK_STORAGE);
	}

}
