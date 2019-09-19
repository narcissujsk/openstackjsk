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
package com.github.narcissujsk.openstackjsk.model.storage.block;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.common.QuotaDetails;

/**
 * Block Quota-Set Usage Details
 * 
 * @author Jeremy Unruh
 */
public interface BlockQuotaSetUsage extends ModelEntity {

    /**
     * Usage details for Snapshots
     * 
     * @return usage for snapshots
     */
    QuotaDetails getSnapshots();
    
    /**
     * Usage details for Volumes
     * 
     * @return usage for volumes
     */
    QuotaDetails getVolumes();

    /**
     * Usage details for gigabytes used
     * 
     * @return usage for gigabytes
     */
    QuotaDetails getGigabytes();

}
