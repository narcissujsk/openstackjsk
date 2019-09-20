package com.github.narcissujsk.openstackjsk.model.baremetal.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.baremetal.Node;
import com.github.narcissujsk.openstackjsk.model.baremetal.NodeCreate;
import com.github.narcissujsk.openstackjsk.model.baremetal.Portgroup;


public interface IronicPortgroupBuilder extends Buildable.Builder<IronicPortgroupBuilder, Portgroup> {

    IronicPortgroupBuilder name(String name);

    IronicPortgroupBuilder address(String driver);

    IronicPortgroupBuilder nodeUuid(String driver);


}
