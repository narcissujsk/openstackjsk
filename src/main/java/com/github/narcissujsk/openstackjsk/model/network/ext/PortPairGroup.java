package com.github.narcissujsk.openstackjsk.model.network.ext;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.common.Resource;
import com.github.narcissujsk.openstackjsk.model.network.ext.builder.PortPairGroupBuilder;

/**
 * A Port Pair Group Entity.
 *
 * @author Dmitry Gerenrot.
 *
 */
public interface PortPairGroup extends Resource, Buildable<PortPairGroupBuilder> {

    /**
     * @return description : Human readable description for the port pair group
     */
    String getDescription();

    /**
     * @return list of port pairs in this group
     */
    List<String> getPortPairs();

    /**
     * @return Dictionary of parameters for this group.
     *      Possible keys: lb_fields or service_type. Check openstack documentation.
     */
    Map<String, Object> getPortPairGroupParameters();
}
