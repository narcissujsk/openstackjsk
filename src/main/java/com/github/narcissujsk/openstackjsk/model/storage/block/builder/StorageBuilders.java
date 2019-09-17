package com.github.narcissujsk.openstackjsk.model.storage.block.builder;


import com.github.narcissujsk.openstackjsk.model.storage.block.builder.BlockQuotaSetBuilder;
import com.github.narcissujsk.openstackjsk.model.storage.block.builder.VolumeBackupCreateBuilder;
import com.github.narcissujsk.openstackjsk.model.storage.block.builder.VolumeBuilder;
import com.github.narcissujsk.openstackjsk.model.storage.block.builder.VolumeSnapshotBuilder;

/**
 * The Storage builders
 */
public interface StorageBuilders {

    /**
     * The builder which creates a BlockQuotaSet
     *
     * @return the block quota-set builder
     */
    public BlockQuotaSetBuilder blockQuotaSet();

    /**
     * The builder to create a Block Volume
     *
     * @return the volume builder
     */
    public VolumeBuilder volume();

    /**
     * The builder to create a Block Volume Snapshot
     *
     * @return the snapshot builder
     */
    public VolumeSnapshotBuilder volumeSnapshot();
    
    /**
     * The builder to create a volume backup
     * @return the backup creation builder
     */
    public VolumeBackupCreateBuilder volumeBackupCreate();

}
