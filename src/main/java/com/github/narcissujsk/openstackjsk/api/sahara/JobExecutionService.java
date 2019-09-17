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
