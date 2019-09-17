package com.github.narcissujsk.openstackjsk.openstack.sahara.internal;

import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.openstack.internal.BaseOpenStackService;

/**
 * This class is extended by every Sahara Service. It is necessary to determine
 * the correct endpoint (url) for sahara calls.
 * 
 * @author Ekasit Kijipongse
 * 
 */
public class BaseSaharaServices extends BaseOpenStackService {

	protected BaseSaharaServices() {
		super(ServiceType.SAHARA);
	}

}
