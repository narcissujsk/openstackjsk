/*******************************************************************************
 * 	Copyright 2019 ContainX and OpenStack4j
 *
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * 	use this file except in compliance with the License. You may obtain a copy of
 * 	the License at
 *
 * 	    http://www.apache.org/licenses/LICENSE-2.0
 *
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * 	License for the specific language governing permissions and limitations under
 * 	the License.
 *******************************************************************************/
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
