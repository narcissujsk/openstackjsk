package com.github.narcissujsk.openstackjsk.openstack.tacker.builders;

import com.github.narcissujsk.openstackjsk.model.tacker.builder.NfvBuilders;
import com.github.narcissujsk.openstackjsk.model.tacker.builder.VimBuilder;
import com.github.narcissujsk.openstackjsk.model.tacker.builder.VnfBuilder;
import com.github.narcissujsk.openstackjsk.model.tacker.builder.VnfUpdateBuilder;
import com.github.narcissujsk.openstackjsk.model.tacker.builder.VnfdBuilder;
import com.github.narcissujsk.openstackjsk.openstack.tacker.domain.TackerVim;
import com.github.narcissujsk.openstackjsk.openstack.tacker.domain.TackerVnf;
import com.github.narcissujsk.openstackjsk.openstack.tacker.domain.TackerVnfUpdate;
import com.github.narcissujsk.openstackjsk.openstack.tacker.domain.TackerVnfd;

/**
 *
 * @author Vishvesh Deshmukh
 * @date Aug 11, 2016
 */
public class TackerBuilders implements NfvBuilders {

	/**
     * The builder to Create a vnf-d
     *
     * @return VnfdBuilder
     */
	@Override
	public VnfdBuilder vnfd() {
		return TackerVnfd.builder();
	}
	
	/**
     * The builder to Create a vnf-d
     *
     * @return VnfBuilder
     */
	@Override
	public VnfBuilder vnf() {
		return TackerVnf.builder();
	}
	
	/**
     * The builder to update a vnf
     *
     * @return VnfUpdateBuilder
     */
    public VnfUpdateBuilder vnfUpdate() {
        return TackerVnfUpdate.builder();
    }

	@Override
	public VimBuilder vim() {
		return TackerVim.builder();
	}

}
