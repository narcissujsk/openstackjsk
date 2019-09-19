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

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.sahara.JobExecution;

/**
 * Sahara Data Processing Operations
 *
 * @author ekasit.kijsipongse@nectec.or.th
 */
public interface JobExecutionService extends RestService {

    /**
     * Create a new job execution
     * 
     * @param jobExecution the job execution to create
     * @return the created job execution
     */
    JobExecution create(JobExecution jobExecution);

    /**
     * List all job executions
     * 
     * @return list of job executions or empty
     */
    List<? extends JobExecution> list();

    /**
     * Get a job execution by ID
     * 
     * @param jobExecutionId the job execution identifier
     * @return the job execution or null if not found
     */
    JobExecution get(String jobExecutionId);

    /**
     * Refresh the status of a job execution by ID
     * 
     * @param jobExecutionId the job execution identifier 
     * @return the refreshed job execution or null if not found
     */
    JobExecution refreshStatus(String jobExecutionId);

    /**
     * Cancel a job execution by ID
     * 
     * @param jobExecutionId the job execution identifier
     * @return the canceled job execution or null if not found
     */
    JobExecution cancel(String jobExecutionId);

    /**
     * Delete a job execution by ID
     * 
     * @param jobExecutionId the job execution identifier
     * @return the action response
     */
    ActionResponse delete(String jobExecutionId);
}
