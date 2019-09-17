package com.github.narcissujsk.openstackjsk.model.compute.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.compute.FloatingIP;

/**
 * Builder for a FloatingIP model class
 * 
 * @author Nathan Anderson
 */
public interface FloatingIPBuilder extends Builder<FloatingIPBuilder, FloatingIP> {

	/**
	 * @see FloatingIP#getId()
	 */
	FloatingIPBuilder id(String id);
	
	/**
	 * @see FloatingIP#getFixedIpAddress()
	 */
	FloatingIPBuilder fixedIpAddress(String fixedIp);
	
	/**
   * @see FloatingIP#getFloatingIpAddress()
   */
  FloatingIPBuilder floatingIpAddress(String floatingIpAddress);

  /**
   * @see FloatingIP#getInstanceId()
   */
  FloatingIPBuilder instanceId(String instanceId);
	
  /**
   * @see FloatingIP#getPool()
   */
  FloatingIPBuilder pool(String pool);
	
}
