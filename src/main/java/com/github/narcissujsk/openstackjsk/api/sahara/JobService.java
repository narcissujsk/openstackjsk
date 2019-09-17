package com.github.narcissujsk.openstackjsk.api.sahara;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.sahara.Job;
import com.github.narcissujsk.openstackjsk.model.sahara.JobConfigHint;

/**
 * Sahara Data Processing Operations
 *
 * @author ekasit.kijsipongse@nectec.or.th
 */
public interface JobService extends RestService {

    /**
     * List all jobs
     * 
     * @return list of jobs or empty
     */
     List<? extends Job> list();

    /**
     * Get a job by ID
     * @param JobId the job identifier
     * @return the job or null if not found
     */
     Job get(String JobId);

    /**
     * Create a new job
     *
     * @param jobBinary the job to create
     * @return the created job
     */
     Job create(Job jobBinary);

    /**
     * Delete the specified job
     * 
     * @param JobId the job identifier
     * @return the action response
     */
     ActionResponse delete(String JobId);

     /**
      * Get Job Configuration Hints
      * 
      * @param type the job type
      * @return the job configuration hints
      */
     JobConfigHint getConfigHint(String type);
}
