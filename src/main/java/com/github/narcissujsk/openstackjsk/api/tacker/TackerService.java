package com.github.narcissujsk.openstackjsk.api.tacker;

import com.github.narcissujsk.openstackjsk.api.tacker.VimService;
import com.github.narcissujsk.openstackjsk.api.tacker.VnfService;
import com.github.narcissujsk.openstackjsk.api.tacker.VnfdService;
import com.github.narcissujsk.openstackjsk.common.RestService;

/**
 *
 * @author Vishvesh Deshmukh
 * @date Aug 11, 2016
 */
public interface TackerService extends RestService {
	
	/**
     * @return the Vnfd Service API
     */
    VnfdService vnfd();
    
    /**
     * @return the Vnf Service API
     */
    VnfService vnf();
    
    /**
     * @return the Vim Service API
     */
    VimService vim();
}
