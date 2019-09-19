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
package com.github.narcissujsk.openstackjsk.model.tacker;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.tacker.builder.VnfBuilder;
import com.github.narcissujsk.openstackjsk.openstack.tacker.domain.TackerVnfStatus;
import com.github.narcissujsk.openstackjsk.openstack.tacker.domain.VnfAttributes;
import com.github.narcissujsk.openstackjsk.openstack.tacker.domain.VnfPlacementAttribute;

/**
 *
 * @author Vishvesh Deshmukh
 * @date Aug 11, 2016
 */
public interface Vnf extends ModelEntity, Buildable<VnfBuilder> {
	/**
	 * 
	 * @return id : Unique identifier for the Vnf.
	 */
	String getId();
	
	/**
	 * 
	 * @return name : Human readable name for the Vnf (255 characters limit). Does not have to be unique.
	 */
	String getName();

	/**
	 * 
	 * @return tenantId : Owner of the Vnf. Only an administrative user can specify a tenant ID other than its own.
	 */
	String getTenantId();

	/**
	 * 
	 * @return description : Human readable description for the Vnf (1024 characters limit).
	 */
	String getDescription();
	
	/**
	 * 
	 * @return attributes
	 */
	VnfAttributes getAttributes();
	
	/**
	 * 
	 * @return managementUrl
	 */
	String getManagementUrl();

	/**
	 * 
	 * @return the vnfdId
	 */
	String getVnfdId();

	/**
	 * 
	 * @return the errorReason
	 */
	String getErrorReason();

	/**
	 * 
	 * @return the vimId
	 */
	String getVimId();

	/**
	 * 
	 * @return the instanceId
	 */
	String getInstanceId();
	
	/**
	 * 
	 * @return the status
	 */
	TackerVnfStatus getStatus();

	/**
	 * 
	 * @return the placementAttribute
	 */
	VnfPlacementAttribute getPlacementAttribute();

}
