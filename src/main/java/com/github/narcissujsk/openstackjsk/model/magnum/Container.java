package com.github.narcissujsk.openstackjsk.model.magnum;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.magnum.ContainerBuilder;
import com.github.narcissujsk.openstackjsk.openstack.common.GenericLink;
import com.github.narcissujsk.openstackjsk.openstack.magnum.MagnumEnvironment;

public interface Container extends ModelEntity, Buildable<ContainerBuilder> {
    /**
     * Gets status
     * 
     * @return status
     */
    String getStatus();

    /**
     * Gets uuid
     * 
     * @return uuid
     */
    String getUuid();

    /**
     * Gets links
     * 
     * @return links
     */
    List<GenericLink> getLinks();

    /**
     * Gets image
     * 
     * @return image
     */
    String getImage();

    /**
     * Gets environment
     * 
     * @return environment
     */
    MagnumEnvironment getEnvironment();

    /**
     * Gets command
     * 
     * @return command
     */
    String getCommand();

    /**
     * Gets memory
     * 
     * @return memory
     */
    String getMemory();

    /**
     * Gets bayUuid
     * 
     * @return bayUuid
     */
    String getBayUuid();

    /**
     * Gets name
     * 
     * @return name
     */
    String getName();

}