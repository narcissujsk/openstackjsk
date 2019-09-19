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

import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.senlin.Profile;
import com.github.narcissujsk.openstackjsk.model.senlin.ProfileCreate;

import java.util.List;

/**
 * This interface defines all methods for the manipulation of Profile
 * 
 * @author lion
 * 
 */
public interface SenlinProfileService {

	/**
	 * Gets a list of currently existing {@link Profile}s.
	 *
	 * @return the list of {@link Profile}s
	 */
	List<? extends Profile> list();

	/**
	 * <code>POST /v1/profiles</code><br \>
	 *
	 * Creates a new {@link Profile} out of a {@link ProfileCreate} object
	 *
	 * @param newProfile
	 *            {@link ProfileCreate} object out of which stack is to be created
	 * @return new {@link Profile} as returned from the server
	 */
	Profile create(ProfileCreate newProfile);

	/**
	 * returns details of a {@link Profile}.
	 *
	 * @param profileID
	 *            Id of {@link Profile}
	 * @return Profile
	 */
	Profile get(String profileID);

	/**
	 * <code>PATCH /v1/profiles/​{profile_id}</code><br \>
	 *
	 * Update a {@link Profile} out of a {@link ProfileCreate} object
	 *
	 * @param profileID
	 *             Id of {@link Profile}
	 * @param newProfile
	 *            {@link ProfileCreate} object out of which stack is to be update
	 * @return new {@link Profile} as returned from the server
	 */
	Profile update(String profileID, ProfileCreate newProfile);

	/**
	 * Deletes the specified {@link ActionResponse} from the server.
	 *
	 * @param profileID
	 *            Id of {@link ActionResponse}
	 * @return the action response
	 */
	ActionResponse delete(String profileID);
}
