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
package com.github.narcissujsk.openstackjsk.model.telemetry;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

/**
 * A description of a trait, with no associated value.
 *
 * @author Miroslav Lacina
 */
public interface TraitDescription extends ModelEntity {

    /**
     * @return name of Trait
     */
    String getName();

    /**
     * @return data type of Trait
     */
    String getType();

}
