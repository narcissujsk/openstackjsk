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
package com.github.narcissujsk.openstackjsk.openstack.trove.internal;

import com.github.narcissujsk.openstackjsk.api.trove.InstanceFlavorService;
import com.github.narcissujsk.openstackjsk.model.trove.Flavor;
import com.github.narcissujsk.openstackjsk.openstack.trove.domain.TroveInstanceFlavor;
import com.github.narcissujsk.openstackjsk.openstack.trove.domain.TroveInstanceFlavor.Flavors;
import com.github.narcissujsk.openstackjsk.openstack.trove.internal.BaseTroveServices;

import java.util.List;

/**
 * Flavor API Implementation
 *
 * @author sumit gandhi
 */
public class DBFlavorServiceImpl extends BaseTroveServices implements InstanceFlavorService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Flavor> list() {
        return get(Flavors.class, uri("/flavors")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Flavor get(String id) {
        return get(TroveInstanceFlavor.class, uri("/flavors/%s", id)).execute();
    }

}
