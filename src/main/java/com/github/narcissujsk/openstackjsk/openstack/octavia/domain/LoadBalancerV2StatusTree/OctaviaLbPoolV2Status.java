package com.github.narcissujsk.openstackjsk.openstack.octavia.domain.LoadBalancerV2StatusTree;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;
import com.github.narcissujsk.openstackjsk.model.octavia.status.HealthMonitorV2Status;
import com.github.narcissujsk.openstackjsk.model.octavia.status.LbPoolV2Status;
import com.github.narcissujsk.openstackjsk.model.octavia.status.MemberV2Status;

import java.util.List;

/**
 * An object to hold status of lbaas v2 loadbalancer pool
 * @author wei
 */
@JsonRootName("pools")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OctaviaLbPoolV2Status extends Status implements LbPoolV2Status {

    @JsonProperty("name")
    private String name;

    @JsonProperty("members")
    private List<MemberV2Status> memberStatuses;

    @JsonProperty("healthmonitor")
    private HealthMonitorV2Status healthMonitorStatus;

    @Override
    public List<MemberV2Status> getMemberStatuses(){
        return memberStatuses;
    }

    @Override
    public HealthMonitorV2Status getHeathMonitorStatus(){
        return healthMonitorStatus;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("name", name)
                .add("memberStatuses", memberStatuses)
                .add("healthMonitorStatus", healthMonitorStatus)
                .add("operatingStatus", operatingStatus)
                .add("provisioningStatus", provisioningStatus)
                .toString();
    }
}
