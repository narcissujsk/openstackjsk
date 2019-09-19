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
package com.github.narcissujsk.openstackjsk.model.barbican.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.barbican.Secret;

import java.util.Date;

/**
 * Created by reneschollmeyer on 02.08.17.
 */
public interface SecretCreateBuilder extends Buildable.Builder<SecretCreateBuilder, Secret> {

    /**
     * @param name Human readable name for identifying your secret.
     * @return
     */
    SecretCreateBuilder name(String name);

    /**
     * @param expiration UTC Timestamp. If set, the secret will not be available after this time.
     * @return
     */
    SecretCreateBuilder expiration(Date expiration);

    /**
     * @param algorithm Metadata provided by a user or system for informational purposes.
     * @return
     */
    SecretCreateBuilder algorithm(String algorithm);

    /**
     * @param bitLength Metadata provided by a user or system for informational purposes.
     *                  Value must be greater than zero.
     * @return
     */
    SecretCreateBuilder bitLength(Integer bitLength);

    /**
     * @param mode Metadata provided by a user or system for informational purposes.
     * @return
     */
    SecretCreateBuilder mode(String mode);

    /**
     * @param payload The secret’s data to be stored.
     * @return
     */
    SecretCreateBuilder payload(String payload);

    /**
     * @param payloadContentType The media type for the content of the payload
     *                           (required if payload is included).
     * @return
     */
    SecretCreateBuilder payloadContentType(String payloadContentType);

    /**
     * @param payloadContentEncoding The encoding used for the payload to be able to include
     *                               it in the JSON request (required if payload is encoded).
     * @return
     */
    SecretCreateBuilder payloadContentEncoding(String payloadContentEncoding);

    /**
     * @param secretType Used to indicate the type of secret being stored.
     * @return
     */
    SecretCreateBuilder secretType(String secretType);
}
