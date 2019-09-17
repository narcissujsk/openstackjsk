package com.github.narcissujsk.openstackjsk.model.octavia;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.octavia.builder.HealthMonitorV2UpdateBuilder;

/**
 * An entity used to update a healthMonitorV2
 *
 * @author wei
 */
public interface HealthMonitorV2Update extends ModelEntity, Buildable<HealthMonitorV2UpdateBuilder> {
    /**
     * Optional.
     *
     * @return delay The time, in seconds, between sending probes to members
     */
    Integer getDelay();

    /**
     * Optional.
     *
     * @return urlPath The HTTP path of the request sent by the monitor to test
     *         the health of a member. Must be a string beginning with a forward
     *         slash (/).
     */
    String getUrlPath();

    /**
     * @return timeout The maximum number of seconds for a monitor to wait for a
     *         connection to be established before it times out. This value must
     *         be less than the delay value.
     */
    Integer getTimeout();

    /**
     *
     * @return maxRetries Number of allowed connection failures before changing
     *         the status of the member to INACTIVE. A valid value is from 1 to
     *         10.
     */
    Integer getMaxRetries();

    /**
     *
     * @return maxRetriesDown Number of allowed connection failures before changing
     *         the status of the member to INACTIVE. A valid value is from 1 to
     *         10.
     */
    Integer getMaxRetriesDown();

    /**
     * Optional.
     *
     * @return httpMethod The HTTP method that the monitor uses for requests.
     */
    String getHttpMethod();

    /**
     * Optional.
     *
     * @return expectedCodes Expected HTTP codes for a passing HTTP(S) monitor.
     */
    String getExpectedCodes();

    /**
     * Optional.
     *
     * @return adminstateup The administrative state of the health monitor,
     *         which is up (true) or down (false).
     */
    boolean isAdminStateUp();
}
