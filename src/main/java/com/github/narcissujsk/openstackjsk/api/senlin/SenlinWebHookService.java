package com.github.narcissujsk.openstackjsk.api.senlin;

import com.github.narcissujsk.openstackjsk.model.senlin.ActionID;

/**
 * This interface defines all methods for the manipulation of WebHook
 * 
 * @author lion
 * 
 */
public interface SenlinWebHookService {

	/**
	 * Service implementation which provides methods for manipulation of action
	 *
	 * @return Action
	 */
	ActionID action(String webHookUrl);
}
