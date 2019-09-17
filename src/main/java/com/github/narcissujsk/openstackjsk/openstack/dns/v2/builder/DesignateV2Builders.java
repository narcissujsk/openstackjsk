package com.github.narcissujsk.openstackjsk.openstack.dns.v2.builder;

import com.github.narcissujsk.openstackjsk.model.dns.v2.builder.DNSV2Builders;
import com.github.narcissujsk.openstackjsk.model.dns.v2.builder.RecordsetBuilder;
import com.github.narcissujsk.openstackjsk.model.dns.v2.builder.ZoneBuilder;
import com.github.narcissujsk.openstackjsk.openstack.dns.v2.domain.DesignateZone;
import com.github.narcissujsk.openstackjsk.openstack.dns.v2.domain.DesignateRecordset;

/**
 * The Designate V2 Builders
 */
public class DesignateV2Builders implements DNSV2Builders {

    private DesignateV2Builders DesignateV2Builders() {
        return this;
    }

    @Override
    public ZoneBuilder zone() { return DesignateZone.builder(); }

    @Override
    public RecordsetBuilder recordset() { return DesignateRecordset.builder(); }
}
