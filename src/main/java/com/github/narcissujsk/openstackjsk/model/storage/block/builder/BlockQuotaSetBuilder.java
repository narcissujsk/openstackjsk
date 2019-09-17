package com.github.narcissujsk.openstackjsk.model.storage.block.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.storage.block.BlockQuotaSet;

/**
 * Builder for a QuotaSet model class.
 * 
 * @author Jeremy Unruh
 */
public interface BlockQuotaSetBuilder extends Builder<BlockQuotaSetBuilder, BlockQuotaSet> {

    /**
     * Volumes Quota for Block Storage
     * 
     * @param volumes
     * @return volumes consumed in the Block Storage.
     */
    BlockQuotaSetBuilder volumes(int volumes);

    /**
     * Snapshots present in Block Storage
     *
     * @param snapshots
     * @return snapshots present in the Block Storage.
     */
    BlockQuotaSetBuilder snapshots(int snapshots);

    /**
     * Space consumed in gigabytes for Block Storage
     * @param gigabytes
     * @return space consumed in the Block Storage.
     */
    BlockQuotaSetBuilder gigabytes(int gigabytes);
}
