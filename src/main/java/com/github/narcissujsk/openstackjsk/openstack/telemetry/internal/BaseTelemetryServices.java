package com.github.narcissujsk.openstackjsk.openstack.telemetry.internal;

import java.util.Collections;
import java.util.List;

import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.openstack.internal.BaseOpenStackService;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

/**
 * Base class for Telemetry services
 * 
 * @author Jeremy Unruh
 */
public class BaseTelemetryServices extends BaseOpenStackService {

	protected BaseTelemetryServices() {
		super(ServiceType.TELEMETRY, EndpointFunction.instance);
	}
	
	/**
	 * Sometimes the endpoint does not contain the API version which is required.  This insures that
	 */
	private static class EndpointFunction implements Function<String, String> {

		static final EndpointFunction instance = new EndpointFunction();
		
		@Override
		public String apply(String input) {
			if (input == null || input.contains("/v"))
				return input;
			return input.concat(input.endsWith("/") ? "v2" : "/v2");
		}
	}
	
	protected <T> List<T> wrapList(T[] type) {
		if (type != null)
			return Lists.newArrayList(type);
		return Collections.emptyList();
			
	}
}
