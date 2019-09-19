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
package com.github.narcissujsk.openstackjsk.model.dns.v2;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.dns.v2.Action;
import com.github.narcissujsk.openstackjsk.model.dns.v2.Status;
import com.github.narcissujsk.openstackjsk.model.dns.v2.builder.RecordsetBuilder;

import java.util.List;
import java.util.Map;

/**
 * Recordset model
 *
 * @see <a href="https://developer.openstack.org/api-ref/dns/">API reference</a>
 */
public interface Recordset extends ModelEntity, Buildable<RecordsetBuilder> {

	/**
	 * @return id for the recordset
	 */
	String getId();

	/**
	 * @return id for the project that owns the resource
	 */
	String getProjectId();

	/**
	 * @return DNS Name for the recordset
	 */
	String getName();

	/**
	 * @return TTL (Time to Live) for the recordset.
	 */
	String getTTL();

	/**
	 * @return status of the resource
	 */
	Status getStatus();

	/**
	 * @return current action in progress on the resource
	 */
	Action getAction();

	/**
	 * @return id for the zone that contains this recordset
	 */
	String getZoneId();

	/**
	 * @return name of the zone that contains this recordset
	 */
	String getZoneName();

	/**
	 * @return description for this recordset
	 */
	String getDescription();

	/**
	 * @return RRTYPE of the recordset
	 */
	String getType();

	/**
	 * @return version of the resource
	 */
	Integer getVersion();

	/**
	 * @return date / time when resource was created
	 */
	String getCreatedAt();

	/**
	 * @return date / time when resource was last updated
	 */
	String getUpdatedAt();

	/**
	 * @return links to the resource, and other related resources.
	 */
	Map<String, String> getLinks();

	/**
	 * @return list of data for this recordset. Each item will be a separate record in Designate.
	 */
	List<String> getRecords();

}
