package com.github.narcissujsk.openstackjsk.openstack.networking.domain.ext.LoadBalancerV2StatusTree;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;
import com.github.narcissujsk.openstackjsk.model.network.ext.status.MemberV2Status;

/**
 * An object to hold status of lbaas v2 member
 * @author emjburns
 */
@JsonRootName("members")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NeutronMemberV2Status extends Status implements MemberV2Status {

    @JsonProperty("protocol_port")
    private Integer protocolPort;

    @JsonProperty("address")
    private String address;

    public Integer getProtocolPort(){
        return protocolPort;
    }

    public String getAddress(){
        return address;
    }

    @Override
    public String toString(){
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("protocolPort", protocolPort)
                .add("address", address)
                .add("operatingStatus", operatingStatus)
                .add("provisioningStatus", provisioningStatus)
                .toString();
    }
}
