package com.github.narcissujsk.openstackjsk.api.tacker;

import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.tacker.TackerService;
import com.github.narcissujsk.openstackjsk.api.tacker.VimService;
import com.github.narcissujsk.openstackjsk.api.tacker.VnfService;
import com.github.narcissujsk.openstackjsk.api.tacker.VnfdService;

/**
 *
 * @author Vishvesh Deshmukh
 * @date Aug 11, 2016
 */
public class TackerServiceImpl implements TackerService {

	@Override
	public com.github.narcissujsk.openstackjsk.api.tacker.VnfdService vnfd() {
		return Apis.get(VnfdService.class);
	}

	@Override
	public com.github.narcissujsk.openstackjsk.api.tacker.VnfService vnf() {
		return Apis.get(VnfService.class);
	}

	@Override
	public com.github.narcissujsk.openstackjsk.api.tacker.VimService vim() {
		return Apis.get(VimService.class);
	}
}
