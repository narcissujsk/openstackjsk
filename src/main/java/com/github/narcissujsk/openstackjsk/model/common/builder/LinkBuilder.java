package com.github.narcissujsk.openstackjsk.model.common.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.common.Link;

/**
 * A Builder which creates a Link
 * 
 * @author Jeremy Unruh
 */
public interface LinkBuilder extends Buildable.Builder<LinkBuilder, Link>{

	/**
	 * @see Link#getRel()
	 */
	LinkBuilder rel(String rel);
	
	/**
	 * @see Link#getHref()
	 */
	LinkBuilder href(String href);
	
	/**
	 * @see Link#getType()
	 */
	LinkBuilder type(String type);
	
}
