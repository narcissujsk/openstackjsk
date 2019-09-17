package com.github.narcissujsk.openstackjsk.model.network.ext.status;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.network.ext.HealthMonitorType;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.ext.LoadBalancerV2StatusTree.NeutronHealthMonitorV2Status;

/**
 * The status of an lbaas v2 heathmonitor
 * @author emjburns
 */
@JsonDeserialize(as = NeutronHealthMonitorV2Status.class)
public interface HealthMonitorV2Status extends ModelEntity {
    /**
     * The id of the healthmonitor
     * @return id
     */
    public String getId();

    /**
     *  The health monitor type
     * @return HealthMonitorType
     */
    public HealthMonitorType getType();

    /**
     * Provisioning status of the health monitor
     * @return provisioningStatus
     */
    public String getProvisioningStatus();
}
