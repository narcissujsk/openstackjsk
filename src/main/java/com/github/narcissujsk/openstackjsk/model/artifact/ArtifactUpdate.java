package com.github.narcissujsk.openstackjsk.model.artifact;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.artifact.builder.ArtifactUpdateBuilder;

/**
 * A Glare ArtifactUpdate
 *
 * @author Pavan Vadavi
 */
public interface ArtifactUpdate extends ModelEntity, Buildable<ArtifactUpdateBuilder> {

    public String getOp();

    public String getPath();

    public String getValue();
}
