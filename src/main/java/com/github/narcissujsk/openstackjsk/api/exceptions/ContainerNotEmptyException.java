package com.github.narcissujsk.openstackjsk.api.exceptions;

import com.github.narcissujsk.openstackjsk.api.exceptions.ResponseException;

/**
 * An exception that is thrown when an Object Storage Container is attempted to be deleted that is not empty
 * 
 * @author Jeremy Unruh
 */
public class ContainerNotEmptyException extends ResponseException {

    private static final long serialVersionUID = 1L;

    public ContainerNotEmptyException(String message, int status, Throwable cause) {
        super(message, status, cause);
    }

    public ContainerNotEmptyException(String message, int status) {
        super(message, status);
    }
}
