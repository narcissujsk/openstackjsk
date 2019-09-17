package com.github.narcissujsk.openstackjsk.openstack.compute.internal.ext;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.compute.ext.FloatingIPDNSDomainService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.compute.ext.DomainEntry;
import com.github.narcissujsk.openstackjsk.model.compute.ext.DomainEntry.Scope;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.ext.ExtDomainEntry;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.ext.ExtDomainEntry.DomainEntries;
import com.github.narcissujsk.openstackjsk.openstack.compute.internal.BaseComputeServices;

/**
 * Service that handles domain names for the floating IP DNS Extension
 * 
 * @author Jeremy Unruh
 */
public class FloatingIPDNSDomainServiceImpl extends BaseComputeServices implements FloatingIPDNSDomainService {

    @Override
    public List<? extends DomainEntry> list() {
        return get(DomainEntries.class, uri("/os-floating-ip-dns")).execute().getList();
    }

    @Override
    public ActionResponse delete(String domainName) {
        checkNotNull(domainName);
        return delete(ActionResponse.class, uri("/os-floating-ip-dns/%s", domainName)).execute();
    }

    @Override
    public DomainEntry createPublic(String domainName, String project) {
        checkNotNull(domainName);
        return put(ExtDomainEntry.class, uri("/os-floating-ip-dns/%s", domainName))
                  .entity(new ExtDomainEntry(Scope.PUBLIC, null, project))
                  .execute();
    }

    @Override
    public DomainEntry createPrivate(String domainName, String availabilityZone) {
        checkNotNull(domainName);
        return put(ExtDomainEntry.class, uri("/os-floating-ip-dns/%s", domainName))
                  .entity(new ExtDomainEntry(Scope.PRIVATE, availabilityZone, null))
                  .execute();
    }

}
