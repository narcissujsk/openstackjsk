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
package com.github.narcissujsk.openstackjsk.model.common.resolvers;

import java.util.SortedSet;

import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.model.common.resolvers.ServiceVersionResolver;
import com.github.narcissujsk.openstackjsk.model.identity.v3.Service;
import com.github.narcissujsk.openstackjsk.model.identity.v2.Access;

/**
 * Resolves each service to the lowest version which we consider most stable and
 * tested
 *
 * @author Jeremy Unruh
 */
public final class StableServiceVersionResolver implements ServiceVersionResolver {

    public static final StableServiceVersionResolver INSTANCE = new StableServiceVersionResolver();

    private StableServiceVersionResolver() {
    }

    @Override
    public Service resolveV3(ServiceType type, SortedSet<? extends Service> services) {
        return services.first();
    }

    @Override
    public Access.Service resolveV2(ServiceType type, SortedSet<? extends Access.Service> services) {
        return services.first();
    }

}
