package com.github.narcissujsk.openstackjsk.openstack.baremetal.builder;

import com.github.narcissujsk.openstackjsk.model.baremetal.builder.BaremetalBuilders;
import com.github.narcissujsk.openstackjsk.model.baremetal.builder.IronicPortBuilder;
import com.github.narcissujsk.openstackjsk.model.baremetal.builder.IronicPortgroupBuilder;
import com.github.narcissujsk.openstackjsk.model.baremetal.builder.NodeCreateBuilder;
import com.github.narcissujsk.openstackjsk.model.compute.builder.ComputeBuilders;
import com.github.narcissujsk.openstackjsk.openstack.baremetal.domain.IronicNodeCreate;
import com.github.narcissujsk.openstackjsk.openstack.baremetal.domain.IronicPort;
import com.github.narcissujsk.openstackjsk.openstack.baremetal.domain.IronicPortgroup;


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
}
