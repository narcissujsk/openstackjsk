package com.github.narcissujsk.openstackjsk.api.exceptions;

import com.google.common.base.MoreObjects;
import com.github.narcissujsk.openstackjsk.api.exceptions.ResponseException;
import com.github.narcissujsk.openstackjsk.api.exceptions.StatusCode;

/**
 * Captures Server based Errors (Return Codes between 500 - 600)
 *
 * @author Jeremy Unruh
 */
public class ServerResponseException extends ResponseException {

	private static final long serialVersionUID = 1L;

	private com.github.narcissujsk.openstackjsk.api.exceptions.StatusCode code;

	public ServerResponseException(String message, int status) {
		super(message, status);
		code = com.github.narcissujsk.openstackjsk.api.exceptions.StatusCode.fromCode(status);
	}

	public ServerResponseException(String message, int status, Throwable cause) {
		super(message, status, cause);
		code = com.github.narcissujsk.openstackjsk.api.exceptions.StatusCode.fromCode(status);
	}

	/**
	 * @return the status code mapping for the current {@link #getStatus()}
	 */
	public StatusCode getStatusCode() {
		return code;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).omitNullValues()
				     .add("message", getMessage()).add("status", getStatus()).add("status-code", code)
				     .toString();
	}

}
