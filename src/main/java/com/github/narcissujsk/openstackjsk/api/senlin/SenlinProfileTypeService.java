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
package com.github.narcissujsk.openstackjsk.api.senlin;

import com.github.narcissujsk.openstackjsk.model.senlin.ProfileType;

import java.util.List;

/**
 * This interface defines all methods for the manipulation of ProfileType
 * 
 * @author lion
 * 
 */
public interface SenlinProfileTypeService {

	/**
	 * Gets a list of currently existing {@link ProfileType}s.
	 *
	 * @return the list of {@link ProfileType}s
	 */
	List<? extends ProfileType> list();

	/**
	 * returns details of a {@link ProfileType}.
	 *
	 * @param profileTypeName
	 *            Name of {@link ProfileType}
	 * @return ProfileType
	 */
	ProfileType get(String profileTypeName);
}
