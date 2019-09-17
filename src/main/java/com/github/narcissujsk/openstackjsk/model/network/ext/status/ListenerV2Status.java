package com.github.narcissujsk.openstackjsk.model.network.ext.status;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.network.ext.status.LbPoolV2Status;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.ext.LoadBalancerV2StatusTree.NeutronListenerV2Status;

import java.util.List;

@JsonDeserialize(as = NeutronListenerV2Status.class)
public interface ListenerV2Status extends ModelEntity {
    /**
     * The name of the listener
     * @return name
     */
    public String getName();

    /**
     * The id of the listener
     * @return id
     */
    public String getId();

    /**
     * The operating status of the listener
     * @return operating status
     */
    public String getOperatingStatus();

    /**
     * The provisioning status of the listener
     * @return provisioning status
     */
    public String getProvisioningStatus();

    /**
     * The statuses of the pools associated with this listener
     * @return list of the status of the pools
     */
    public List<LbPoolV2Status> getLbPoolV2Statuses();
}
