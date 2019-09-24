
package com.github.narcissujsk.openstackjsk.model.common;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.artifact.builder.ArtifactUpdateBuilder;
import com.github.narcissujsk.openstackjsk.model.common.builder.UpdateBuilder;


public interface Update extends ModelEntity, Buildable<UpdateBuilder> {

    public String getOp();

    public String getPath();

    public String getValue();
}
