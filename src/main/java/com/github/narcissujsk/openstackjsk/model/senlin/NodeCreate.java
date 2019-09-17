package com.github.narcissujsk.openstackjsk.model.senlin;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.senlin.Node;
import com.github.narcissujsk.openstackjsk.model.senlin.builder.NodeCreateBuilder;

/**
 * This interface describes the model of a {@link Node}, before it is sent to
 * the server for creation
 * 
 * @author lion
 * 
 */
public interface NodeCreate extends ModelEntity, Buildable<NodeCreateBuilder> {

}
