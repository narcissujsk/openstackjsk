package com.github.narcissujsk.openstackjsk.model.artifact;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.artifact.ArtifactType;

import java.util.List;

/**
 * A Glare list of Artifacts
 *
 * @author Pavan Vadavi
 */
public interface Artifacts extends ModelEntity {

    ArtifactType artifactType = ArtifactType.ALL;

    public String getSchema();

    public String getFirst();

}
