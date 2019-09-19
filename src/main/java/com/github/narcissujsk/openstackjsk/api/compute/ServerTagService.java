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
package com.github.narcissujsk.openstackjsk.api.compute;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaServerTag;

public interface ServerTagService extends RestService {
	
	NovaServerTag list(String serverId);
	
	NovaServerTag replace(String serverId, NovaServerTag tag);
	
	ActionResponse deleteAll(String serverId);
	
	ActionResponse delete(String serverId, String tag);
	
	ActionResponse check(String serverId, String tag);
	
	ActionResponse addSingle(String serverId, String tag);

}
