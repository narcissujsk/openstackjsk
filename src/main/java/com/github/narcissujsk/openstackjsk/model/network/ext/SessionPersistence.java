package com.github.narcissujsk.openstackjsk.model.network.ext;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.network.ext.SessionPersistenceType;
import com.github.narcissujsk.openstackjsk.model.network.ext.builder.SessionPersistenceBuilder;

/**
 * Session persistence parameters for the VIP. Omit the session_persistence
 * parameter to prevent session persistence. When no session persistence is
 * used, the session_persistence parameter does not appear in the API response.
 * To clear session persistence for the VIP, set the session_persistence
 * parameter to null in a VIP update request.
 * 
 * @author liujunpeng
 *
 */
public interface SessionPersistence extends ModelEntity,Buildable<SessionPersistenceBuilder>{

	/**
	 * optional
	 * @return cookie name
	 */
	public String getCookieName();
	/**
	 * required
	 * @return type. APP_COOKIE,HTTP_COOKIE,SOURCE_IP
	 */
	public SessionPersistenceType getType();

}
