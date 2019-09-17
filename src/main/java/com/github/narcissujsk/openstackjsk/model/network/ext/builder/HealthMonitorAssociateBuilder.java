package com.github.narcissujsk.openstackjsk.model.network.ext.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.network.ext.HealthMonitorAssociate;
/**
 * A builder to assiocate a healthmonitor with a lb pool
 * @author liujunpeng
 *
 */
public interface HealthMonitorAssociateBuilder extends Builder<HealthMonitorAssociateBuilder,HealthMonitorAssociate>{

	/**
	 * @param id the healthMonitor identifier
	 * @return HealthMonitorAssociateBuilder
	 */
	public HealthMonitorAssociateBuilder id(String id);
}
