package com.github.narcissujsk.openstackjsk.openstack.common;

import java.util.HashMap;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

/**
 * Simple name value pair based Entity
 * 
 * @author Jeremy Unruh
 */
public class MapEntity extends HashMap<String, Object> implements ModelEntity {

    private static final long serialVersionUID = 1L;

    public static MapEntity create(String key, Object value) {
        return new MapEntity().add(key, value);
    }
    
    public MapEntity add(String key, Object value) {
        super.put(key, value);
        return this;
    }
    
}
