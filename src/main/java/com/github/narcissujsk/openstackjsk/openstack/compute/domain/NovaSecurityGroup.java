package com.github.narcissujsk.openstackjsk.openstack.compute.domain;

import com.github.narcissujsk.openstackjsk.model.compute.SecurityGroup;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("security_groups")
public class NovaSecurityGroup implements SecurityGroup {

    private static final long serialVersionUID = 1L;
    private String name;
    
    @Override
    public String getName() {
        return name;
    }

}
