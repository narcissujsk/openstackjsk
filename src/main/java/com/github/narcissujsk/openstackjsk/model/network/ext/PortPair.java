package com.github.narcissujsk.openstackjsk.model.network.ext;

import java.util.Map;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.common.Resource;
import com.github.narcissujsk.openstackjsk.model.network.ext.builder.PortPairBuilder;

/**
 * A Port Pair Entity.
 *
 * @author Dmitry Gerenrot.
 *
 */
public interface PortPair extends Resource, Buildable<PortPairBuilder> {

    /**
     * @return id : Port Pair  identifer
     */
    String getId();

    /**
     * @return name : Human readable name for the port pair
     */
    String getName();

    /**
     * @return description : Human readable description for the port pair
     */
    String getDescription();

    /**
     * @return egressId : Id for the egress port
     */
    String getEgressId();

    /**
     * @return ingressId : Id for the ingress port
     */
    String getIngressId();

    /**
     * @return Service Function Parameters
     */
    Map<String, String> getServiceFunctionParameters();
}

