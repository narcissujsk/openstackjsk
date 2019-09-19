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
package com.github.narcissujsk.openstackjsk.openstack.heat.internal;

import com.github.narcissujsk.openstackjsk.api.Builders;
import com.github.narcissujsk.openstackjsk.api.heat.StackService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.heat.AdoptStackData;
import com.github.narcissujsk.openstackjsk.model.heat.Stack;
import com.github.narcissujsk.openstackjsk.model.heat.StackCreate;
import com.github.narcissujsk.openstackjsk.model.heat.StackUpdate;
import com.github.narcissujsk.openstackjsk.openstack.compute.functions.ToActionResponseFunction;
import com.github.narcissujsk.openstackjsk.openstack.heat.domain.HeatAdoptStackData;
import com.github.narcissujsk.openstackjsk.openstack.heat.domain.HeatStack;
import com.github.narcissujsk.openstackjsk.openstack.heat.domain.HeatStackAdopt;
import com.github.narcissujsk.openstackjsk.openstack.heat.domain.HeatStack.Stacks;
import com.github.narcissujsk.openstackjsk.openstack.heat.internal.BaseHeatServices;

import java.util.List;
import java.util.Map;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * This class implements all methods for manipulation of {@link HeatStack} objects. The
 * non-exhaustive list of methods is oriented along
 * http://developer.openstack.org/api-ref-orchestration-v1.html#stacks
 * 
 * @author Matthias Reisser
 * 
 */
public class StackServiceImpl extends BaseHeatServices implements StackService {

    @Override
    public Stack create(StackCreate newStack) {
        checkNotNull(newStack);
        return post(HeatStack.class, uri("/stacks")).entity(newStack).execute();
    }

    @Override
    public Stack create(String name, String template,
            Map<String, String> parameters, boolean disableRollback,
            Long timeoutMins) {
        checkNotNull(name);
        checkNotNull(template);
        checkNotNull(parameters);
        checkNotNull(timeoutMins);

        return create(Builders.stack().name(name).template(template)
                .parameters(parameters).timeoutMins(timeoutMins).build());
    }

    @Override
    public List<? extends Stack> list() {
        return get(Stacks.class, uri("/stacks")).execute().getList();
    }

    @Override
    public List<? extends Stack> list(Map<String, String> filteringParams) {
        Invocation<Stacks> req = get(Stacks.class, uri("/stacks"));
        if (filteringParams != null) {
            for (Map.Entry<String, String> entry : filteringParams.entrySet()) {
                req = req.param(entry.getKey(), entry.getValue());
            }
        }
        return req.execute().getList();
    }

    @Override
    public ActionResponse delete(String stackName, String stackId) {
        checkNotNull(stackId);
        return deleteWithResponse(uri("/stacks/%s/%s", stackName, stackId)).execute();
    }

    @Override
    public Stack getDetails(String stackName, String stackId) {
        checkNotNull(stackName);
        checkNotNull(stackId);
        return get(HeatStack.class, uri("/stacks/%s/%s", stackName, stackId)).execute();
    }

    @Override
    public ActionResponse update(String stackName, String stackId, StackUpdate stackUpdate) {
        checkNotNull(stackName);
        checkNotNull(stackId);
        checkNotNull(stackUpdate);

        return ToActionResponseFunction.INSTANCE
                .apply(put(Void.class, uri("/stacks/%s/%s", stackName, stackId))
                        .entity(stackUpdate)
                        .executeWithResponse());
    }

    @Override
    public Stack getStackByName(String stackName) {
        checkNotNull(stackName);
        return get(HeatStack.class, uri("/stacks/%s", stackName)).execute();
    }
    
    @Override
    public AdoptStackData abandon(String stackName, String stackId) {
        checkNotNull(stackId);
        return delete(HeatAdoptStackData.class, uri("/stacks/%s/%s/abandon", stackName, stackId)).execute();
    }

    @Override
    public Stack adopt(AdoptStackData adoptStackData, Map<String, String> parameters, boolean disableRollback, Long timeoutMins, String template) {
        checkNotNull(adoptStackData);
        checkNotNull(parameters);
        checkNotNull(timeoutMins);
        HeatStackAdopt heatStackAdopt = HeatStackAdopt.builder()
                .adoptStackData(adoptStackData)
                .template(template)
                .disableRollback(disableRollback)
                .name(adoptStackData.getName())
                .parameters(parameters)
                .timeoutMins(timeoutMins)
                .build();
        return post(HeatStack.class, uri("/stacks")).entity(heatStackAdopt).execute();
    }    
}
