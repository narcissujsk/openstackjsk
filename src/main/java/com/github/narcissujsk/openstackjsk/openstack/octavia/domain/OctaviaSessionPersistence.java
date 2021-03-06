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
package com.github.narcissujsk.openstackjsk.openstack.octavia.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;
import com.github.narcissujsk.openstackjsk.model.octavia.SessionPersistence;
import com.github.narcissujsk.openstackjsk.model.octavia.SessionPersistenceType;
import com.github.narcissujsk.openstackjsk.model.octavia.builder.SessionPersistenceBuilder;
@JsonRootName("session_persistence")
@JsonIgnoreProperties(ignoreUnknown = true)
public class OctaviaSessionPersistence implements SessionPersistence {

	private static final long serialVersionUID = 1L;
	@JsonProperty("cookie_name")
	private String cookieName;
	private SessionPersistenceType type;
	/**
	 * wrap the SessionPersistence to builder
	 * @return SessionPersistenceBuilder
	 */
	@Override
	public SessionPersistenceBuilder toBuilder() {
		return new SessionPersistenceContreteBuilder();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getCookieName() {
		return cookieName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SessionPersistenceType getType() {
		return type;
	}
	/**
	 * SessionPersistence Builder
	 * @author wei
	 *
	 */
	public static class SessionPersistenceContreteBuilder implements SessionPersistenceBuilder{

		private OctaviaSessionPersistence m;

		public SessionPersistenceContreteBuilder() {
			this(new OctaviaSessionPersistence());
		}

		public SessionPersistenceContreteBuilder(OctaviaSessionPersistence m) {
			this.m = m;
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		public SessionPersistenceBuilder from(SessionPersistence in) {
			m = (OctaviaSessionPersistence)in;
			return this;
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		public SessionPersistenceBuilder type(SessionPersistenceType type) {
			m.type = type;
			return this;
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		public SessionPersistenceBuilder cookieName(String cookieName) {
			m.cookieName = cookieName;
			return this;
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		public SessionPersistence build() {
			return m;
		}

	}

	public static SessionPersistenceBuilder builder(){
		return new SessionPersistenceContreteBuilder();
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).omitNullValues()
			    .add("type",type)
			    .add("cookieName", cookieName)
			    .toString();
	}


}
