package com.github.narcissujsk.openstackjsk.model.network.ext.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.network.ext.SessionPersistence;
import com.github.narcissujsk.openstackjsk.model.network.ext.SessionPersistenceType;

/**
 * A builder to create and update a SessionPersistence
 * @author liujunpeng
 *
 */
public interface SessionPersistenceBuilder extends Builder<SessionPersistenceBuilder, SessionPersistence>{

	/**
	 * required
	 * 
	 * @param type
	 *            APP_COOKIE,HTTP_COOKIE,SOURCE_IP
	 * @return SessionPersistenceBuilder
	 */
	public SessionPersistenceBuilder type(SessionPersistenceType type);

	/**
	 * optional
	 * 
	 * @param cookieName
	 * @return SessionPersistenceBuilder
	 */
	public SessionPersistenceBuilder cookieName(String cookieName);
}
