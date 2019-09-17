package com.github.narcissujsk.openstackjsk.model.artifact;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.artifact.Artifact;
import com.github.narcissujsk.openstackjsk.model.artifact.Template;
import com.github.narcissujsk.openstackjsk.model.artifact.builder.ToscaTemplatesArtifactBuilder;
import com.github.narcissujsk.openstackjsk.model.common.BasicResource;

/**
 * A Glare Tosca Templates Artifact
 *
 * @author Pavan Vadavi
 */
public interface ToscaTemplatesArtifact extends Artifact, Buildable<ToscaTemplatesArtifactBuilder> {

    Template getTemplate();

    String getTemplateFormat();

}
