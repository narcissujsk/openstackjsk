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
package com.github.narcissujsk.openstackjsk.model.network.ext.builder;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.network.ext.PortPairGroup;

public interface PortPairGroupBuilder  extends Builder<PortPairGroupBuilder, PortPairGroup> {
    /**
     * @param id : Port Pair Group identifer
     * @return PortPairGroupBuilder
     */
    PortPairGroupBuilder id(String id);

    /**
     * @param name : Human readable name for the port pair group
     * @return PortPairGroupBuilder
     */
    PortPairGroupBuilder name(String name);

    /**
     * @param projectId : Project (tenant) identifier
     * @return PortPairGroupBuilder
     */
    PortPairGroupBuilder projectId(String projectId);

    /**
     * @param description : Human readable description for the port pair group
     * @return PortPairGroupBuilder
     */
    PortPairGroupBuilder description(String description);

    /**
     * @param portPairs : port pair members in this group
     * @return PortPairGroupBuilder
     */
    PortPairGroupBuilder portPairs(List<String> portPairs);

    /**
     * @param portPairGroupParameters : parameters for this group.
     *      Possible keys: lb_fields or service_type. Check openstack documentation.
     * @return PortPairGroupBuilder
     */
    PortPairGroupBuilder portPairGroupParameters(Map<String, Object> portPairGroupParameters);

}
