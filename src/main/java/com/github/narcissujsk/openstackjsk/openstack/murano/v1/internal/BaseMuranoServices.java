package com.github.narcissujsk.openstackjsk.openstack.murano.v1.internal;

import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.openstack.common.functions.EnforceVersionToURL;
import com.github.narcissujsk.openstackjsk.openstack.internal.BaseOpenStackService;

/**
 * This class is extended by every Murano Service. It is necessary to determine
 * the correct endpoint (url) for murano calls.
 *
 * @author Nikolay Makhotkin
 *
 */
class BaseMuranoServices extends BaseOpenStackService {

    BaseMuranoServices() {
        super(ServiceType.APP_CATALOG, EnforceVersionToURL.instance("/v1", true));
    }

}
