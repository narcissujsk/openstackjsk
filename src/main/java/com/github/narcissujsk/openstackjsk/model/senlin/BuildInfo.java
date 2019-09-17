package com.github.narcissujsk.openstackjsk.model.senlin;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

import java.util.Map;

/**
 * This interface describes the getter-methods (and thus components) of a BuildInfo.
 * All getters map to the possible return values of
 * <code> GET /v1/build-info</code>
 * 
 * @see http://developer.openstack.org/api-ref-clustering-v1.html
 * 
 * @author lion
 * 
 */
public interface BuildInfo extends ModelEntity {

    /**
     * Returns the api of the build info
     *
     * @return the api of the build info
     */
    Map<String, String> getApi();

    /**
     * Returns the engine of the build info
     *
     * @return the engine of the build info
     */
    Map<String, String> getEngine();
}
