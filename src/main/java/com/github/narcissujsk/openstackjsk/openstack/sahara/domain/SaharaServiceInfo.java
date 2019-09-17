package com.github.narcissujsk.openstackjsk.openstack.sahara.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.narcissujsk.openstackjsk.model.sahara.ServiceInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * For mapping JSON response to java objects
 *
 * @author ekasit.kijsipongse@nectec.or.th
 */

@JsonIgnoreProperties(ignoreUnknown=true)
public class SaharaServiceInfo extends HashMap<String,String> implements ServiceInfo {

	public static final long serialVersionUID = 1L;

        /**
         * {@inheritDoc}
         */
	@Override
	public String get(String name) {
		return super.get(name);
	}

        /**
         * {@inheritDoc}
         */
	@Override
	public Map<String,String> getInfos() {
		return this;
	}

}
