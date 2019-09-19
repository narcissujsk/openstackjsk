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
package com.github.narcissujsk.openstackjsk.openstack.senlin.internal;

import com.github.narcissujsk.openstackjsk.api.senlin.SenlinProfileService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.senlin.Profile;
import com.github.narcissujsk.openstackjsk.model.senlin.ProfileCreate;
import com.github.narcissujsk.openstackjsk.openstack.senlin.domain.SenlinProfile;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * This class contains getters for all implementation of the available profile services
 * 
 * @author lion
 */
public class SenlinProfileServiceImpl extends BaseSenlinServices implements SenlinProfileService {

	@Override
	public List<? extends Profile> list() {
		return get(SenlinProfile.Profile.class, uri("/profiles")).execute().getList();
	}

	@Override
	public Profile create(ProfileCreate newProfile) {
		checkNotNull(newProfile);
		return post(SenlinProfile.class, uri("/profiles")).entity(newProfile).execute();
	}

	@Override
	public Profile get(String policyID) {
		checkNotNull(policyID);
		return get(SenlinProfile.class, uri("/profiles/%s", policyID)).execute();
	}

	@Override
	public Profile update(String policyID, ProfileCreate newPolicy) {
		checkNotNull(policyID);
		checkNotNull(newPolicy);
		return patch(SenlinProfile.class, uri("/profiles/%s", policyID)).entity(newPolicy).execute();
	}

	@Override
	public ActionResponse delete(String policyID) {
		checkNotNull(policyID);
		return deleteWithResponse(uri("/profiles/%s", policyID)).execute();
	}
}
