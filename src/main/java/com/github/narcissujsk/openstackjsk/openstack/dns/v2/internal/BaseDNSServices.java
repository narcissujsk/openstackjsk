package com.github.narcissujsk.openstackjsk.openstack.dns.v2.internal;

import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.openstack.common.functions.EnforceVersionToURL;
import com.github.narcissujsk.openstackjsk.openstack.internal.BaseOpenStackService;

public class BaseDNSServices extends BaseOpenStackService {

	protected BaseDNSServices() {
		super(ServiceType.DNS, EnforceVersionToURL.instance("/v2"));
	}
}