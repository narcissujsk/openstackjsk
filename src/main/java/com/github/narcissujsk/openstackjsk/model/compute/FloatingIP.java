package com.github.narcissujsk.openstackjsk.model.compute;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.compute.builder.FloatingIPBuilder;

/**
 * The Interface FloatingIP.
 * 
 *
 * @author nanderson
 */
public interface FloatingIP extends ModelEntity, Buildable<FloatingIPBuilder> {

  /**
   * Gets the id.
   *
   * @return the id
   */
  String getId();

  /**
   * Gets the instance id.
   *
   * @return the instance id
   */
  String getInstanceId();

  /**
   * Gets the floating ip address.
   *
   * @return the floating ip address
   */
  String getFloatingIpAddress();

  /**
   * Gets the fixed ip address.
   *
   * @return the fixed ip address
   */
  String getFixedIpAddress();
  
  /**
   * Gets the pool.
   *
   * @return the pool name
   */
  String getPool();
}