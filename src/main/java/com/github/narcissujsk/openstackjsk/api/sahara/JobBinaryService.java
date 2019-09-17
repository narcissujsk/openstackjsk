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
