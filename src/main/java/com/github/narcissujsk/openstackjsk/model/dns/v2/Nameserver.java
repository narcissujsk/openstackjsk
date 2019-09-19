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
import com.github.narcissujsk.openstackjsk.model.dns.v2.builder.NameserverBuilder;

/**
 * Nameserver model
 *
 * @see <a href="https://developer.openstack.org/api-ref/dns/">API reference</a>
 */
public interface Nameserver extends ModelEntity, Buildable<NameserverBuilder> {

    /**
     * @return the hostname of the nameserver that the zone should be delegated to
     */
    String getHostname();

    /**
     * @return the priority of the nameserver
     */
    Integer getPriority();

}
