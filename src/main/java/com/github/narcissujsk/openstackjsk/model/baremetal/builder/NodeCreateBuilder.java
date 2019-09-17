package com.github.narcissujsk.openstackjsk.model.baremetal.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.baremetal.*;

/**
 * Builds a Server used for a Create Action
 * @author Jeremy Unruh
 */
public interface NodeCreateBuilder extends Buildable.Builder<NodeCreateBuilder, NodeCreate> {

    /**
     * @see Node#getName()
     */
    NodeCreateBuilder name(String name);


    NodeCreateBuilder driver(String driver);


}
