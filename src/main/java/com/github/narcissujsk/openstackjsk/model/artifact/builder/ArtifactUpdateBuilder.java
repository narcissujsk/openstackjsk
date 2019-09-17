package com.github.narcissujsk.openstackjsk.model.artifact.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.artifact.ArtifactUpdate;

/**
 * A Builder which creates a ArtifactUpdate
 *
 * @author Pavan Vadavi
 */
public interface ArtifactUpdateBuilder extends Buildable.Builder<ArtifactUpdateBuilder, ArtifactUpdate> {

    ArtifactUpdateBuilder op(String op);

    ArtifactUpdateBuilder path(String path);

    ArtifactUpdateBuilder value(String value);
}
