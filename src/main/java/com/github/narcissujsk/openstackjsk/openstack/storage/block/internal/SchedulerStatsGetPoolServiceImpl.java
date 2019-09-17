package com.github.narcissujsk.openstackjsk.openstack.storage.block.internal;

import com.github.narcissujsk.openstackjsk.api.storage.SchedulerStatsGetPoolService;
import com.github.narcissujsk.openstackjsk.openstack.storage.block.domain.CinderBackendStoragePool;
import com.github.narcissujsk.openstackjsk.openstack.storage.block.domain.VolumeBackendPool;

import java.util.List;

public class SchedulerStatsGetPoolServiceImpl extends BaseBlockStorageServices implements SchedulerStatsGetPoolService {

    @Override
    public List<? extends VolumeBackendPool> pools() {
        return list(false);
    }

    @Override
    public List<? extends VolumeBackendPool> poolsDetail() {
        return list(true);
    }

    private List<? extends VolumeBackendPool> list(boolean detail) {
        return get(CinderBackendStoragePool.VolumeBackendPools.class, uri("/scheduler-stats/get_pools"))
                .param("detail" , detail)
                .execute()
                .getList();
    }
}