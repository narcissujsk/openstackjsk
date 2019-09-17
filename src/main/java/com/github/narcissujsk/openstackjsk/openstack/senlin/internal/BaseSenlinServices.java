package com.github.narcissujsk.openstackjsk.openstack.senlin.internal;

import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.openstack.common.functions.EnforceVersionToURL;
import com.github.narcissujsk.openstackjsk.openstack.internal.BaseOpenStackService;

/**
 * This class is extended by every senlin Service. It is necessary to determine
 * the correct endpoint (url) for senlin calls.
 * 
 * @author lion
 * 
 */
public class BaseSenlinServices extends BaseOpenStackService {

	protected BaseSenlinServices() {
		super(ServiceType.CLUSTERING, EnforceVersionToURL.instance("/v1", true));
	}

}
