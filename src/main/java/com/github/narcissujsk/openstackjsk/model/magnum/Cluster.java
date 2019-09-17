package com.github.narcissujsk.openstackjsk.model.magnum;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.magnum.ClusterBuilder;
import com.github.narcissujsk.openstackjsk.openstack.common.GenericLink;

public interface Cluster extends ModelEntity, Buildable<ClusterBuilder> {
    /**
     * Gets status
     * 
     * @return status
     */
    String getStatus();

    /**
     * Gets clusterTemplateId
     * 
     * @return clusterTemplateId
     */
    String getClusterTemplateId();

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
     * Gets stackId
     * 
     * @return stackId
     */
    String getStackId();

    /**
     * Gets masterCount
     * 
     * @return masterCount
     */
    Integer getMasterCount();

    /**
     * Gets createTimeout
     * 
     * @return createTimeout
     */
    Integer getCreateTimeout();

    /**
     * Gets nodeCount
     * 
     * @return nodeCount
     */
    Integer getNodeCount();

    /**
     * Gets discoveryUrl
     * 
     * @return discoveryUrl
     */
    String getDiscoveryUrl();

    /**
     * Gets keypair
     * 
     * @return keypair
     */
    String getKeypair();

    /**
     * Gets name
     * 
     * @return name
     */
    String getName();

}
