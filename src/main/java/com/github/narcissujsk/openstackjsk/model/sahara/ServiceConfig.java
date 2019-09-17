package com.github.narcissujsk.openstackjsk.model.sahara;

import java.util.Map;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.sahara.builder.ServiceConfigBuilder;

/**
 * Service Configuration Model
 *
 * @author Ekasit Kijsipongse
 */
public interface ServiceConfig extends ModelEntity, Buildable<ServiceConfigBuilder> {

    /**
     * @param name the name of the parameter
     * @return the value of the parameter
     */
    Object get(String name);
    
    /**
     * @return map of all configurations or null
     */
    Map<String, Object> getConfigs();
    
}
