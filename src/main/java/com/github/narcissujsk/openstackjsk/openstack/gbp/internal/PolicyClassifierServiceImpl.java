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

import com.github.narcissujsk.openstackjsk.api.gbp.PolicyClassifierService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.gbp.PolicyClassifier;
import com.github.narcissujsk.openstackjsk.model.gbp.PolicyClassifierUpdate;
import com.github.narcissujsk.openstackjsk.openstack.gbp.domain.GbpPolicyClassifier;
import com.github.narcissujsk.openstackjsk.openstack.gbp.domain.GbpPolicyClassifier.PolicyClassifiers;
import com.github.narcissujsk.openstackjsk.openstack.networking.internal.BaseNetworkingServices;
/**
 * Policy Classifier API Implementation
 * 
 * @author vinod borole
 */
public class PolicyClassifierServiceImpl extends BaseNetworkingServices implements PolicyClassifierService {

    /**
     * {@inheritDoc}
     */
    @Override 
    public List<? extends PolicyClassifier> list() {
        return get(PolicyClassifiers.class, uri("/grouppolicy/policy_classifiers")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends PolicyClassifier> list(Map<String, String> filteringParams) {
        Invocation<PolicyClassifiers> policyclassifierInvocation = buildInvocation(filteringParams);
        return policyclassifierInvocation.execute().getList();
    }
    
    private Invocation<PolicyClassifiers> buildInvocation(Map<String, String> filteringParams) {
        Invocation<PolicyClassifiers> policyclassifierInvocation = get(PolicyClassifiers.class, "/grouppolicy/policy_classifiers");
        if (filteringParams == null) { 
            return policyclassifierInvocation;
        } 
        if (filteringParams != null) {
            for (Map.Entry<String, String> entry : filteringParams.entrySet()) {
                policyclassifierInvocation = policyclassifierInvocation.param(entry.getKey(), entry.getValue());
            }
        }
        return policyclassifierInvocation;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PolicyClassifier get(String id) {
        checkNotNull(id);
        return get(GbpPolicyClassifier.class, uri("/grouppolicy/policy_classifiers/%s", id)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String id) {
        checkNotNull(id);
        return deleteWithResponse(uri("/grouppolicy/policy_classifiers/%s", id)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PolicyClassifier create(PolicyClassifier policyClassifier) {
        return post(GbpPolicyClassifier.class, uri("/grouppolicy/policy_classifiers")).entity(policyClassifier).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PolicyClassifier update(String policyClassifierId, PolicyClassifierUpdate policyClassifier) {
        checkNotNull(policyClassifierId);
        checkNotNull(policyClassifier);
        return put(GbpPolicyClassifier.class, uri("/grouppolicy/policy_classifiers/%s", policyClassifierId)).entity(policyClassifier).execute();
    }

}
