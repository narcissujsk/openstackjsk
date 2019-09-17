package com.github.narcissujsk.openstackjsk.openstack.networking.internal;

import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.openstack.common.functions.EnforceVersionToURL;
import com.github.narcissujsk.openstackjsk.openstack.internal.BaseOpenStackService;

/**
 * Base Networking Operations Implementation is responsible for insuring the proper endpoint is used for all extending operation APIs
 * 
 * @author Jeremy Unruh
 */
public class BaseNetworkingServices extends BaseOpenStackService {

	protected BaseNetworkingServices() {
		super(ServiceType.NETWORK, EnforceVersionToURL.instance("/v2.0"));
	}
}
