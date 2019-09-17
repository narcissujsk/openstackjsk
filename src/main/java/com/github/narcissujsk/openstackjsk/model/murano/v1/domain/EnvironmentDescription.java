package com.github.narcissujsk.openstackjsk.model.murano.v1.domain;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.murano.v1.domain.Application;

import java.util.List;
import java.util.Map;

/**
 * @author Nikolay Mahotkin.
 */
public interface EnvironmentDescription extends ModelEntity {
    /**
     *
     * @return services list in given environment.
     */
    List<? extends Application> getServices();

    /**
     *
     * @return the environment name.
     */
    String getName();

    /**
     *
     * @return defaultNetworks info.
     */
    Map<String, Object> getDefaultNetworks();

    /**
     *
     * @return Map object containing env id and type.
     */
    Map<String, Object> getEnvIdentities();
}
