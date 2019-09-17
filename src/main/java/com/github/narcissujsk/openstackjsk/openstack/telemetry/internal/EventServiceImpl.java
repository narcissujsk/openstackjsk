package com.github.narcissujsk.openstackjsk.openstack.telemetry.internal;

import com.github.narcissujsk.openstackjsk.api.telemetry.EventService;
import com.github.narcissujsk.openstackjsk.model.telemetry.Event;
import com.github.narcissujsk.openstackjsk.model.telemetry.EventCriteria;
import com.github.narcissujsk.openstackjsk.model.telemetry.Trait;
import com.github.narcissujsk.openstackjsk.model.telemetry.TraitDescription;
import com.github.narcissujsk.openstackjsk.openstack.telemetry.domain.CeilometerEvent;
import com.github.narcissujsk.openstackjsk.openstack.telemetry.domain.CeilometerTrait;
import com.github.narcissujsk.openstackjsk.openstack.telemetry.domain.CeilometerTraitDescription;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * OpenStack (Ceilometer) Event based Operations
 *
 * @author Miroslav Lacina
 */
public class EventServiceImpl extends BaseTelemetryServices implements EventService {

    private static final String FIELD = "q.field";
    private static final String OPER = "q.op";
    private static final String VALUE = "q.value";
    private static final String LIMIT = "limit";

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Event> list(EventCriteria eventCriteria) {
        Invocation<CeilometerEvent[]> invocation = get(CeilometerEvent[].class, uri("/events"));
        if (eventCriteria != null && !eventCriteria.getCriteriaParams().isEmpty()) {
            for (EventCriteria.NameOpValue c : eventCriteria.getCriteriaParams()) {
                invocation.param(FIELD, c.getField());
                invocation.param(OPER, c.getOperator().getQueryValue());
                invocation.param(VALUE, c.getValue());
            }
        }

        CeilometerEvent[] events = invocation.execute();
        return wrapList(events);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Event> list(EventCriteria eventCriteria, int limit) {
        Invocation<CeilometerEvent[]> invocation = get(CeilometerEvent[].class, uri("/events"));
        if (eventCriteria != null && !eventCriteria.getCriteriaParams().isEmpty()) {
            for (EventCriteria.NameOpValue c : eventCriteria.getCriteriaParams()) {
                invocation.param(FIELD, c.getField());
                invocation.param(OPER, c.getOperator().getQueryValue());
                invocation.param(VALUE, c.getValue());
            }
        }
        invocation.param(LIMIT, limit);

        CeilometerEvent[] events = invocation.execute();
        return wrapList(events);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Event get(String messageId) {
        checkNotNull(messageId);
        return get(CeilometerEvent.class, uri("/events/%s", messageId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<String> listEventTypes() {
        String[] eventTypes = get(String[].class, uri("/event_types")).execute();
        return wrapList(eventTypes);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends TraitDescription> listTraitDescriptions(String eventType) {
        checkNotNull(eventType);
        CeilometerTraitDescription[] traitDescriptions = get(CeilometerTraitDescription[].class, uri("/event_types/%s/traits", eventType)).execute();
        return wrapList(traitDescriptions);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Trait> listTraits(String eventType, String traitName) {
        checkNotNull(eventType);
        checkNotNull(traitName);
        CeilometerTrait[] traits = get(CeilometerTrait[].class, uri("/event_types/%s/traits/%s", eventType, traitName)).execute();
        return wrapList(traits);
    }

}
