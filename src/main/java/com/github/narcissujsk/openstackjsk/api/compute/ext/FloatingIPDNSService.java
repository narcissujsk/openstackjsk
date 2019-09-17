package com.github.narcissujsk.openstackjsk.api.compute.ext;

import com.github.narcissujsk.openstackjsk.api.compute.ext.FloatingIPDNSDomainService;
import com.github.narcissujsk.openstackjsk.api.compute.ext.FloatingIPDNSEntryService;

/**
 * API Service that manages the 'os-floating-ip-dns' extension
 * 
 * @author Jeremy Unruh
 */
public interface FloatingIPDNSService {

    /**
     * Service that manages DNS Domains
     * 
     * @return the domain service
     */
    FloatingIPDNSDomainService domains();

    /**
     * Service that manages DNS Entries
     * 
     * @return the DNS entry service
     */
    FloatingIPDNSEntryService entries();
    
}
