package com.github.narcissujsk.openstackjsk.core.transport;

import com.github.narcissujsk.openstackjsk.api.exceptions.AuthenticationException;
import com.github.narcissujsk.openstackjsk.api.exceptions.ClientResponseException;
import com.github.narcissujsk.openstackjsk.api.exceptions.ResponseException;
import com.github.narcissujsk.openstackjsk.api.exceptions.ServerResponseException;

/**
 * Exception Handles for common Http messages and status codes
 * 
 * @author Jeremy Unruh
 */
public class HttpExceptionHandler {

    /**
     * Maps an Exception based on the underlying status code
     *
     * @param message the message
     * @param status the status
     * @return the response exception
     */
    public static ResponseException mapException(String message, int status) {
        return mapException(message, status, null);
    }

    /**
     * Maps an Exception based on the underlying status code
     *
     * @param message the message
     * @param status the status
     * @param cause the cause
     * @return the response exception
     */
    public static ResponseException mapException(String message, int status, Throwable cause) {
        if (status == 401)
            return new AuthenticationException(message, status, cause);
        if (status >= 400 && status < 499)
            return new ClientResponseException(message, status, cause);
        if (status >= 500 && status < 600)
            return new ServerResponseException(message, status, cause);

        return new ResponseException(message, status, cause);
    }
    
}
