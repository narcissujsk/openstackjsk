package com.github.narcissujsk.openstackjsk.model.heat;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.heat.builder.TemplateBuilder;

/**
 * This interface describes a template object. 
 * @author Matthias Reisser
 *
 */
public interface Template extends ModelEntity, Buildable<TemplateBuilder> {
	
	/**
	 * Returns the JSON-representation of the template
	 * 
	 * @return the JSON formatted template
	 */
	String getTemplateJson();
	
	/**
	 * The URL of the template to instantiate. This value is ignored if the template is supplied inline.
	 * 
	 * @return the template URL
	 */
	String getTemplateURL();
	
	

}
