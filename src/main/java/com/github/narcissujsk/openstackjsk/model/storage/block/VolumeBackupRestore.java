package com.github.narcissujsk.openstackjsk.model.storage.block;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

public interface VolumeBackupRestore extends ModelEntity{
	
	/**
     * @return the UUID for a backup
     */
    String getBackupId();
	
    /**
     * @return indicates the volume identifier of the volume being transfer
     */
    String getVolumeId();
    
    /**
     * @return the name of the transfer
     */
    String getName();

}
