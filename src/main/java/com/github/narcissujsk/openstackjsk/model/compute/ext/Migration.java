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
package com.github.narcissujsk.openstackjsk.model.compute.ext;

import java.util.Date;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * A model class which enables an administrative user to fetch in-progress migrations for a region or specified cell in a region
 *
 * @author Jeremy Unruh
 */
public interface Migration extends ModelEntity {
    
    public enum Status {
        MIGRATING,
        ERROR,
        DONE;
        
        @JsonCreator
        public static Status forValue(String value) {
            if (value != null)
            {
                for (Status s : Status.values()) {
                    if (s.name().equalsIgnoreCase(value))
                        return s;
                }
            }
            return Status.MIGRATING;
        }
    }

    /**
     * @return the migration ID
     */
    String getId();
    
    /**
     * @return the ID of the instance being migrated
     */
    String getInstanceUuid();
    
    /**
     * @return the migration status
     */
    Status getStatus();
    
    /**
     * @return the created timestamp
     */
    Date getCreatedAt();

    /**
     * @return the last updated timestamp
     */
    Date getUpdatedAt();
    
    /**
     * @return the destination compute node
     */
    String getDestCompute();
    
    /**
     * @return the destination host
     */
    String getDestHost();
    
    /**
     * @return the destination node
     */
    String getDestNode();
    
    /**
     * @return the source compute node
     */
    String getSourceCompute();
    
    /**
     * @return the source node
     */
    String getSourceNode();
    
    /**
     * @return the ID of the new instance type
     */
    String getNewInstanceTypeId();
    
    /**
     * @return the ID of the old instance type
     */
    String getOldInstanceTypeId();
}

