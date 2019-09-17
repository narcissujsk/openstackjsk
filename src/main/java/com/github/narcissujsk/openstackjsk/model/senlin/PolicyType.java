package com.github.narcissujsk.openstackjsk.model.senlin;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

import java.util.Map;

/**
 * This interface describes the getter-methods (and thus components) of a PolicyType.
 * All getters map to the possible return values of
 * <code> GET /v1/policy-types/​{policy_type}​</code>
 * 
 * @see http://developer.openstack.org/api-ref-clustering-v1.html
 * 
 * @author lion
 * 
 */
public interface PolicyType extends ModelEntity {

	/**
	 * Returns the name of the PolicyType
	 * 
	 * @return the name of the PolicyType
	 */
	String getName();

	/**
	 * Returns the schema of the PolicyType
	 *
	 * @return the schema of the PolicyType
	 */
	Map<String, Object> getSchema();
}
