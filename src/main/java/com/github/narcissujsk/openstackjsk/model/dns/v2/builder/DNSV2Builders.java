package com.github.narcissujsk.openstackjsk.model.dns.v2.builder;


import com.github.narcissujsk.openstackjsk.model.dns.v2.builder.RecordsetBuilder;
import com.github.narcissujsk.openstackjsk.model.dns.v2.builder.ZoneBuilder;

/**
 * The Designate V2 builders
 */
public interface DNSV2Builders {

    /**
     * The builder to create a Zone.
     *
     * @return the zone builder
     */
    public ZoneBuilder zone();

    /**
     * The builder to create a Recordset.
     *
     * @return the recordset builder
     */
    public RecordsetBuilder recordset();

}
