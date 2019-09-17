package com.github.narcissujsk.openstackjsk.model.magnum;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.magnum.Container;
import com.github.narcissujsk.openstackjsk.openstack.common.GenericLink;
import com.github.narcissujsk.openstackjsk.openstack.magnum.MagnumEnvironment;


public interface ContainerBuilder extends Builder<ContainerBuilder, com.github.narcissujsk.openstackjsk.model.magnum.Container> {
    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Container#getStatus
     */
    ContainerBuilder status(String status);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Container#getUuid
     */
    ContainerBuilder uuid(String uuid);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Container#getLinks
     */
    ContainerBuilder links(List<GenericLink> links);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Container#getImage
     */
    ContainerBuilder image(String image);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Container#getEnvironment
     */
    ContainerBuilder environment(MagnumEnvironment environment);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Container#getCommand
     */
    ContainerBuilder command(String command);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Container#getMemory
     */
    ContainerBuilder memory(String memory);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Container#getBayUuid
     */
    ContainerBuilder bayUuid(String bayUuid);

    /**
     * @see Container#getName
     */
    ContainerBuilder name(String name);

}
