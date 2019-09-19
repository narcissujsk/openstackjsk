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
package com.github.narcissujsk.openstackjsk.openstack.murano.v1.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.narcissujsk.openstackjsk.model.murano.v1.domain.ActionResult;

/**
 * @author Nikolay Mahotkin.
 */
public class MuranoActionResult implements ActionResult {
    @JsonProperty
    private Boolean isException;

    @JsonProperty
    private Object result;

    @Override
    public Boolean isException() {
        return this.isException;
    }

    @Override
    public Object getResult() {
        return this.result;
    }
}
