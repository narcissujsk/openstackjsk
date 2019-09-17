package com.github.narcissujsk.openstackjsk.openstack.senlin.internal;

import com.github.narcissujsk.openstackjsk.api.senlin.SenlinWebHookService;
import com.github.narcissujsk.openstackjsk.core.transport.HttpRequest;
import com.github.narcissujsk.openstackjsk.core.transport.internal.HttpExecutor;
import com.github.narcissujsk.openstackjsk.model.senlin.ActionID;
import com.github.narcissujsk.openstackjsk.openstack.internal.BaseOpenStackService;
import com.github.narcissujsk.openstackjsk.openstack.senlin.domain.SenlinAction;
import com.github.narcissujsk.openstackjsk.openstack.senlin.domain.SenlinActionID;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * This class contains getters for all implementation of the available webHook services
 * 
 * @author lion
 */
public class SenlinWebHookServiceImpl extends BaseOpenStackService implements SenlinWebHookService {

	@Override
	public ActionID action(String webHookUrl) {
		checkNotNull(webHookUrl);
		HttpRequest newReq = new HttpRequest();
		newReq.toBuilder().methodPost().endpoint(webHookUrl).path("");
		newReq.builder(SenlinAction.class);
		return HttpExecutor.create().execute(newReq).getEntity(SenlinActionID.class);
	}
}
