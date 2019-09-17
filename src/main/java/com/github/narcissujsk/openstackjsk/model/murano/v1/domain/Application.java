package com.github.narcissujsk.openstackjsk.model.murano.v1.domain;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.murano.v1.domain.ServiceInfo;

import java.util.Map;

/**
 * @author Nikolay Mahotkin.
 */
public interface Application extends ModelEntity {
    /**
     *
     * @return data in map format (Map<String, Object>).
     */
    Map<String, Object> getData();

    /**
     *
     * @return service internal info
     */
    ServiceInfo getService();
}
