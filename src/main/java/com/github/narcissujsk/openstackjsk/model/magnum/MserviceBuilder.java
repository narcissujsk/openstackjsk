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
package com.github.narcissujsk.openstackjsk.model.magnum;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.magnum.Mservice;

/**
 * Builder which crates Magnum Service
 * 
 * @author Sohan Sangwan
 *
 */
		
public interface MserviceBuilder extends Builder<MserviceBuilder, com.github.narcissujsk.openstackjsk.model.magnum.Mservice> {
	 /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Mservice#getId()
     */
	MserviceBuilder id(String id);
	
	 /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Mservice#getBinary()
     */
	MserviceBuilder binary(String binary);
	
	 /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Mservice#getCreatedAt()
     */
	MserviceBuilder createdAt(String createdAt);
	
	 /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Mservice#getState()
     */
	MserviceBuilder state(String state);
	
	 /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Mservice#getReportCount()
     */
	MserviceBuilder reportCount(int reportCount);
	
	 /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Mservice#getUpdatedAt()
     */
	MserviceBuilder updatedAt(String updatedAt);
	
	 /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Mservice#getHost()
     */
	MserviceBuilder host(String host);
	
	 /**
     * @see Mservice#getDisabledReason()
     */
	MserviceBuilder disabledReason(String disabledReason);
}
