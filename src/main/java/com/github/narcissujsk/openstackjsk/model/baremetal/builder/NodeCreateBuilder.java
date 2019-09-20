package com.github.narcissujsk.openstackjsk.model.baremetal.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.baremetal.*;


public interface NodeCreateBuilder extends Buildable.Builder<NodeCreateBuilder, NodeCreate> {


    NodeCreateBuilder name(String name);


    NodeCreateBuilder driver(String driver);


}
