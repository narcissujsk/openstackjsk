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
