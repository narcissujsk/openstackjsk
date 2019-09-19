/*******************************************************************************
 * 	Copyright 2019 ContainX and OpenStack4j
 *
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * 	use this file except in compliance with the License. You may obtain a copy of
 * 	the License at
 *
 * 	    http://www.apache.org/licenses/LICENSE-2.0
 *
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * 	License for the specific language governing permissions and limitations under
 * 	the License.
 *******************************************************************************/
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
