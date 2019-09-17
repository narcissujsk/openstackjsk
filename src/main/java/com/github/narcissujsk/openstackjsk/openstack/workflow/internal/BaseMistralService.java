package com.github.narcissujsk.openstackjsk.openstack.workflow.internal;

import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.openstack.internal.BaseOpenStackService;


/**
 * Base class for all Mistral services.
 *
 * @author Renat Akhmerov
 */

class BaseMistralService extends BaseOpenStackService {
    BaseMistralService() {
        super(ServiceType.WORKFLOW);
    }
}
