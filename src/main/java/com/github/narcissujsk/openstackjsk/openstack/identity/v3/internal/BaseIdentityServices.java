package com.github.narcissujsk.openstackjsk.openstack.identity.v3.internal;

import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.openstack.common.functions.EnforceVersionToURL;
import com.github.narcissujsk.openstackjsk.openstack.internal.BaseOpenStackService;

/**
 * Base Identity Operations Implementation is responsible for insuring the proper endpoint is used for all extending operation APIs
 *
 * @author Jyothi Saroja
 */
public class BaseIdentityServices extends BaseOpenStackService {

        protected BaseIdentityServices() {
                super(ServiceType.IDENTITY, EnforceVersionToURL.instance("/v3"));
        }
}

