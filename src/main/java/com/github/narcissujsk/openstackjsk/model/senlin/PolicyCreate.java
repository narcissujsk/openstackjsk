package com.github.narcissujsk.openstackjsk.model.senlin;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.senlin.Policy;
import com.github.narcissujsk.openstackjsk.model.senlin.builder.PolicyCreateBuilder;

/**
 * This interface describes the model of a {@link Policy}, before it is sent to
 * the server for creation
 * 
 * @author lion
 * 
 */
public interface PolicyCreate extends ModelEntity, Buildable<PolicyCreateBuilder> {

}
