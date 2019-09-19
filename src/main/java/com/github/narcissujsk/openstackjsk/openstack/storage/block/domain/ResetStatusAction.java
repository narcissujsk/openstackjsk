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
package com.github.narcissujsk.openstackjsk.openstack.storage.block.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.storage.block.Volume;

@JsonRootName("os-reset_status")
public class ResetStatusAction implements ModelEntity {

	private static final long serialVersionUID = 1L;

	@JsonProperty("status")
	private final Volume.Status status;

	public ResetStatusAction(Volume.Status status) {
		this.status = status;
	}

	public static ResetStatusAction create(Volume.Status status) {
		return new ResetStatusAction(status);
	}

	public Volume.Status getStatus() {
		return status;
	}
}
