package com.github.narcissujsk.openstackjsk.openstack.compute.domain;

import com.github.narcissujsk.openstackjsk.model.compute.ServerPassword;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Administrative password
 * 
 * @author taemin
 *
 */
public class AdminPass implements ServerPassword {

    private static final long serialVersionUID = 1L;
    @JsonProperty
    private String adminPass;
    
    /**
     * {@inheritDoc}
     */
    @Override
    public String getPassword() {
        return adminPass;
    }
    
    
}
