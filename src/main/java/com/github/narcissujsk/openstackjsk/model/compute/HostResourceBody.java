package com.github.narcissujsk.openstackjsk.model.compute;

import com.github.narcissujsk.openstackjsk.model.compute.HostResource;

/**
 * Host Resource Body contains Nova host resource
 * 
 * @author Qin An
 */
public interface HostResourceBody {

	/**
	 * @return the Host Resource contained in the unamed body
	 */
	public HostResource getHostResource();

}
