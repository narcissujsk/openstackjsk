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
package com.github.narcissujsk.openstackjsk.openstack.identity.v3.internal;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.github.narcissujsk.openstackjsk.core.transport.ClientConstants.PATH_POLICIES;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.identity.v3.PolicyService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.identity.v3.Policy;
import com.github.narcissujsk.openstackjsk.openstack.identity.v3.domain.KeystonePolicy;
import com.github.narcissujsk.openstackjsk.openstack.identity.v3.domain.KeystonePolicy.Policies;

public class PolicyServiceImpl extends BaseIdentityServices implements PolicyService {

    @Override
    public Policy create(Policy policy) {
        checkNotNull(policy);
        return post(KeystonePolicy.class, uri(PATH_POLICIES)).entity(policy).execute();
    }

    @Override
    public Policy create(String blob, String type, String projectId, String userId) {
        checkNotNull(blob);
        checkNotNull(type);
        checkNotNull(projectId);
        checkNotNull(userId);
        return create(KeystonePolicy.builder().blob(blob).type(type).projectId(projectId).userId(userId).build());
    }

    @Override
    public Policy get(String policyId) {
        checkNotNull(policyId);
        return get(KeystonePolicy.class, PATH_POLICIES, "/", policyId).execute();
    }

    @Override
    public Policy update(Policy policy) {
        checkNotNull(policy);
        return patch(KeystonePolicy.class, PATH_POLICIES, "/", policy.getId()).entity(policy).execute();
    }

    @Override
    public ActionResponse delete(String policyId) {
        checkNotNull(policyId);
        return deleteWithResponse(PATH_POLICIES, "/", policyId).execute();
    }

    @Override
    public List<? extends Policy> list() {
        return get(Policies.class, uri(PATH_POLICIES)).execute().getList();
    }

}
