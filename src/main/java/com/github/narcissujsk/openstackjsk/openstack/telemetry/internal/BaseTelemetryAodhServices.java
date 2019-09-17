package com.github.narcissujsk.openstackjsk.openstack.telemetry.internal;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.openstack.common.functions.EnforceVersionToURL;
import com.github.narcissujsk.openstackjsk.openstack.internal.BaseOpenStackService;

import java.util.Collections;
import java.util.List;

public class BaseTelemetryAodhServices extends BaseOpenStackService {

	protected BaseTelemetryAodhServices() {
		super(ServiceType.TELEMETRY_AODH, EnforceVersionToURL.instance("/v2"));
	}
	
	protected <T> List<T> wrapList(T[] type) {
		if (type != null)
			return Lists.newArrayList(type);
		return Collections.emptyList();
			
	}
}
