package com.github.narcissujsk.openstackjsk.openstack.dns.v2.internal;

import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.dns.v2.DNSService;
import com.github.narcissujsk.openstackjsk.api.dns.v2.RecordsetService;
import com.github.narcissujsk.openstackjsk.api.dns.v2.ZoneService;
import com.github.narcissujsk.openstackjsk.model.common.Extension;
import com.github.narcissujsk.openstackjsk.openstack.common.ExtensionValue.ExtensionList;
import com.github.narcissujsk.openstackjsk.openstack.dns.v2.internal.BaseDNSServices;
import com.github.narcissujsk.openstackjsk.openstack.internal.BaseOpenStackService;

import java.util.List;


/**
 * DNS/Designate V2 service implementation
 *
 */
public class DNSServiceImpl extends BaseDNSServices implements DNSService {

    @Override
    public ZoneService zones() {
        return Apis.get(ZoneService.class);
    }

    @Override
    public RecordsetService recordsets() {
        return Apis.get(RecordsetService.class);
    }
}
