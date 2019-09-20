package com.github.narcissujsk.openstackjsk.openstack.baremetal.internal;

import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.core.transport.HttpResponse;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.actions.ServerAction;
import com.github.narcissujsk.openstackjsk.openstack.compute.functions.ToActionResponseFunction;
import com.github.narcissujsk.openstackjsk.openstack.internal.BaseOpenStackService;


public class BaseBaremetalServices extends BaseOpenStackService {

    protected BaseBaremetalServices() {
        super(ServiceType.BAREMETAL);
    }



}
