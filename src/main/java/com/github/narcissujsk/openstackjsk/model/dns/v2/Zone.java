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
import com.github.narcissujsk.openstackjsk.model.dns.v2.ZoneType;
import com.github.narcissujsk.openstackjsk.model.dns.v2.builder.ZoneBuilder;

import java.util.List;
import java.util.Map;

/**
 * Zone model
 *
 * @see <a href="https://developer.openstack.org/api-ref/dns/">API reference</a>
 */
public interface Zone extends ModelEntity, Buildable<ZoneBuilder> {

    /**
     * @return the id of the zone
     */
    String getId();

    /**
     * @return id for the pool hosting this zone
     */
    String getPoolId();

    /**
     * @return id for the project that owns the resource
     */
    String getProjectId();

    /**
     * @return DNS Name for the zone
     */
    String getName();

    /**
     * @return e-mail for the zone. Used in SOA records for the zone
     */
    String getEmail();

    /**
     * @return TTL (time to Live) for the zone.
     */
    Integer getTTL();

    /**
     * @return current serial number for the zone
     */
    String getSerial();

    /**
     * @return status of the resource
     */
    Status getStatus();

    /**
     * @return current action in progress on the resource
     */
    Action getAction();

    /**
     * @return description for this zone
     */
    String getDescription();

    /**
     * @return mandatory for secondary zones. The servers to slave from to get DNS information
     */
    List<String> getMasters();

    /**
     * @return type of zone.
     */
    ZoneType getType();

    /**
     * @return for secondary zones. The last time an update was retrieved from the master servers.
     */
    String getTransferedAt();

    /**
     * @return version of the resource
     */
    Integer getVersion();

    /**
     * @return date / time when resource was created
     */
    String getCreatedAt();

    /**
     * @return date / time when resource last updated
     */
    String getUpdatedAt();

    /**
     * @return links to the resource, and other related resources
     */
    Map<String, String> getLinks();

}
