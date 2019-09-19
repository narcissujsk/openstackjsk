/*******************************************************************************
 * 	Copyright 2019 ContainX and OpenStack4j
 *
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * 	use this file except in compliance with the License. You may obtain a copy of
 * 	the License at
 *
 * 	    http://www.apache.org/licenses/LICENSE-2.0
 *
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * 	License for the specific language governing permissions and limitations under
 * 	the License.
 *******************************************************************************/
package com.github.narcissujsk.openstackjsk.model.network;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

/**
 * Configurable external gateway modes extension model.  By default, when a gateway is attached to a router using the Neutron L3 extension,
 * Network Address Translation (NAT) is enabled for traffic generated by subnets attached to the router. With this extension, the user will 
 * have the option of choosing whether SNAT should be enabled or not on a router basis.
 * 
 * @author Jeremy Unruh
 * @see http://docs.openstack.org/api/openstack-network/2.0/content/extgwmodes-ext.html
 */
public interface ExternalGateway extends ModelEntity {

	/**
	 * @return the network identifier
	 */
	String getNetworkId();
	
	/**
	 * SNAT can be enabled or disabled at any time on a Neutron router regardless of the current status of floating IPs. 
	 * Floating IPs will continue working even when SNAT is disabled. 
	 * 
	 * NOTE: The default setting is True to ensure backward compatibility for plugins supporting this extension.
	 * 
	 * @return true if SNAT is enabled
	 */
	boolean isEnableSnat();
	
}
