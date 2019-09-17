package com.github.narcissujsk.openstackjsk.model.murano.v1.domain;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.murano.v1.builder.EnvironmentBuilder;
import com.github.narcissujsk.openstackjsk.model.murano.v1.domain.Application;

import java.util.List;

public interface Environment extends ModelEntity, Buildable<EnvironmentBuilder> {
    /**
     * @return the id of the environment
     */
    String getId();

    /**
     * @return the services of the environment
     */
    List<? extends Application> getServices();

    /**
     * @return the status of the environment
     */
    String getStatus();

    /**
     * @return the updated date of the environment
     */
    String getUpdated();

    /**
     * @return the name of the environment
     */
    String getName();

    /**
     * @return the created date of the environment
     */
    String getCreated();

    /**
     * @return the tenant id of the environment
     */
    String getTenantId();

    /**
     * @return the version of the environment
     */
    String getVersion();
}
