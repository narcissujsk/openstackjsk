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

import com.github.narcissujsk.openstackjsk.api.gbp.NetworkPolicyService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.gbp.NetworkServicePolicy;
import com.github.narcissujsk.openstackjsk.openstack.gbp.domain.GbpNetworkServicePolicy;
import com.github.narcissujsk.openstackjsk.openstack.gbp.domain.GbpNetworkServicePolicy.NetworkServicePolicies;
import com.github.narcissujsk.openstackjsk.openstack.networking.internal.BaseNetworkingServices;

import java.util.List;
import java.util.Map;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Network service policy API Implementation
 * 
 * @author sumit gandhi
 */
public class NetworkPolicyServiceImpl extends BaseNetworkingServices implements NetworkPolicyService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends NetworkServicePolicy> list() {
        return get(NetworkServicePolicies.class, uri("/grouppolicy/network_service_policies")).
                execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends NetworkServicePolicy> list(Map<String, String> filteringParams) {
        Invocation<NetworkServicePolicies> natpoolInvocation = buildInvocation(filteringParams);
        return natpoolInvocation.execute().getList();
    }

    private Invocation<NetworkServicePolicies> buildInvocation(Map<String, String> filteringParams) {
        Invocation<NetworkServicePolicies> servicePoliciesInvocation = get(NetworkServicePolicies.class, "/grouppolicy/network_service_policies");
        if (filteringParams == null) {
            return servicePoliciesInvocation;
        }
        if (filteringParams != null) {
            for (Map.Entry<String, String> entry : filteringParams.entrySet()) {
                servicePoliciesInvocation = servicePoliciesInvocation.param(entry.getKey(), entry.getValue());
            }
        }
        return servicePoliciesInvocation;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkServicePolicy get(String id) {
        checkNotNull(id);
        return get(GbpNetworkServicePolicy.class, uri("/grouppolicy/network_service_policies/%s", id)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GbpNetworkServicePolicy create(NetworkServicePolicy gbpServicePolicy) {
        return post(GbpNetworkServicePolicy.class, uri("/grouppolicy/network_service_policies")).entity(gbpServicePolicy).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String id) {
        checkNotNull(id);
        return deleteWithResponse(uri("/grouppolicy/network_service_policies/%s", id)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkServicePolicy update(String gbpServicePolicyId , NetworkServicePolicy gbpServicePolicy) {
        checkNotNull(gbpServicePolicy);
        checkNotNull(gbpServicePolicyId);
        return put(GbpNetworkServicePolicy.class, uri("/grouppolicy/network_service_policies/%s", gbpServicePolicyId)).
                entity(gbpServicePolicy).execute();
    }

}
