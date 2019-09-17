package com.github.narcissujsk.openstackjsk.model.network.ext;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.network.ext.builder.HealthMonitorUpdateBuilder;

/**
 * An entity used to update a healthMonitor
 * 
 * @author liujunpeng
 *
 */
public interface HealthMonitorUpdate extends ModelEntity,
		Buildable<HealthMonitorUpdateBuilder> {

	/**
	 * Optional.
	 * 
	 * @return delay The time, in seconds, between sending probes to members
	 */
	public Integer getDelay();

	/**
	 * Optional.
	 * 
	 * @return urlPath The HTTP path of the request sent by the monitor to test
	 *         the health of a member. Must be a string beginning with a forward
	 *         slash (/).
	 */
	public String getUrlPath();
	
	/**
	 * @return timeout The maximum number of seconds for a monitor to wait for a
	 *         connection to be established before it times out. This value must
	 *         be less than the delay value.
	 */
	public Integer getTimeout();
	
	/**
	 * 
	 * @return maxRetries Number of allowed connection failures before changing
	 *         the status of the member to INACTIVE. A valid value is from 1 to
	 *         10.
	 */
	public Integer getMaxRetries();
	
	/**
	 * Optional.
	 * 
	 * @return httpMethod The HTTP method that the monitor uses for requests.
	 */
	public String getHttpMethod();
	
	/**
	 * Optional.
	 * 
	 * @return expectedCodes Expected HTTP codes for a passing HTTP(S) monitor.
	 */
	public String getExpectedCodes();
	
	/**
	 * Optional.
	 * 
	 * @return adminstateup The administrative state of the health monitor,
	 *         which is up (true) or down (false).
	 */
	public boolean isAdminStateUp();
}
