package com.github.narcissujsk.openstackjsk.api.exceptions;

import com.github.narcissujsk.openstackjsk.api.exceptions.OS4JException;

/**
 * Exception that is thrown when the user hasn't included the desired OpenStack4j connector within their classpath
 *
 * @author Jeremy Unruh
 */
public class ConnectorNotFoundException extends OS4JException {

    private static final long serialVersionUID = 1L;

    public ConnectorNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConnectorNotFoundException(String message) {
        super(message);
    }

}
