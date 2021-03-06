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

import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.compute.ServerUpdateOptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * The JSON object used to update an existing server
 * 
 * @author Jeremy Unruh
 */
@JsonRootName("server")
public class NovaServerUpdate implements ModelEntity {

    private static final long serialVersionUID = 1L;
    
    @JsonProperty("name")
    private String name;
    @JsonProperty("accessIPv4")
    private String accessIPv4;
    @JsonProperty("accessIPv6")
    private String accessIPv6;
    
    /**
     * Creates a NovaServerUpdate from Options
     * 
     * @param options the server update options
     * @return NovaServerUpdate instance
     */
    public static NovaServerUpdate fromOptions(ServerUpdateOptions options) {
        NovaServerUpdate su = new NovaServerUpdate();
        su.name = options.getName();
        su.accessIPv4 = options.getAccessIPv4();
        su.accessIPv6 = options.getAccessIPv6();
        return su;
    }
    
}
