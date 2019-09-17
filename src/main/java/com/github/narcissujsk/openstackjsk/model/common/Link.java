package com.github.narcissujsk.openstackjsk.model.common;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.common.builder.LinkBuilder;

/**
 * Model for a generic link
 * 
 * @author Jeremy Unruh
 */
public interface Link extends ModelEntity, Buildable<LinkBuilder> {

	/**
	 * @return the relative URL or null
	 */
	String getRel();
	
	/**
	 * @return the href URL
	 */
	String getHref();
	
	/**
	 * @return the type of link or null
	 */
	String getType();
	
}
