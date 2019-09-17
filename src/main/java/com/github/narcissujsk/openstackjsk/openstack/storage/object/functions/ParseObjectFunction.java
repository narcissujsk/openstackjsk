package com.github.narcissujsk.openstackjsk.openstack.storage.object.functions;

import static com.github.narcissujsk.openstackjsk.model.storage.object.SwiftHeaders.CONTENT_LENGTH;
import static com.github.narcissujsk.openstackjsk.model.storage.object.SwiftHeaders.CONTENT_TYPE;
import static com.github.narcissujsk.openstackjsk.model.storage.object.SwiftHeaders.ETAG;
import static com.github.narcissujsk.openstackjsk.model.storage.object.SwiftHeaders.LAST_MODIFIED;
import static com.github.narcissujsk.openstackjsk.openstack.internal.Parser.asLong;

import com.github.narcissujsk.openstackjsk.core.transport.HttpResponse;
import com.github.narcissujsk.openstackjsk.model.storage.object.SwiftObject;
import com.github.narcissujsk.openstackjsk.model.storage.object.options.ObjectLocation;
import com.github.narcissujsk.openstackjsk.openstack.internal.Parser;
import com.github.narcissujsk.openstackjsk.openstack.storage.object.domain.SwiftObjectImpl;

import com.google.common.base.Function;

/**
 * Transforms an HttpResponse into a SwiftObject
 * 
 * @author Jeremy Unruh
 */
public class ParseObjectFunction implements Function<HttpResponse, SwiftObject> {

    private ObjectLocation location;
    
    private ParseObjectFunction(ObjectLocation location) {
        this.location = location;
    }
    
    public static ParseObjectFunction create(ObjectLocation location) {
        return new ParseObjectFunction(location);
    }
    
    
    @Override
    public SwiftObject apply(HttpResponse resp) {
        return SwiftObjectImpl.builder()
                  .name(location.getObjectName())
                  .containerName(location.getContainerName())
                  .mimeType(resp.header(CONTENT_TYPE))
                  .sizeBytes(asLong(resp.header(CONTENT_LENGTH)))
                  .eTag(resp.header(ETAG))
                  .metadata(MapWithoutMetaPrefixFunction.INSTANCE.apply(resp.headers()))
                  .lastModified(Parser.toRFC822DateParse(resp.header(LAST_MODIFIED)))
                  .build();
    }
    

}
