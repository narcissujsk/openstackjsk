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
package com.github.narcissujsk.openstackjsk.api.trove;

import com.github.narcissujsk.openstackjsk.model.trove.Flavor;

import java.util.List;

/**
 * This interface defines all methods for the manipulation of trove instance flavors
 *
 * @author sumit gandhi
 */

public interface InstanceFlavorService {

    /**
     * Returns all the available database instance flavors
     * @return the list of available flavors
     */
    List<? extends Flavor> list();

    /**
     * Get the instance flavor specified by ID
     * @param id
     * @return the flavor or null if not found
     */
    Flavor get(String id);


}
