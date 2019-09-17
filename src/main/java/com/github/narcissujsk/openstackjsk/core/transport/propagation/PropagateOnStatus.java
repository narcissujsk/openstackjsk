package com.github.narcissujsk.openstackjsk.core.transport.propagation;

import static com.github.narcissujsk.openstackjsk.core.transport.HttpExceptionHandler.mapException;

import com.github.narcissujsk.openstackjsk.core.transport.HttpResponse;
import com.github.narcissujsk.openstackjsk.core.transport.PropagateResponse;
import com.github.narcissujsk.openstackjsk.core.transport.functions.ResponseToActionResponse;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;

/**
 * Propagates an exception based on the specified Status code
 * 
 * @author Jeremy Unruh
 */
public class PropagateOnStatus implements PropagateResponse {

    private final int statusCode;
    
    private PropagateOnStatus(int statusCode) {
        this.statusCode = statusCode;
    }
    
    public static PropagateOnStatus on(int statusCode) {
        return new PropagateOnStatus(statusCode);
    }
    
    @Override
    public void propagate(HttpResponse response) {
        if (response.getStatus() == statusCode) {
            ActionResponse ar = ResponseToActionResponse.INSTANCE.apply(response);
            throw mapException(ar.getFault(), response.getStatus());
        }
    }

}
