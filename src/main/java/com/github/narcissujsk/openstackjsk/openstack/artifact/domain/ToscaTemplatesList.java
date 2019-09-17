package com.github.narcissujsk.openstackjsk.openstack.artifact.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.narcissujsk.openstackjsk.model.artifact.Artifacts;
import com.github.narcissujsk.openstackjsk.model.artifact.ToscaTemplatesArtifacts;

import java.util.List;

/**
 * Created by vadavi on 18-01-2017.
 */
public class ToscaTemplatesList implements ToscaTemplatesArtifacts {

    @JsonProperty("tosca_templates")
    private List<ToscaTemplates> toscaTemplates = null;
    @JsonProperty("schema")
    private String schema;
    @JsonProperty("first")
    private String first;

    @Override
    public List<ToscaTemplates> getToscaTemplates() {
        return toscaTemplates;
    }

    public void setToscaTemplates(List<ToscaTemplates> toscaTemplates) {
        this.toscaTemplates = toscaTemplates;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }
}
