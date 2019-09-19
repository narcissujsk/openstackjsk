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
package com.github.narcissujsk.openstackjsk.openstack.workflow.internal;

import com.github.narcissujsk.openstackjsk.api.workflow.CronTriggerService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.workflow.CronTrigger;
import com.github.narcissujsk.openstackjsk.openstack.workflow.domain.MistralCronTrigger;
import com.github.narcissujsk.openstackjsk.openstack.workflow.domain.MistralCronTrigger.MistralCronTriggers;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

        
/**
 * Cron trigger service implementation.
 *
 * @author Renat Akhmerov
 */
public class CronTriggerServiceImpl extends BaseMistralService implements CronTriggerService {

    @Override
    public List<? extends CronTrigger> list() {
        return get(MistralCronTriggers.class, uri("/cron_triggers")).execute().getList();
    }

    @Override
    public CronTrigger create(CronTrigger trigger) {
        checkNotNull(trigger);

        Invocation<MistralCronTrigger> invocation = post(
                MistralCronTrigger.class,
                uri("/cron_triggers")
        );

        return invocation.entity(trigger).execute();
    }

    @Override
    public CronTrigger get(String identifier) {
        return get(MistralCronTrigger.class, uri("/cron_triggers/%s", identifier)).execute();
    }

    @Override
    public ActionResponse delete(String identifier) {
        return deleteWithResponse(uri("/cron_triggers/%s", identifier)).execute();
    }
}
