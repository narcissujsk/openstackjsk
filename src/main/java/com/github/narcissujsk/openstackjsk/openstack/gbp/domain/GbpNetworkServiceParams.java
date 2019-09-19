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
package com.github.narcissujsk.openstackjsk.openstack.gbp.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.narcissujsk.openstackjsk.model.gbp.NetworkServiceParamType;
import com.github.narcissujsk.openstackjsk.model.gbp.NetworkServiceParamValue;
import com.github.narcissujsk.openstackjsk.model.gbp.NetworkServiceParams;

/**
 * Created by sumit gandhi on 7/4/2016.
 */

public class GbpNetworkServiceParams implements NetworkServiceParams{

    @JsonProperty("type")
    private NetworkServiceParamType paramType;

    private String name;

    @JsonProperty("value")
    private NetworkServiceParamValue paramValue;


    public NetworkServiceParamType getParamType() {
        return paramType;
    }

    public void setParamType(NetworkServiceParamType paramType) {
        this.paramType = paramType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public NetworkServiceParamValue getParamValue() {
        return paramValue;
    }

    public void setParamValue(NetworkServiceParamValue paramValue) {
        this.paramValue = paramValue;
    }

}
