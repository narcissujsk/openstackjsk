package com.github.narcissujsk.openstackjsk.model.network.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.network.NetFloatingIP;

/**
 * Builder for a FloatingIP model class.
 *
 * @author Nathan Anderson
 */
public interface NetFloatingIPBuilder extends Builder<NetFloatingIPBuilder, NetFloatingIP> {
	
	/**
	 * sets Id of floating network
	 *
	 * @param networkId the network id
	 * @return the floating ip builder
	 */
	NetFloatingIPBuilder floatingNetworkId(String networkId);
  
  /**
   * Port id.
   *
   * @param portId the port id
   * @return the floating ip builder
   */
  NetFloatingIPBuilder portId(String portId);
	
}
