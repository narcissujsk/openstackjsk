package com.github.narcissujsk.openstackjsk.model.compute;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;
/**
 * Server password  
 * 
 * @author vinod borole
 */
public interface ServerPassword  extends ModelEntity {
    /**
     * @return the password of the server
     */
    String getPassword();
}
