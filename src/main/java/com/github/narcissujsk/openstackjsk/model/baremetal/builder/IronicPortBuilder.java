package com.github.narcissujsk.openstackjsk.model.baremetal.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.baremetal.Port;


public interface IronicPortBuilder extends Builder<IronicPortBuilder, Port> {


    IronicPortBuilder address(String address);


    IronicPortBuilder nodeUuid(String nodeUuid);
	

}
