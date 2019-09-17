package com.github.narcissujsk.openstackjsk.model.common;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

/**
 * A simple entity which supports encapsulating an identifier
 * 
 * @author Jeremy Unruh
 */
public interface IdEntity extends ModelEntity {

    /**
     * @return the identifier for this resource
     */
    String getId();
    
    /**
     * Sets the identifier for this resource.  Note: creating a new resource should not have the idenfier set since OpenStack will 
     * assign one on the create call
     * 
     * @param id the identifier
     */
    void setId(String id);
}
