package com.github.narcissujsk.openstackjsk.openstack.trove.internal;

import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.openstack.internal.BaseOpenStackService;


/**
 * Trove services
 *
 * @author sumit gandhi
 */

public class BaseTroveServices extends BaseOpenStackService {

    protected BaseTroveServices() {
        super(ServiceType.DATABASE);
    }

}
