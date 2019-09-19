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
package com.github.narcissujsk.openstackjsk.openstack.sahara.internal;

import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.openstack.internal.BaseOpenStackService;

/**
 * This class is extended by every Sahara Service. It is necessary to determine
 * the correct endpoint (url) for sahara calls.
 * 
 * @author Ekasit Kijipongse
 * 
 */
public class BaseSaharaServices extends BaseOpenStackService {

	protected BaseSaharaServices() {
		super(ServiceType.SAHARA);
	}

}
