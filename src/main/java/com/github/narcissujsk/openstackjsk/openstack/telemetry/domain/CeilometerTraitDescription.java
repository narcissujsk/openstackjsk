package com.github.narcissujsk.openstackjsk.openstack.telemetry.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.narcissujsk.openstackjsk.model.telemetry.TraitDescription;

/**
 * A description of a trait, with no associated value.
 *
 * @author Miroslav Lacina
 */
public class CeilometerTraitDescription implements TraitDescription {

    private static final long serialVersionUID = 1L;

    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

}