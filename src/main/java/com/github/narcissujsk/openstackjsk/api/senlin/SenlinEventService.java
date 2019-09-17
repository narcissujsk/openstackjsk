package com.github.narcissujsk.openstackjsk.api.senlin;

import com.github.narcissujsk.openstackjsk.model.senlin.Event;

import java.util.List;

/**
 * This interface defines all methods for the manipulation of Event
 * 
 * @author lion
 * 
 */
public interface SenlinEventService {
	
	/**
	 * Gets a list of currently existing {@link Event}s.
	 * 
	 * @return the list of {@link Event}s
	 */
	List<? extends Event> list();

	/**
	 * returns details of a {@link Event}.
	 *
	 * @param eventID
	 *            Id of {@link Event}
	 * @return Event
	 */
	Event get(String eventID);
}
