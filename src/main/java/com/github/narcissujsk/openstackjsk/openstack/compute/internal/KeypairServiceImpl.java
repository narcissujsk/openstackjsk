package com.github.narcissujsk.openstackjsk.openstack.compute.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import javax.annotation.Nullable;

import com.github.narcissujsk.openstackjsk.api.compute.KeypairService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.compute.Keypair;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaKeypair;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaKeypair.Keypairs;

/**
 * Keypair Service manages SSH Keys within OpenStack Compute (Nova).
 *
 * @author Jeremy Unruh
 */
public class KeypairServiceImpl extends BaseComputeServices implements KeypairService {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<? extends Keypair> list() {
		return get(Keypairs.class, uri("/os-keypairs")).execute().getList();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Keypair get(String name) {
		checkNotNull(name);
		return get(NovaKeypair.class, uri("/os-keypairs/%s", name)).execute();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActionResponse delete(String name) {
		checkNotNull(name);
		return deleteWithResponse(uri("/os-keypairs/%s", name)).execute();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Keypair create(String name, @Nullable String publicKey) {
		checkNotNull(name);
		return post(NovaKeypair.class, uri("/os-keypairs")).entity(NovaKeypair.create(name, publicKey)).execute();
	}

}
