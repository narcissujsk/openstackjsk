package com.github.narcissujsk.openstackjsk.api.gbp;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.gbp.PolicyClassifier;
import com.github.narcissujsk.openstackjsk.model.gbp.PolicyClassifierUpdate;

/**
 * This interface defines all methods for the manipulation of policy classifiers
 * 
 * @author vinod borole
 *  
 */
public interface PolicyClassifierService {
    /**
     * List all policy classifier
     * 
     * @return List of policy classifier
     */
    List<? extends PolicyClassifier> list();
    /**
     * Returns list of policy classifier filtered by parameters.
     * 
     * @param filteringParams map (name, value) of filtering parameters
     * @return 
     */
    List<? extends PolicyClassifier> list(Map<String, String> filteringParams);
    /**
     * Get the specified policy classifier by ID
     *
     * @param id the policy classifier id
     * @return policy classifier or null if not found
     */
    PolicyClassifier get(String id);
    /**
     * Delete of the policy classifier
     * @param id the policy classifier id
     * @return the classifier response
     */
    ActionResponse delete(String id);
    /**
     * Create a new policy classifier
     *
     * @param policy classifier
     * @return the newly created policy classifier
     */
    PolicyClassifier create(PolicyClassifier policyClassifier);
    /**
     * Updates an existing policy classifier
     * 
     * @param policy classifier identifier
     * @param policy classifier that is be used to updated
     * @return the updated policy classifier
     */
    PolicyClassifier update(String policyClassifierId, PolicyClassifierUpdate policyClassifier);
}
