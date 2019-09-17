package com.github.narcissujsk.openstackjsk.openstack.image.v2.internal;

import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.openstack.common.functions.EnforceVersionToURL;
import com.github.narcissujsk.openstackjsk.openstack.internal.BaseOpenStackService;

/**
 * @author emjburns
 */
public class BaseImageServices extends BaseOpenStackService {

    protected BaseImageServices() {
        super(ServiceType.IMAGE, EnforceVersionToURL.instance("/v2", true));
    }
}
