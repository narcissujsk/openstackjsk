package com.github.narcissujsk.openstackjsk.api.exceptions;

import com.github.narcissujsk.openstackjsk.api.exceptions.ResponseException;

/**
 * An exception that is thrown when Credentials failed or the default tenant is invalid
 * 
 * @author Jeremy Unruh
 */
public class AuthenticationException extends ResponseException {

	private static final long serialVersionUID = 1L;

	public AuthenticationException(String message, int status, Throwable cause) {
		super(message, status, cause);
	}

	public AuthenticationException(String message, int status) {
		super(message, status);
	}

}
