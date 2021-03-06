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

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.model.compute.HostAggregate;
import com.github.narcissujsk.openstackjsk.openstack.common.ListResult;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;
/**
 * Nova HostAggregate
 * @author liujunpeng
 *
 */
@JsonRootName("aggregate")
@JsonIgnoreProperties(ignoreUnknown=true)
public class NovaHostAggregate implements HostAggregate {

	private static final long serialVersionUID = 1L;
	@JsonProperty("availability_zone")
	public String availabilityZone;
	@JsonProperty("created_at")
	public Date createdAt;
	public boolean deleted;
	@JsonProperty("deleted_at")
	public Date deletedAt;
	public List<String> hosts;
	public String id;
	public Map <String,String>metadata;
	public String name;
	@JsonProperty("updated_at")
	public Date updatedAt;
	/**
	 * Used internally by the domain side of the API to create a new HostAggregate on an OpenStack server
	 * @param name
	 * @param availabilityZone
	 * @return NovaHostAggregate
	 */
	public static NovaHostAggregate create(String name,String availabilityZone){
		NovaHostAggregate hostAggregate = new NovaHostAggregate();
		hostAggregate.name = name;
		hostAggregate.availabilityZone=availabilityZone;
		return hostAggregate;

	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getAvailabilityZone() {
		return availabilityZone;
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date getCreate() {
		return createdAt;
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isDeleted() {
		return deleted;
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date getDeletedAt() {
		return deletedAt;
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<String> getHosts() {
		return hosts;
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getId() {
		return id;
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Map<String, String> getMetadata() {
		return metadata;
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getName() {
		return name;
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date getUpdatedAt() {
		return updatedAt;
	}

	@Override
	public String toString() {

		return MoreObjects.toStringHelper(this).omitNullValues()
				.add("availabilityZone", availabilityZone)
				.add("createdAt", createdAt)
				.add("deleted", deleted)
				.add("deletedAt", deletedAt)
				.add("hosts", hosts)
				.add("id", id)
				.add("metadata", metadata)
				.add("name", name)
				.add("updatedAt", updatedAt).toString();
	}

	/**
	 * host aggregates
	 * @author liujunpeng
	 *
	 */
	public static class NovaHostAggregates extends ListResult<NovaHostAggregate> {

		private static final long serialVersionUID = 1L;

		@JsonProperty("aggregates")
		private List<NovaHostAggregate> aggregates;
		/**
		 * NovaHostAggregates
		 */
		@Override
        public List<NovaHostAggregate> value() {
			return aggregates;
		}

		@Override
		public String toString() {
			return "HostAggregates [aggregates=" + aggregates + "]";
		}

	}

}
