package com.github.narcissujsk.openstackjsk.model.heat;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.heat.BaseStackCreateUpdate;
import com.github.narcissujsk.openstackjsk.model.heat.builder.StackUpdateBuilder;

/**
 * Model Entity used for updating a Stack
 * 
 * @author Jeremy Unruh
 */
public interface StackUpdate extends BaseStackCreateUpdate, Buildable<StackUpdateBuilder> {

}
