package com.github.narcissujsk.openstackjsk.openstack.senlin.internal;

import com.github.narcissujsk.openstackjsk.api.senlin.SenlinReceiverService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.senlin.Receiver;
import com.github.narcissujsk.openstackjsk.model.senlin.ReceiverCreate;
import com.github.narcissujsk.openstackjsk.openstack.senlin.domain.SenlinReceiver;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * This class contains getters for all implementation of the available receiver services
 * 
 * @author lion
 */
public class SenlinReceiverServiceImpl extends BaseSenlinServices implements SenlinReceiverService {

	@Override
	public List<? extends Receiver> list() {
		return get(SenlinReceiver.Receiver.class, uri("/receivers")).execute().getList();
	}

	@Override
	public Receiver create(ReceiverCreate newReceiver) {
		checkNotNull(newReceiver);
		return post(SenlinReceiver.class, uri("/receivers")).entity(newReceiver).execute();
	}

	@Override
	public Receiver get(String policyID) {
		checkNotNull(policyID);
		return get(SenlinReceiver.class, uri("/receivers/%s", policyID)).execute();
	}

	@Override
	public ActionResponse delete(String policyID) {
		checkNotNull(policyID);
		return deleteWithResponse(uri("/receivers/%s", policyID)).execute();
	}
}
