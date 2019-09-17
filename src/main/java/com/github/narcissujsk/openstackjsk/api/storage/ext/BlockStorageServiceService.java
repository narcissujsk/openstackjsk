package com.github.narcissujsk.openstackjsk.api.storage.ext;

import java.util.List;

import com.github.narcissujsk.openstackjsk.model.storage.block.ext.Service;

/**
 * API which supports the "os-services" extension.
 *
 * @author Taemin
 */
public interface BlockStorageServiceService {

	/**
	 * List services info
	 *
	 * NOTE: This is an extension and not all deployments support os-services
	 *
	 * @return a list of block storage services
	 */
	List<? extends Service> list();
}