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
package com.github.narcissujsk.openstackjsk.openstack.compute.domain;

import java.util.Map;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

import com.fasterxml.jackson.annotation.JsonRootName;
/**
 * set metadata for an aggregate.
 * @author liujunpeng
 */
@JsonRootName("set_metadata")
public class HostAggregateMetadata implements ModelEntity {

	private static final long serialVersionUID = 1L;

	Map <String, String> metadata;
	/**
	 * @param metadata for hostAggregateMetadata
	 * @return HostAggregateMetadata
	 */
	public HostAggregateMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}
	
	public HostAggregateMetadata() {
	}

	public Map<String, String> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}
	

}
