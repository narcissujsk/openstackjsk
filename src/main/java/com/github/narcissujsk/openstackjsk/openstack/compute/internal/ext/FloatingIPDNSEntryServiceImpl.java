package com.github.narcissujsk.openstackjsk.openstack.compute.internal.ext;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.compute.ext.FloatingIPDNSEntryService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.compute.ext.DNSEntry;
import com.github.narcissujsk.openstackjsk.model.compute.ext.DNSRecordType;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.ext.ExtDNSEntry;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.ext.ExtDNSEntry.DNSEntries;
import com.github.narcissujsk.openstackjsk.openstack.compute.internal.BaseComputeServices;

/**
 * A Service which handles DNS Entries for the Floating IP DNS Extension
 * 
 * @author Jeremy Unruh
 */
public class FloatingIPDNSEntryServiceImpl extends BaseComputeServices implements FloatingIPDNSEntryService {

    @Override
    public List<? extends DNSEntry> listByIP(String domain, String ip) {
        checkNotNull(ip, "ip");
        return listByName(domain, ip);
    }

    @Override
    public List<? extends DNSEntry> listByName(String domain, String name) {
        checkNotNull(domain, "domain");
        checkNotNull(name, "name");
        
        return get(DNSEntries.class, uri("/os-floating-ip-dns/%s/entries/%s", domain, name)).execute().getList();
    }

    @Override
    public DNSEntry create(String domain, String name, String ip, DNSRecordType type) {
        checkNotNull(domain, "domain");
        checkNotNull(name, "name");
        checkNotNull(ip, "ip");
        checkNotNull(type, "type");

        return put(ExtDNSEntry.class, uri("/os-floating-ip-dns/%s/entries/%s", domain, name))
                .entity(new ExtDNSEntry(ip, type))
                .execute();
    }

    @Override
    public DNSEntry modifyIP(String domain, String name, String ip) {
        checkNotNull(domain, "domain");
        checkNotNull(name, "name");
        checkNotNull(ip, "ip");

        return put(ExtDNSEntry.class, uri("/os-floating-ip-dns/%s/entries/%s", domain, name))
                   .entity(new ExtDNSEntry(ip, DNSRecordType.A))
                   .execute();
    }

    @Override
    public ActionResponse delete(String domain, String name) {
        checkNotNull(domain, "domain");
        checkNotNull(name, "name");

        return delete(ActionResponse.class, uri("/os-floating-ip-dns/%s/entries/%s", domain, name)).execute();
    }

}
