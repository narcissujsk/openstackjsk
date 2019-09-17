package com.github.narcissujsk.openstackjsk.openstack.image.internal;

import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.openstack.common.functions.EnforceVersionToURL;
import com.github.narcissujsk.openstackjsk.openstack.internal.BaseOpenStackService;

/**
 * Base Image Operations Implementation is responsible for insuring the proper endpoint is used for all extending operation APIs
 * 
 * @author Jeremy Unruh
 */
public class BaseImageServices extends BaseOpenStackService {

	protected BaseImageServices() {
		super(ServiceType.IMAGE, EnforceVersionToURL.instance("/v1", true));
	}
}
