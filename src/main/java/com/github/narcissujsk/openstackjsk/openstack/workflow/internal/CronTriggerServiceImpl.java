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
