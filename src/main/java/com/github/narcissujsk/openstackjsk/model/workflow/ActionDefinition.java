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
/*
 * 
 */
package com.github.narcissujsk.openstackjsk.model.workflow;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.workflow.Definition;
import com.github.narcissujsk.openstackjsk.model.workflow.builder.ActionDefinitionBuilder;


/**
 * An action definition.
 *
 * @author Renat Akhmerov
 */
public interface ActionDefinition extends Definition {

    /**
     * @return The comma-separated list of input parameters of this workflow
     * definition.
     */
    String getInput();
}
