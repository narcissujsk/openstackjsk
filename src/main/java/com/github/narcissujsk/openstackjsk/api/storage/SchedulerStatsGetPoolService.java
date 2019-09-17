package com.github.narcissujsk.openstackjsk.api.storage;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.openstack.storage.block.domain.VolumeBackendPool;

import java.util.List;

/**
 * Scheduler Stats Service for Cinder block storage.
 *
 * @author chenguofeng
 */
public interface SchedulerStatsGetPoolService extends RestService {
    /**
     * Lists all Volumes back-end storage pools.
     *
     * @return a list of all Volumes back-end storage pools
     */
    List<? extends VolumeBackendPool> pools();

    List<? extends VolumeBackendPool> poolsDetail();


}
