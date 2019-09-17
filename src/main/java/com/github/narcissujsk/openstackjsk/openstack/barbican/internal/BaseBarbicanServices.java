package com.github.narcissujsk.openstackjsk.openstack.barbican.internal;

import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.openstack.common.functions.EnforceVersionToURL;
import com.github.narcissujsk.openstackjsk.openstack.internal.BaseOpenStackService;

/**
 * Base class for Barbican / Key Management services
 */
public class BaseBarbicanServices extends BaseOpenStackService {
    protected BaseBarbicanServices() {
        super(ServiceType.BARBICAN, EnforceVersionToURL.instance("/v1"));
    }
}
