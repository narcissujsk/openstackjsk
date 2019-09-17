package com.github.narcissujsk.openstackjsk.openstack.tacker.internal;

import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.openstack.common.functions.EnforceVersionToURL;
import com.github.narcissujsk.openstackjsk.openstack.internal.BaseOpenStackService;

/**
 * Base Tacker Operations Implementation is responsible for insuring the proper endpoint is used for all extending operation APIs
 * 
 * @author Vishvesh Deshmukh
 */
public class BaseTackerServices extends BaseOpenStackService {

	protected BaseTackerServices() {
		super(ServiceType.TACKER, EnforceVersionToURL.instance("/v1.0"));
	}
}
