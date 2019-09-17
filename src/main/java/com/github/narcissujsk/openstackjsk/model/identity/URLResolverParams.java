package com.github.narcissujsk.openstackjsk.model.identity;

import com.github.narcissujsk.openstackjsk.api.types.Facing;
import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.model.common.resolvers.LatestServiceVersionResolver;
import com.github.narcissujsk.openstackjsk.model.common.resolvers.ServiceVersionResolver;
import com.github.narcissujsk.openstackjsk.model.common.resolvers.StableServiceVersionResolver;
import com.github.narcissujsk.openstackjsk.model.identity.v2.Access;
import com.github.narcissujsk.openstackjsk.model.identity.v3.Token;

/**
 * Dynamic parameters used for URL resolution with Endpoints
 *
 * @author Jeremy Unruh
 */
public class URLResolverParams {

    public Token token;
    public ServiceType type;
    public String region;
    public Facing perspective;
    private ServiceVersionResolver resolver;
    public Access access;

    private URLResolverParams(Token token, ServiceType type) {
        this.token = token;
        this.type = (type == null) ? ServiceType.IDENTITY : type;
    }

    public static URLResolverParams create(Token token, ServiceType type) {
        return new URLResolverParams(token, type);
    }

    public static URLResolverParams create(Access access, ServiceType type) {
        return new URLResolverParams(access, type);
    }

    private URLResolverParams(Access access, ServiceType type) {
        this.access = access;
        this.type = (type == null) ? ServiceType.IDENTITY : type;
    }

    public URLResolverParams region(String region) {
        this.region = region;
        return this;
    }

    public URLResolverParams perspective(Facing perspective) {
        this.perspective = perspective;
        return this;
    }

    public URLResolverParams resolver(ServiceVersionResolver resolver) {
        this.resolver = resolver;
        return this;
    }

    public ServiceVersionResolver getResolver() {
        return (resolver != null) ? resolver : LatestServiceVersionResolver.INSTANCE;
    }

    public ServiceVersionResolver getV2Resolver() {
        return (resolver != null) ? resolver : StableServiceVersionResolver.INSTANCE;
    }

}
