package com.github.narcissujsk.openstackjsk.api.baremetal;

import com.github.narcissujsk.openstackjsk.api.compute.*;
import com.github.narcissujsk.openstackjsk.api.compute.ext.*;
import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.common.Extension;

import java.util.List;

/**
 * Compute (Nova) Operations API
 * 
 * @author Jeremy Unruh
 */
public interface BaremetalService extends RestService {

	/**
	 * Flavor Service API
	 *
	 * @return the flavor service
	 */
    NodeService nodes();

    IronicPortService ports();


}
