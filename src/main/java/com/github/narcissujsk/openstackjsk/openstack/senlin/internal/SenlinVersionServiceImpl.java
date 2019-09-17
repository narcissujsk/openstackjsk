package com.github.narcissujsk.openstackjsk.openstack.senlin.internal;

import com.github.narcissujsk.openstackjsk.api.senlin.SenlinVersionService;
import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.model.senlin.Version;
import com.github.narcissujsk.openstackjsk.openstack.internal.BaseOpenStackService;
import com.github.narcissujsk.openstackjsk.openstack.senlin.domain.SenlinVersion;

import java.util.List;

/**
 * This class contains getters for all implementation of the available version services
 * 
 * @author lion
 */
public class SenlinVersionServiceImpl extends BaseOpenStackService implements SenlinVersionService {

	public SenlinVersionServiceImpl() {
		super(ServiceType.CLUSTERING);
	}

	@Override
	public List<? extends Version> list() {
		return get(SenlinVersion.Version.class, uri("/")).execute().getList();
	}
}
