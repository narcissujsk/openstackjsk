package com.github.narcissujsk.openstackjsk.openstack.murano.v1.builder;

import com.github.narcissujsk.openstackjsk.model.murano.v1.builder.EnvironmentBuilder;
import com.github.narcissujsk.openstackjsk.model.murano.v1.builder.AppCatalogBuilders;
import com.github.narcissujsk.openstackjsk.openstack.murano.v1.domain.MuranoEnvironment;

/**
 * The Application Catalog Builders
 */
public class MuranoBuilders implements AppCatalogBuilders {
    @Override
    public EnvironmentBuilder environment() {
        return MuranoEnvironment.builder();
    }
}
