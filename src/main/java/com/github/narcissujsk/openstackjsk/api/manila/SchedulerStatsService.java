package com.github.narcissujsk.openstackjsk.api.manila;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.manila.BackendStoragePool;

import java.util.List;

/**
 * Scheduler Stats Service for Manila Shared Filesystems.
 *
 * @author Daniel Gonzalez Nothnagel
 */
public interface SchedulerStatsService extends RestService {
    /**
     * Lists all back-end storage pools.
     *
     * @return a list of all back-end storage pools
     */
    List<? extends BackendStoragePool> pools();

    /**
     * Lists all storage pools for a back end, with details.
     * @return a list of all back-end storage pools with details
     */
    List<? extends BackendStoragePool> poolsDetail();
}
