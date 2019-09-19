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
package com.github.narcissujsk.openstackjsk.api.sahara;

import java.io.InputStream;
import java.util.List;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.common.Payload;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.sahara.JobBinary;

/**
 * Sahara Data Processing Operations
 *
 * @author ekasit.kijsipongse@nectec.or.th
 */
public interface JobBinaryService extends RestService {

    /**
     * List all job binaries
     * 
     * @return list of job binaries or empty
     */
     List<? extends JobBinary> list();

    /**
     * Get a job binary by ID
     * 
     * @param JobBinaryId the job binary identifier
     * @return the job binary or null if not found
     */
     JobBinary get(String JobBinaryId);

    /**
     * Create a new job binary
     *
     * @param jobBinary the job binary to create
     * @return the created job binary
     */
     JobBinary create(JobBinary jobBinary);

    /**
     * Delete the specified job binary
     * 
     * @param JobBinaryId the job binary identifier
     * @return the action response
     */
     ActionResponse delete(String JobBinaryId);

     /**
      * Retrieves data of specified job binary object
      * 
      * @param JobBinaryId the job binary identifier
      * @return Job Binary data
      */
     Payload<InputStream> getData(String JobBinaryId);
}
