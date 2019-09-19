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

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * os-detach
 * @author capitek-xuning（首信科技-徐宁）
 *
 */
@JsonRootName("os-detach")
public class DetachAction implements ModelEntity {

	private static final long serialVersionUID = 1L;

	/**
	 * The ID of the attachment.
	 */
	@JsonProperty("attachment_id")
	private String attachmentId;

	/**
	 * @author capitek-xuning（首信科技-徐宁）
	 * @param attachmentId The ID of the attachment.
	 */
	public DetachAction(String attachmentId) {
		super();
		this.attachmentId = attachmentId;
	}

	public String getAttachmentId() {
		return attachmentId;
	}

}
