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
package com.github.narcissujsk.openstackjsk.api.manila;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.manila.BackendStoragePool;

import java.util.List;

/**
 * Scheduler Stats Service for Manila Shared Filesystems.
 *
 * @author Daniel Gonzalez Nothnagel
 */
public interface SchedulerStatsService extends RestService {
    /**
     * Lists all back-end storage pools.
     *
     * @return a list of all back-end storage pools
     */
    List<? extends BackendStoragePool> pools();

    /**
     * Lists all storage pools for a back end, with details.
     * @return a list of all back-end storage pools with details
     */
    List<? extends BackendStoragePool> poolsDetail();
}
