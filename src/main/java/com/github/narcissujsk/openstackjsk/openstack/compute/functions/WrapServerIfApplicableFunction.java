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
package com.github.narcissujsk.openstackjsk.openstack.compute.functions;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.compute.ServerCreate;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaServerCreateWithHintsWrapper;

import com.google.common.base.Function;

/**
 * Wraps a ServerCreate entity to another type if applicable.  For example if a server container scheduler hints
 * this function is responsible for wrapping it in a higher level class to support booting.  
 * 
 * @author Jeremy Unruh
 */
public class WrapServerIfApplicableFunction implements Function<ServerCreate, ModelEntity>{

    public static final WrapServerIfApplicableFunction INSTANCE = new WrapServerIfApplicableFunction();
    
    /**
     * Wraps the ServerCreate if applicable or returns {@code server} if the operation is a no-op
     */
    @Override
    public ModelEntity apply(ServerCreate server) {
        if (server.getSchedulerHints() != null)
            return NovaServerCreateWithHintsWrapper.wrap(server);
        
        return server;
    }

}
