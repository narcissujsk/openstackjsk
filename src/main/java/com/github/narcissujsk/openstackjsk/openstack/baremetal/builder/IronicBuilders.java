package com.github.narcissujsk.openstackjsk.openstack.baremetal.builder;

import com.github.narcissujsk.openstackjsk.model.baremetal.builder.*;
import com.github.narcissujsk.openstackjsk.model.compute.builder.ComputeBuilders;
import com.github.narcissujsk.openstackjsk.openstack.baremetal.domain.*;


public class IronicBuilders implements BaremetalBuilders {
    private BaremetalBuilders IronicBuilders() {
        return this;
    }

    @Override
    public NodeCreateBuilder node() {
        return IronicNodeCreate.builder();
    }

    @Override
    public IronicPortBuilder port() {
        return IronicPort.builder();
    }

    @Override
    public IronicPortgroupBuilder portgroup() {
        return IronicPortgroup.builder();
    }

    @Override
    public ConnectorBuilder connector() {
        return VolumeConnector.builder();
    }

    @Override
    public TargetBuilder target() {
        return VolumeTarget.builder();
    }
}
