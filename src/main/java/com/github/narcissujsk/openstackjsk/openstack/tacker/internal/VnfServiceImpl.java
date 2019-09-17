package com.github.narcissujsk.openstackjsk.openstack.tacker.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.api.tacker.VnfService;
import com.github.narcissujsk.openstackjsk.core.transport.ExecutionOptions;
import com.github.narcissujsk.openstackjsk.core.transport.propagation.PropagateOnStatus;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.tacker.Vnf;
import com.github.narcissujsk.openstackjsk.model.tacker.VnfUpdate;
import com.github.narcissujsk.openstackjsk.openstack.compute.functions.ToActionResponseFunction;
import com.github.narcissujsk.openstackjsk.openstack.tacker.domain.TackerVnf;
import com.github.narcissujsk.openstackjsk.openstack.tacker.domain.TackerVnf.TackerVnfs;

/**
 *
 * @author Vishvesh Deshmukh
 * @date Aug 11, 2016
 */
public class VnfServiceImpl extends BaseTackerServices implements VnfService {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<? extends TackerVnf> list() {
		return get(TackerVnfs.class, uri("/vnfs")).execute().getList();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<? extends TackerVnf> list(Map<String, String> filteringParams) {
		Invocation<TackerVnfs> req = get(TackerVnfs.class, uri("/vnfs"));
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
	public TackerVnf get(String vnfId) {
		checkNotNull(vnfId);
		return get(TackerVnf.class, uri("/vnfs/%s", vnfId)).execute();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActionResponse delete(String vnfId) {
		checkNotNull(vnfId);
		return ToActionResponseFunction.INSTANCE.apply(delete(Void.class, uri("/vnfs/%s", vnfId)).executeWithResponse());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Vnf create(Vnf vnf) {
		return post(TackerVnf.class, uri("/vnfs")).entity(vnf).execute(ExecutionOptions.<TackerVnf>create(PropagateOnStatus.on(500)));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Vnf update(String vnfId, VnfUpdate vnfUpdate) {
		checkNotNull(vnfId);
        checkNotNull(vnfUpdate);
        return put(TackerVnf.class, uri("/vnfs/%s", vnfId)).entity(vnfUpdate).execute();
	}
}
