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

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.common.builder.LinkBuilder;

/**
 * Model for a generic link
 * 
 * @author Jeremy Unruh
 */
public interface Link extends ModelEntity, Buildable<LinkBuilder> {

	/**
	 * @return the relative URL or null
	 */
	String getRel();
	
	/**
	 * @return the href URL
	 */
	String getHref();
	
	/**
	 * @return the type of link or null
	 */
	String getType();
	
}
