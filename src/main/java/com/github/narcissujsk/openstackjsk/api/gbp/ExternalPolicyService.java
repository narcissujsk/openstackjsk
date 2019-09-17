package com.github.narcissujsk.openstackjsk.api.gbp;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.gbp.ExternalPolicy;
import com.github.narcissujsk.openstackjsk.model.gbp.ExternalPolicyCreate;
 
/**
 * This interface defines all methods for the manipulation of external policies
 * 
 * @author vinod borole
 * 
 */
public interface ExternalPolicyService extends RestService{

    /**
     * List all external policies
     * 
     * @return List of external policies
     */
    List<? extends ExternalPolicy> list();
    /**
     * Returns list of external policies filtered by parameters.
     * 
     * @param filteringParams map (name, value) of filtering parameters
     * @return 
     */
    List<? extends ExternalPolicy> list(Map<String, String> filteringParams);
    /**
     * Get the specified external policy by ID
     *
     * @param id the external policy id
     * @return the external policy or null if not found
     */
    ExternalPolicy get(String id);
    /**
     * Delete of the external policy
     * @param id the external policy id
     * @return the action response
     */
    ActionResponse delete(String id);
    /**
     * Create a new external policy
     *
     * @param external policy
     * @return the newly created external policy
     */
    ExternalPolicy create(ExternalPolicyCreate externalPolicy);
    /**
     * Updates an existing external policy
     * 
     * @param external policy identifier
     * @param external policy that is be used to updated
     * @return the updated external policy
     */
    ExternalPolicy update(String externalPolicyId, ExternalPolicyCreate externalPolicy);
}
