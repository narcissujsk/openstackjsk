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
package com.github.narcissujsk.openstackjsk.openstack.gbp.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.api.gbp.L2policyService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.gbp.L2Policy;
import com.github.narcissujsk.openstackjsk.openstack.gbp.domain.GbpL2Policy;
import com.github.narcissujsk.openstackjsk.openstack.gbp.domain.GbpL2Policy.L2Policies;
import com.github.narcissujsk.openstackjsk.openstack.networking.internal.BaseNetworkingServices;
/**
 * L2 Policy API Implementation
 * 
 * @author vinod borole
 */
public class L2policyServiceImpl extends BaseNetworkingServices implements L2policyService {

    /**
     * {@inheritDoc}
     */
    @Override 
    public List<? extends L2Policy> list() {
        return get(L2Policies.class, uri("/grouppolicy/l2_policies")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends L2Policy> list(Map<String, String> filteringParams) {
        Invocation<L2Policies> l2PoliciesInvocation = buildInvocation(filteringParams);
        return l2PoliciesInvocation.execute().getList();
    }
    private Invocation<L2Policies> buildInvocation(Map<String, String> filteringParams) {
        Invocation<L2Policies> l2PoliciesInvocation = get(L2Policies.class, "/grouppolicy/l2_policies");
        if (filteringParams == null) { 
            return l2PoliciesInvocation;
        } 
        if (filteringParams != null) {
            for (Map.Entry<String, String> entry : filteringParams.entrySet()) {
                l2PoliciesInvocation = l2PoliciesInvocation.param(entry.getKey(), entry.getValue());
            }
        }
        return l2PoliciesInvocation;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public L2Policy get(String id) {
        checkNotNull(id);
        return get(GbpL2Policy.class, uri("/grouppolicy/l2_policies/%s", id)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String id) {
        checkNotNull(id);
        return deleteWithResponse(uri("/grouppolicy/l2_policies/%s", id)).execute();
    }

    /**
     * {@inheritDoc}
     */
   @Override
    public L2Policy create(L2Policy l2Policy) {
        return post(GbpL2Policy.class, uri("/grouppolicy/l2_policies")).entity(l2Policy).execute();
    }

   /**
    * {@inheritDoc}
    */
   @Override
    public L2Policy update(String l2PolicyId, L2Policy l2Policy) {
        checkNotNull(l2PolicyId);
        checkNotNull(l2Policy);
        return put(GbpL2Policy.class, uri("/grouppolicy/l2_policies/%s", l2PolicyId)).entity(l2Policy).execute();
    }


}
