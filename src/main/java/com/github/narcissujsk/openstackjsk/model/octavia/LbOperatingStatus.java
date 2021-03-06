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
package com.github.narcissujsk.openstackjsk.model.octavia;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Operating status of a load balancer v2
 */
public enum LbOperatingStatus {
    ONLINE,
    DRAINING,
    DEGRADED,
    ERROR,
    NO_MONITOR,
    OFFLINE;

    @JsonCreator
    public static LbOperatingStatus forValue(String value) {
        if (value != null)
        {
            for (LbOperatingStatus s : LbOperatingStatus.values()) {
                if (s.name().equalsIgnoreCase(value)) {
                    return s;
                }
            }
        }
        return LbOperatingStatus.OFFLINE;
    }
}
