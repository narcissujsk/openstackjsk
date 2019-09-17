package com.github.narcissujsk.openstackjsk.model.common.resolvers;

import java.util.SortedSet;

import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.model.common.resolvers.ServiceVersionResolver;
import com.github.narcissujsk.openstackjsk.model.identity.v3.Service;
import com.github.narcissujsk.openstackjsk.model.identity.v2.Access;

/**
 * Resolves the service version to the latest version found within the Service Catalog
 *
 * @author Jeremy Unruh
 */
public final class LatestServiceVersionResolver implements ServiceVersionResolver {

    public static final LatestServiceVersionResolver INSTANCE = new LatestServiceVersionResolver();

    private LatestServiceVersionResolver() {

    }

    @Override
    public Service resolveV3(ServiceType type, SortedSet<? extends Service> services) {
        return services.last();
    }

    @Override
    public Access.Service resolveV2(ServiceType type, SortedSet<? extends Access.Service> services) {
        return services.last();
    }

}
