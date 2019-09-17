package com.github.narcissujsk.openstackjsk.openstack.compute.internal.ext;

import com.github.narcissujsk.openstackjsk.api.compute.ext.HypervisorService;
import com.github.narcissujsk.openstackjsk.model.compute.ext.Hypervisor;
import com.github.narcissujsk.openstackjsk.model.compute.ext.HypervisorStatistics;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.ext.ExtHypervisor;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.ext.ExtHypervisor.Hypervisors;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.ext.ExtHypervisorStatistics;
import com.github.narcissujsk.openstackjsk.openstack.compute.internal.BaseComputeServices;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Implementation for the OSHypervisors.
 */
public class HypervisorServiceImpl extends BaseComputeServices implements HypervisorService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Hypervisor> list() {
        return get(Hypervisors.class, "/os-hypervisors/detail").execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HypervisorStatistics statistics() {
        return get(ExtHypervisorStatistics.class, "/os-hypervisors/statistics").execute();
    }

    /**
     * <p>Description:Get the specified Hypervisor by ID</p>
     * <p>Author:Wang Ting/王婷</p>
     *
     * @param hypervisorId the UUID of the hypervisor
     * @return the hypervisor
     */
    @Override
    public Hypervisor get(String hypervisorId) {
        checkNotNull(hypervisorId);
        return get(ExtHypervisor.class, uri("/os-hypervisors/%s", hypervisorId)).execute();
    }
}
