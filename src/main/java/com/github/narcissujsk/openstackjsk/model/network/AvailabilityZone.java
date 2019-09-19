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

import java.util.List;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

/**
 * An availability zone groups network nodes that run services like DHCP, L3, FW, and others. 
 * 
 * @author Taemin
 */
public interface AvailabilityZone extends ModelEntity {

	/**
	 * @return State
	 */
	String getState();

	/**
	 * @return Resource
	 */
	String getResource();
		
	/**
	 * @return The Zone Name of Neutron
	 */
	String getName();

	

}
