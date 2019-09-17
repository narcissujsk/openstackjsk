package com.github.narcissujsk.openstackjsk.model;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

/**
 * Model class which is used for Service Operations that is backed by a unique identifier and a name 
 * 
 * @author Jeremy Unruh
 */
public interface ResourceEntity extends ModelEntity {

	/**
	 * @return the id of this entity
	 */
	String getId();
	
	/**
	 * @return the name of this entity
	 */
	String getName();
	
}
