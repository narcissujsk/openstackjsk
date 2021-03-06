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
