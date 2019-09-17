package com.github.narcissujsk.openstackjsk.model.network;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;


/**
 * Allowed Address Pair for Neutron Port
 * 
 * @author Nathan Anderson
 */
public interface AllowedAddressPair extends ModelEntity {

  /**
   * @return the ip address
   */
  String getIpAddress();

  /**
   * @return the mac address
   */
  String getMacAddress();
	
}
