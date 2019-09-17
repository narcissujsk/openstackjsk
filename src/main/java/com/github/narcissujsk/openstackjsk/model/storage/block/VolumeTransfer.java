package com.github.narcissujsk.openstackjsk.model.storage.block;

import java.util.Date;
import java.util.List;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.common.Link;

/**
 * Represents a Volume Transfer Entity which is used for creating a volume transfer
 * 
 * @author Jeremy Unruh
 */
public interface VolumeTransfer extends ModelEntity {

    /**
     * @return the identifier assigned to the transfer
     */
    String getId();
    
    /**
     * @return indicates the volume identifier of the volume being transfer
     */
    String getVolumeId();
    
    /**
     * @return the name of the transfer
     */
    String getName();
    
    /**
     * @return the authorization key of the transfer
     */
    String getAuthKey();
    
    /**
     * @return the date/time the transfer was created
     */
    Date getCreatedAt();
    
    /**
     * @return List of External Links 
     **/
    List<? extends Link> getLinks();
    
    
}
