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
 * A Fixed IP Address
 * 
 * @author Jeremy Unruh
 */
public interface IP extends ModelEntity {

  /**
   * @return the fixed ip address
   */
  String getIpAddress();

  /**
   * @return the id of the subnet of this ip
   */
  String getSubnetId();
	
}
