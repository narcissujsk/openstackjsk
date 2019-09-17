package com.github.narcissujsk.openstackjsk.api.senlin;

import com.github.narcissujsk.openstackjsk.model.senlin.BuildInfo;

/**
 * This interface defines all methods for the manipulation of BuildInfo
 * 
 * @author lion
 * 
 */
public interface SenlinBuildInfoService {

	/**
	 * returns details of a {@link BuildInfo}.
	 *
	 * @return BuildInfo
	 */
	BuildInfo get();
}
