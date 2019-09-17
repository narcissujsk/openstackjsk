package com.github.narcissujsk.openstackjsk.core.transport.functions;

import java.util.Map;

import com.github.narcissujsk.openstackjsk.core.transport.HttpResponse;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.openstack.internal.Parser;

import com.google.common.base.Function;

/**
 * Takes an HttpResponse as input and returns an ActionResponse as an output
 *
 * @author Jeremy Unruh
 */
public class ResponseToActionResponse implements Function<HttpResponse, ActionResponse> {

    public static final ResponseToActionResponse INSTANCE = new ResponseToActionResponse();

    @Override
    public ActionResponse apply(HttpResponse response) {
       return apply(response, false);
    }

    public ActionResponse apply(HttpResponse response, boolean returnNullIfNotMapped) {
        if (Parser.isContentTypeText(response.getContentType())) {
            return ActionResponse.actionFailed(response.getStatusMessage(), response.getStatus());
        }

        @SuppressWarnings("unchecked")
        Map<String, Object> map = response.readEntity(Map.class);
        ActionResponse ar = new ParseActionResponseFromJsonMap(response).apply(map);
        if (ar != null)
            return ar;

        if (ar == null && returnNullIfNotMapped)
            return null;

        return ActionResponse.actionFailed(String.format("Status: %d, Reason: %s", response.getStatus(), response.getStatusMessage()), response.getStatus());
    }
}
