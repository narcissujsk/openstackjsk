package com.github.narcissujsk.openstackjsk.openstack.storage.object.functions;

import static com.github.narcissujsk.openstackjsk.model.storage.object.SwiftHeaders.ACCOUNT_BYTES_USED;
import static com.github.narcissujsk.openstackjsk.model.storage.object.SwiftHeaders.ACCOUNT_CONTAINER_COUNT;
import static com.github.narcissujsk.openstackjsk.model.storage.object.SwiftHeaders.ACCOUNT_OBJECT_COUNT;
import static com.github.narcissujsk.openstackjsk.model.storage.object.SwiftHeaders.ACCOUNT_TEMPORARY_URL_KEY;
import static com.github.narcissujsk.openstackjsk.openstack.internal.Parser.asLong;

import com.github.narcissujsk.openstackjsk.core.transport.HttpResponse;
import com.github.narcissujsk.openstackjsk.model.storage.object.SwiftAccount;
import com.github.narcissujsk.openstackjsk.openstack.storage.object.domain.SwiftAccountImpl;

import com.google.common.base.Function;

/**
 * Parses an HttpResponse from an Account call into a SwiftAccount object
 * 
 * @author Jeremy Unruh
 */
public class ParseAccountFunction implements Function<HttpResponse, SwiftAccount>{

    public static final ParseAccountFunction INSTANCE = new ParseAccountFunction();
    
    @Override
    public SwiftAccount apply(HttpResponse res) {
        return SwiftAccountImpl.builder()
                   .bytesUsed(asLong(res.header(ACCOUNT_BYTES_USED), 0L))
                   .containerCount((asLong(res.header(ACCOUNT_CONTAINER_COUNT), 0L)))
                   .objectCount((asLong(res.header(ACCOUNT_OBJECT_COUNT), 0L)))
                   .temporaryUrlKey(res.header(ACCOUNT_TEMPORARY_URL_KEY))
                   .metadata(MapWithoutMetaPrefixFunction.INSTANCE.apply(res.headers()))
                   .build();
    }

}
