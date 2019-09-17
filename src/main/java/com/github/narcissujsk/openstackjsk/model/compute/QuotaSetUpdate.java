package com.github.narcissujsk.openstackjsk.model.compute;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.compute.builder.QuotaSetUpdateBuilder;

/**
 * Represents an updateable quota set
 * 
 * @author Jeremy Unruh
 */
public interface QuotaSetUpdate extends ModelEntity, Buildable<QuotaSetUpdateBuilder>{

}
