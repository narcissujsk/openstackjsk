package com.github.narcissujsk.openstackjsk.api.senlin;


import com.github.narcissujsk.openstackjsk.model.senlin.Version;

import java.util.List;

/**
 * This interface defines all methods for the manipulation of version
 * 
 * @author lion
 * 
 */
public interface SenlinVersionService {

	/**
	 * Service implementation which provides methods for manipulation of version
	 *
	 * @return Version
	 */
	List<? extends Version> list();

}
