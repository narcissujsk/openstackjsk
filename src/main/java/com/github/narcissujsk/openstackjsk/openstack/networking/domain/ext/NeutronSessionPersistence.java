package com.github.narcissujsk.openstackjsk.openstack.networking.domain.ext;

import com.github.narcissujsk.openstackjsk.model.network.ext.SessionPersistence;
import com.github.narcissujsk.openstackjsk.model.network.ext.SessionPersistenceType;
import com.github.narcissujsk.openstackjsk.model.network.ext.builder.SessionPersistenceBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;
@JsonRootName("session_persistence")
@JsonIgnoreProperties(ignoreUnknown = true)
public class NeutronSessionPersistence implements SessionPersistence {

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
	 * @author liujunpeng
	 *
	 */
	public static class SessionPersistenceContreteBuilder implements SessionPersistenceBuilder{

		private NeutronSessionPersistence m;

		public SessionPersistenceContreteBuilder() {
			this(new NeutronSessionPersistence());
		}

		public SessionPersistenceContreteBuilder(NeutronSessionPersistence m) {
			this.m = m;
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		public SessionPersistenceBuilder from(SessionPersistence in) {
			m = (NeutronSessionPersistence)in;
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
