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
import com.github.narcissujsk.openstackjsk.model.telemetry.Trait;

import java.util.List;

/**
 * Event represents the state of an object in an OpenStack service
 * at a point in time when something of interest has occurred
 * 
 * @author Miroslav Lacina
 */
public interface Event extends ModelEntity {

    /**
     * @return a dotted string defining what event occurred
     */
    String getEventType();

    /**
     * @return a timestamp of when the event occurred on the source system
     */
    String getGenerated();

    /**
     * @return a UUID for this event
     */
    String getMessageId();

    /**
     * @return event’s Traits which contain most of the details of the event
     */
    List<? extends Trait> getTraits();

}
