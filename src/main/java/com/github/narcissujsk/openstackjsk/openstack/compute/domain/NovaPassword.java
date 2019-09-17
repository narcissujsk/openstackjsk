package com.github.narcissujsk.openstackjsk.openstack.compute.domain;

import com.github.narcissujsk.openstackjsk.model.compute.ServerPassword;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * A model class to return the password of the server
 * 
 * @author vinod borole
 *
 */
public class NovaPassword implements ServerPassword {

    private static final long serialVersionUID = 1L;
    @JsonProperty
    private String password;
    
    /**
     * {@inheritDoc}
     */
    @Override
    public String getPassword() {
        return password;
    }
    
    
}
