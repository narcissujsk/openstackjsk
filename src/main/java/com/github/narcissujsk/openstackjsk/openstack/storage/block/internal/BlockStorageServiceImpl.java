package com.github.narcissujsk.openstackjsk.openstack.storage.block.internal;

import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.storage.BlockQuotaSetService;
import com.github.narcissujsk.openstackjsk.api.storage.BlockStorageService;
import com.github.narcissujsk.openstackjsk.api.storage.BlockVolumeBackupService;
import com.github.narcissujsk.openstackjsk.api.storage.BlockVolumeService;
import com.github.narcissujsk.openstackjsk.api.storage.BlockVolumeSnapshotService;
import com.github.narcissujsk.openstackjsk.api.storage.CinderZoneService;
import com.github.narcissujsk.openstackjsk.api.storage.SchedulerStatsGetPoolService;
import com.github.narcissujsk.openstackjsk.api.storage.ext.BlockStorageServiceService;
import com.github.narcissujsk.openstackjsk.model.storage.block.BlockLimits;
import com.github.narcissujsk.openstackjsk.openstack.storage.block.domain.CinderBlockLimits;

/**
 * Block Storage (Cinder) Service Operation implementation
 * 
 * @author Jeremy Unruh
 */
public class BlockStorageServiceImpl extends BaseBlockStorageServices implements BlockStorageService {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BlockVolumeService volumes() {
		return Apis.get(BlockVolumeService.class);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BlockVolumeSnapshotService snapshots() {
		return Apis.get(BlockVolumeSnapshotService.class);
	}

	/**
	 * {@inheritDoc}
	 */
    @Override
    public BlockLimits getLimits() {
        return get(CinderBlockLimits.class, "/limits").execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockQuotaSetService quotaSets() {
        return Apis.get(BlockQuotaSetService.class);
    }

    @Override
    public CinderZoneService zones()
    {
       return Apis.get(CinderZoneService.class); 
    }

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchedulerStatsGetPoolService schedulerStatsPools() { return Apis.get(SchedulerStatsGetPoolService.class); }

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BlockVolumeBackupService backups() { 
		return Apis.get(BlockVolumeBackupService.class); 
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BlockStorageServiceService services() {
		return Apis.get(BlockStorageServiceService.class);
	}

}
