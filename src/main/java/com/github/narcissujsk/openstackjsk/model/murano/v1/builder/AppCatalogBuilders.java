package com.github.narcissujsk.openstackjsk.model.murano.v1.builder;

import com.github.narcissujsk.openstackjsk.model.murano.v1.builder.EnvironmentBuilder;

/**
 * The Application Catalog (Murano) builders
 */
public interface AppCatalogBuilders {
    /**
     * The builder to create a murano environment
     *
     * @return the environment builder
     */
    public EnvironmentBuilder environment();
}
