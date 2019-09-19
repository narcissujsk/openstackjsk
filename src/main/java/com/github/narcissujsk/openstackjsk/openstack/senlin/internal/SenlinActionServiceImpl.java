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
package com.github.narcissujsk.openstackjsk.openstack.senlin.internal;

import com.github.narcissujsk.openstackjsk.api.senlin.SenlinActionService;
import com.github.narcissujsk.openstackjsk.model.senlin.Action;
import com.github.narcissujsk.openstackjsk.openstack.senlin.domain.SenlinAction;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * This class contains getters for all implementation of the available action services
 * 
 * @author lion
 */
public class SenlinActionServiceImpl extends BaseSenlinServices implements SenlinActionService {

	@Override
	public List<? extends Action> list() {
		return get(SenlinAction.Action.class, uri("/actions")).execute().getList();
	}

	@Override
	public Action get(String actionID) {
		checkNotNull(actionID);
		return get(SenlinAction.class, uri("/actions/%s", actionID)).execute();
	}
}
