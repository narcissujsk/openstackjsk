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
package com.github.narcissujsk.openstackjsk.openstack.senlin.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.github.narcissujsk.openstackjsk.model.senlin.Policy;
import com.github.narcissujsk.openstackjsk.openstack.common.ListResult;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * This is a model of a senlinPolicy. It uses Jackson annotations for
 * (de)serialization into JSON format
 * 
 * @author lion
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("policy")
public class SenlinPolicy implements Policy {
	private static final long serialVersionUID = -8596243151035363550L;

	@JsonProperty("id")
	private String id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("domain")
	private String domain;
	@JsonProperty("project")
	private String project;
	@JsonProperty("user")
	private String user;
	@JsonProperty("data")
	private Map<String, Object> data;
	@JsonProperty("spec")
	private Map<String, Object> spec;
	@JsonProperty("type")
	private String type;
	@JsonProperty("created_at")
	private Date createdAt;
	@JsonProperty("updated_at")
	private Date updatedAt;

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDomain() {
		return domain;
	}

	@Override
	public String getProject() {
		return project;
	}

	@Override
	public String getUser() {
		return user;
	}

	@Override
	public Map<String, Object> getData() {
		return data;
	}

	@Override
	public Map<String, Object> getSpec() {
		return spec;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public Date getCreatedAt() {
		return createdAt;
	}

	@Override
	public Date getUpdatedAt() {
		return updatedAt;
	}

	@Override
	public String toString() {
		return "SenlinPolicy{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", domain='" + domain + '\'' +
				", project='" + project + '\'' +
				", user='" + user + '\'' +
				", data=" + data +
				", spec=" + spec +
				", type='" + type + '\'' +
				", created_at='" + createdAt + '\'' +
				", updated_at='" + updatedAt + '\'' +
				'}';
	}

	/**
	 * An inner class for representing lists of senlinPolicy
	 * 
	 * @author lion
	 * 
	 */
	public static class Policy extends ListResult<SenlinPolicy> {
		private static final long serialVersionUID = -7262524403002617445L;

		@JsonProperty("policies")
		private List<SenlinPolicy> list;

		protected List<SenlinPolicy> value() {
			return list;
		}
	}
}
