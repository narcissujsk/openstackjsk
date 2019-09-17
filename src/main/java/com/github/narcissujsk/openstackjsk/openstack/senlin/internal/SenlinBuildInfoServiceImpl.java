package com.github.narcissujsk.openstackjsk.openstack.senlin.internal;

import com.github.narcissujsk.openstackjsk.api.senlin.SenlinBuildInfoService;
import com.github.narcissujsk.openstackjsk.model.senlin.BuildInfo;
import com.github.narcissujsk.openstackjsk.openstack.senlin.domain.SenlinBuildInfo;

/**
 * This class contains getters for all implementation of the available build-info services
 * 
 * @author lion
 */
public class SenlinBuildInfoServiceImpl extends BaseSenlinServices implements SenlinBuildInfoService {

	@Override
	public  BuildInfo get() {
		return get(SenlinBuildInfo.class, uri("/build-info")).execute();
	}
}
