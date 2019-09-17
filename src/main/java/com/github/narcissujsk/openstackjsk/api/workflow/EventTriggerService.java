package com.github.narcissujsk.openstackjsk.api.workflow;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.core.transport.HttpResponse;
import com.github.narcissujsk.openstackjsk.model.workflow.EventTrigger;

import java.util.List;

/**
 * Service that provides CRUD operations for event triggers.
 *
 * @author Renat Akhmerov
 */
public interface EventTriggerService extends RestService {
    /**
     * List all event triggers with details.
     *
     * @return List of event triggers.
     */
    List<? extends EventTrigger> list();

    /**
     * Create a new event trigger.
     *
     * @param eventTrigger Event trigger to create.
     * @return Created event trigger.
     */
    EventTrigger create(EventTrigger eventTrigger);

    /**
     * Get event trigger by its ID.
     *
     * @param id Event trigger ID.
     * @return Event trigger.
     */
    EventTrigger get(String id);

    /**
     * Delete event trigger by its ID.
     *
     * @param id Event trigger ID.
     * @return HTTP response from the server.
     */
    HttpResponse delete(String id);

}
