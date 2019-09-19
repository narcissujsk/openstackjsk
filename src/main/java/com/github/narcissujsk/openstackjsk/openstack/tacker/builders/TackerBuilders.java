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
