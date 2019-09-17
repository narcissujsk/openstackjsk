package com.github.narcissujsk.openstackjsk.model.senlin;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.senlin.Cluster;
import com.github.narcissujsk.openstackjsk.model.senlin.builder.ClusterCreateBuilder;

/**
 * This interface describes the model of a {@link Cluster}, before it is sent to
 * the server for creation
 * 
 * @author lion
 * 
 */
public interface ClusterCreate extends ModelEntity, Buildable<ClusterCreateBuilder> {

}
