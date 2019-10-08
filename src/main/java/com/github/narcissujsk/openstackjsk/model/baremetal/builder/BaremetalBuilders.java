package com.github.narcissujsk.openstackjsk.model.baremetal.builder;

public interface BaremetalBuilders {

     NodeCreateBuilder node();

     IronicPortBuilder port();

     IronicPortgroupBuilder portgroup();

    ConnectorBuilder connector();
    TargetBuilder target();
}
