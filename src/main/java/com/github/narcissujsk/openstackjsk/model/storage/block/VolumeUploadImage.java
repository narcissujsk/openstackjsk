package com.github.narcissujsk.openstackjsk.model.storage.block;

import java.util.Date;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.image.ContainerFormat;
import com.github.narcissujsk.openstackjsk.model.image.DiskFormat;
import com.github.narcissujsk.openstackjsk.model.storage.block.Volume.Status;

/**
 * Represents an action state when uploading a volume to the image service
 * 
 * @author Jeremy Unruh
 */
public interface VolumeUploadImage extends ModelEntity {

    /**
     * @return the identifier for this transactions
     */
    String getId();
    
    /**
     * @return the display description
     */
    String getDisplayDescription();

    /**
     * @return the last update date
     */
    Date getUpdatedAt();
    
    /**
     * @return the current status
     */
    Status getStatus();
    
    /**
     * @return the assigned image identifier
     */
    String getImageId();
    
    /**
     * @return the image name
     */
    String getImageName();
    
    /**
     * @return the container format
     */
    ContainerFormat getContainerFormat();
    
    /**
     * @return the overall size
     */
    int getSize();
    
    /**
     * @return the disk format
     */
    DiskFormat getDiskFormat();
    
    
}
