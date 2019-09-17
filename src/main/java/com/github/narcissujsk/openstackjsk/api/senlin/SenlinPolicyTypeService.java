package com.github.narcissujsk.openstackjsk.api.senlin;

import com.github.narcissujsk.openstackjsk.model.senlin.PolicyType;

import java.util.List;

/**
 * This interface defines all methods for the manipulation of PolicyType
 * 
 * @author lion
 * 
 */
public interface SenlinPolicyTypeService {
	
	/**
	 * Gets a list of currently existing {@link PolicyType}s.
	 * 
	 * @return the list of {@link PolicyType}s
	 */
	List<? extends PolicyType> list();

	/**
	 * returns details of a {@link PolicyType}.
	 *
	 * @param policyTypeName
	 *            Name of {@link PolicyType}
	 * @return PolicyType
	 */
	PolicyType get(String policyTypeName);
}
