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
package com.github.narcissujsk.openstackjsk.model.common;

import java.io.Closeable;
import java.io.InputStream;

/**
 * Payload holds a reference to a Payload Object whether it be a file, inputstream or other and provides an input stream when uploading data to OpenStack.
 *
 * @param <T> the type of payload object
 * @author Jeremy Unruh
 */
public interface Payload<T> extends Closeable {

	/**
	 * Opens and returns the input stream.
	 *
	 * @return the input stream
	 */
	InputStream open();
	
	/**
	 * Closes the stream and releases state.
	 */
	void closeQuietly();
	
	/**
	 * Gets the raw underlying object for the Payload.
	 *
	 * @return the raw object
	 */
	T getRaw();
	
}
