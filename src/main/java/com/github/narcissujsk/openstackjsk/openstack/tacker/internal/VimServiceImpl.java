package com.github.narcissujsk.openstackjsk.openstack.tacker.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.api.tacker.VimService;
import com.github.narcissujsk.openstackjsk.core.transport.ExecutionOptions;
import com.github.narcissujsk.openstackjsk.core.transport.propagation.PropagateOnStatus;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.tacker.Vim;
import com.github.narcissujsk.openstackjsk.openstack.compute.functions.ToActionResponseFunction;
import com.github.narcissujsk.openstackjsk.openstack.tacker.domain.TackerVim;
import com.github.narcissujsk.openstackjsk.openstack.tacker.domain.TackerVim.TackerVims;

/**
 *
 * @author Vishvesh Deshmukh
 * @date Aug 18, 2016
 */
public class VimServiceImpl extends BaseTackerServices implements VimService {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<? extends TackerVim> list() {
		return get(TackerVims.class, uri("/vims")).execute().getList();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<? extends TackerVim> list(Map<String, String> filteringParams) {
		Invocation<TackerVims> req = get(TackerVims.class, uri("/vims"));
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
	public TackerVim show(String vimId) {
		checkNotNull(vimId);
		return get(TackerVim.class, uri("/vims/%s", vimId)).execute();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActionResponse delete(String vimId) {
		checkNotNull(vimId);
		return ToActionResponseFunction.INSTANCE.apply(delete(Void.class, uri("/vims/%s", vimId)).executeWithResponse());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Vim register(Vim vim) {
		return post(TackerVim.class, uri("/vims")).entity(vim).execute(ExecutionOptions.<TackerVim>create(PropagateOnStatus.on(500)));
	}

	/**
	 * {@inheritDoc}
	 */
	/*@Override
	public Vim update(String vimId, VimUpdate vimUpdate) {
		checkNotNull(vimId);
        checkNotNull(vimUpdate);
        return put(TackerVim.class, uri("/vims/%s", vimId)).entity(vimUpdate).execute();
	}*/
}
