package com.github.narcissujsk.openstackjsk.model.network.ext.status;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.ext.LoadBalancerV2StatusTree.NeutronMemberV2Status;

/**
 * The status of an lbaas v2 member
 * @author emjburns
 */
@JsonDeserialize(as = NeutronMemberV2Status.class)
public interface MemberV2Status extends ModelEntity {
    /**
     * The id of the member
     * @return id
     */
    public String getId();

    /**
     * The address of the memeber
     * @return address
     */
    public String getAddress();

    /**
     * The protocol port of the member
     * @return protocol port
     */
    public Integer getProtocolPort();

    /**
     * The operating status of the member
     * @return operating status
     */
    public String getOperatingStatus();

    /**
     * The provisioning status of the member
     * @return provisioning status
     */
    public String getProvisioningStatus();
}
