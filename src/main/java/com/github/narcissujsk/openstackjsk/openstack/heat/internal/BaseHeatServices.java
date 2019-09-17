package com.github.narcissujsk.openstackjsk.openstack.heat.internal;

import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.openstack.internal.BaseOpenStackService;

/**
 * This class is extended by every Heat Service. It is necessary to determine
 * the correct endpoint (url) for heat calls.
 * 
 * @author Matthias Reisser
 * 
 */
public class BaseHeatServices extends BaseOpenStackService {

	protected BaseHeatServices() {
		super(ServiceType.ORCHESTRATION);
	}

}
