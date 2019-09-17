package com.github.narcissujsk.openstackjsk.openstack.senlin.internal;

import com.github.narcissujsk.openstackjsk.api.senlin.SenlinEventService;
import com.github.narcissujsk.openstackjsk.model.senlin.Event;
import com.github.narcissujsk.openstackjsk.openstack.senlin.domain.SenlinEvent;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * This class contains getters for all implementation of the available event services
 * 
 * @author lion
 */
public class SenlinEventServiceImpl extends BaseSenlinServices implements SenlinEventService {

	@Override
	public List<? extends Event> list() {
		return get(SenlinEvent.Event.class, uri("/events")).execute().getList();
	}

	@Override
	public Event get(String eventID) {
		checkNotNull(eventID);
		return get(SenlinEvent.class, uri("/events/%s", eventID)).execute();
	}
}
