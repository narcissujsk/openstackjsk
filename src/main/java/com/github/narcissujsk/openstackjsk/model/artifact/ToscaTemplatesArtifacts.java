package com.github.narcissujsk.openstackjsk.model.artifact;

import com.github.narcissujsk.openstackjsk.model.artifact.Artifacts;
import com.github.narcissujsk.openstackjsk.openstack.artifact.domain.ToscaTemplates;

import java.util.List;

/**
 * A Glare Tosca Templates Artifact
 *
 * @author Pavan Vadavi
 */
public interface ToscaTemplatesArtifacts extends Artifacts {

    List<ToscaTemplates> getToscaTemplates();
}
