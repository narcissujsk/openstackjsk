package com.github.narcissujsk.openstackjsk.model.heat;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.heat.BaseStackCreateUpdate;
import com.github.narcissujsk.openstackjsk.model.heat.Stack;
import com.github.narcissujsk.openstackjsk.model.heat.builder.StackCreateBuilder;

/**
 * This interface describes the model of a {@link Stack}, before it is sent to
 * the server for creation
 * 
 * @author Matthias Reisser
 * 
 */
public interface StackCreate extends BaseStackCreateUpdate, Buildable<StackCreateBuilder> {

	boolean getDisableRollback();
	
	/**
     * Returns the name of the stack to create
     * 
     * @return the name of the stack to create
     */
    String getName();
}
