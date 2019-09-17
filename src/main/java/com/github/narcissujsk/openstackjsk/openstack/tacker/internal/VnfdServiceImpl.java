package com.github.narcissujsk.openstackjsk.openstack.tacker.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.api.tacker.VnfdService;
import com.github.narcissujsk.openstackjsk.core.transport.ExecutionOptions;
import com.github.narcissujsk.openstackjsk.core.transport.propagation.PropagateOnStatus;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.tacker.Vnfd;
import com.github.narcissujsk.openstackjsk.openstack.compute.functions.ToActionResponseFunction;
import com.github.narcissujsk.openstackjsk.openstack.tacker.domain.TackerVnfd;
import com.github.narcissujsk.openstackjsk.openstack.tacker.domain.TackerVnfd.TackerVnfds;

/**
 *
 * @author Vishvesh Deshmukh
 * @date Aug 11, 2016
 */
public class VnfdServiceImpl extends BaseTackerServices implements VnfdService {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<? extends TackerVnfd> list() {
		return get(TackerVnfds.class, uri("/vnfds")).execute().getList();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<? extends TackerVnfd> list(Map<String, String> filteringParams) {
		Invocation<TackerVnfds> req = get(TackerVnfds.class, uri("/vnfds"));
		if (filteringParams != null) {
            for (Map.Entry<String, String> entry : filteringParams.entrySet()) {
            	req = req.param(entry.getKey(), entry.getValue());
            }
        }
		return req.execute().getList();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TackerVnfd get(String vnfdId) {
		checkNotNull(vnfdId);
		return get(TackerVnfd.class, uri("/vnfds/%s", vnfdId)).execute();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActionResponse delete(String vnfdId) {
		checkNotNull(vnfdId);
		return ToActionResponseFunction.INSTANCE.apply(delete(Void.class, uri("/vnfds/%s", vnfdId)).executeWithResponse());
	}

	@Override
	public Vnfd create(Vnfd vnfd) {
		return post(TackerVnfd.class, uri("/vnfds")).entity(vnfd).execute(ExecutionOptions.<TackerVnfd>create(PropagateOnStatus.on(500)));
	}
}
