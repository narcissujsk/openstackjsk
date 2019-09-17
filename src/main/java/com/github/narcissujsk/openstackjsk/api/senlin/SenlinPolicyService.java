package com.github.narcissujsk.openstackjsk.api.senlin;

import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.senlin.Policy;
import com.github.narcissujsk.openstackjsk.model.senlin.PolicyCreate;

import java.util.List;

/**
 * This interface defines all methods for the manipulation of Policy
 * 
 * @author lion
 * 
 */
public interface SenlinPolicyService {
	
	/**
	 * Gets a list of currently existing {@link Policy}s.
	 * 
	 * @return the list of {@link Policy}s
	 */
	List<? extends Policy> list();

	/**
	 * <code>POST /v1/policies</code><br \>
	 *
	 * Creates a new {@link Policy} out of a {@link PolicyCreate} object
	 *
	 * @param newPolicy
	 *            {@link PolicyCreate} object out of which policy is to be created
	 * @return new {@link Policy} as returned from the server
	 */
	Policy create(PolicyCreate newPolicy);

	/**
	 * returns details of a {@link Policy}.
	 *
	 * @param policyID
	 *            Id of {@link Policy}
	 * @return Policy
	 */
	Policy get(String policyID);

	/**
	 * <code>PATCH /v1/policies/​{policy_id}​</code><br \>
	 *
	 * Update a {@link Policy} out of a {@link PolicyCreate} object
	 *
	 * @param policyID
	 *             Id of {@link Policy}
	 * @param newPolicy
	 *            {@link PolicyCreate} object out of which stack is to be update
	 * @return new {@link Policy} as returned from the server
	 */
	Policy update(String policyID, PolicyCreate newPolicy);

	/**
	 * Deletes the specified {@link Policy} from the server.
	 *
	 * @param policyID
	 *            Id of {@link Policy}
	 * @return the action response
	 */
	ActionResponse delete(String policyID);
}
