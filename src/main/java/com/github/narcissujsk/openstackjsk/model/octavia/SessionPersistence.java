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
package com.github.narcissujsk.openstackjsk.model.octavia;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.octavia.SessionPersistenceType;
import com.github.narcissujsk.openstackjsk.model.octavia.builder.SessionPersistenceBuilder;
import com.github.narcissujsk.openstackjsk.openstack.octavia.domain.OctaviaSessionPersistence;

/**
 * Session persistence parameters for the VIP. Omit the session_persistence
 * parameter to prevent session persistence. When no session persistence is
 * used, the session_persistence parameter does not appear in the API response.
 * To clear session persistence for the VIP, set the session_persistence
 * parameter to null in a VIP update request.
 * 
 * @author wei
 *
 */
@JsonDeserialize(as = OctaviaSessionPersistence.class)
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
