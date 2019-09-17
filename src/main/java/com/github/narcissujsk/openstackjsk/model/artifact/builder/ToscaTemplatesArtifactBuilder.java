package com.github.narcissujsk.openstackjsk.model.artifact.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.artifact.Template;
import com.github.narcissujsk.openstackjsk.model.artifact.ToscaTemplatesArtifact;
import com.github.narcissujsk.openstackjsk.model.artifact.builder.ArtifactBuilder;

/**
 * A Builder which creates a Tosca Template Artifact Builder
 *
 * @author Pavan Vadavi
 */
public interface ToscaTemplatesArtifactBuilder extends ArtifactBuilder,  Builder<ToscaTemplatesArtifactBuilder, ToscaTemplatesArtifact> {

    ToscaTemplatesArtifactBuilder template(Template template);

    ToscaTemplatesArtifactBuilder templateFormat(String templateFormat);
}
