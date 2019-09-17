package com.github.narcissujsk.openstackjsk.model.sahara;

import java.util.Map;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

/**
 * Service Information Model
 *
 * @author ekasit.kijsipongse@nectec.or.th
 */
public interface ServiceInfo extends ModelEntity {

    /**
     * @param name the name of the information
     * @return the information
     */
    String get(String name);
    
    /**
     * @return map of all information or null
     */
    Map<String, String> getInfos();
    
}
