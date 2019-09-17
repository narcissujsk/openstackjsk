package com.github.narcissujsk.openstackjsk.model.senlin;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

import java.util.Map;

/**
 * This interface describes the getter-methods (and thus components) of a ProfileType.
 * All getters map to the possible return values of
 * <code> GET /v1/profile-types/​{profile_type}​</code>
 * 
 * @see http://developer.openstack.org/api-ref-clustering-v1.html
 * 
 * @author lion
 * 
 */
public interface ProfileType extends ModelEntity {

	/**
	 * Returns the name of the ProfileType
	 * 
	 * @return the name of the ProfileType
	 */
	String getName();

	/**
	 * Returns the schema of the ProfileType
	 *
	 * @return the schema of the ProfileType
	 */
	Map<String, Map> getSchema();
}
