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
package com.github.narcissujsk.openstackjsk.model.network.ext;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.network.ext.SessionPersistence;
import com.github.narcissujsk.openstackjsk.model.network.ext.Vip;
import com.github.narcissujsk.openstackjsk.model.network.ext.builder.VipUpdateBuilder;

/**
 * An entity used to update a vip
 * 
 * @author liujunpeng
 */
public interface VipUpdate extends ModelEntity, Buildable<VipUpdateBuilder> {
	/**
	 * Optional
	 * 
	 * @see com.github.narcissujsk.openstackjsk.model.network.ext.Vip#isAdminStateUp()
	 */
	public boolean isAdminStateUp();

	/**
	 * Optional
	 * 
	 * @see com.github.narcissujsk.openstackjsk.model.network.ext.Vip#getConnectionLimit()
	 */
	public Integer getConnectionLimit();

	/**
	 * Optional
	 * 
	 * @see com.github.narcissujsk.openstackjsk.model.network.ext.Vip#getDescription()
	 */
	public String getDescription();

	/**
	 * Optional
	 * 
	 * @see com.github.narcissujsk.openstackjsk.model.network.ext.Vip#getName()
	 */
	public String getName();

	/**
	 * Optional
	 * 
	 * @see com.github.narcissujsk.openstackjsk.model.network.ext.Vip#getPoolId()
	 */
	public String getPoolId();

	/**
	 * Optional
	 * 
	 * @see Vip#getSessionPersistence()
	 */
	public SessionPersistence getSessionPersistence();

}
