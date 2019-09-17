package com.github.narcissujsk.openstackjsk.api.exceptions;

import com.github.narcissujsk.openstackjsk.api.exceptions.OS4JException;

/**
 * Exception which is thrown when an API lookup did not succeed
 * 
 * @author Jeremy Unruh
 */
public class ApiNotFoundException extends OS4JException {

	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new ApiNotFoundException.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public ApiNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new ApiNotFoundException.
	 *
	 * @param message the message
	 */
	public ApiNotFoundException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new ApiNotFoundException.
	 *
	 * @param cause the cause
	 */
	public ApiNotFoundException(Throwable cause) {
		super(cause);
	}

}
