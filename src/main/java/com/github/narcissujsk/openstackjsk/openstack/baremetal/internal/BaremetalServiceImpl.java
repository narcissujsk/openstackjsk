package com.github.narcissujsk.openstackjsk.openstack.baremetal.internal;

import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.baremetal.*;


public class BaremetalServiceImpl extends BaseBaremetalServices implements BaremetalService {


    @Override
    public NodeService nodes() {
        return Apis.get(NodeService.class);
    }

    @Override
    public IronicPortService ports() {
        return Apis.get(IronicPortService.class);
    }

    @Override
    public IronicPortgroupService portgroups() {
        return Apis.get(IronicPortgroupService.class);
    }

    @Override
    public IronicVolumeService volume() {
        return Apis.get(IronicVolumeService.class);
    }


}
