package com.github.narcissujsk.openstackjsk.openstack.sahara.domain;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.sahara.Cluster;

import com.fasterxml.jackson.annotation.JsonUnwrapped;


/**
 * An OpenStack Sahara
 * Unwrap the root name of Cluster when serialized into json request 
 * 
 * @author ekasit.kijsipongse@nectec.or.th
 */
public class SaharaClusterUnwrapped implements ModelEntity {

	private static final long serialVersionUID = 1L;
	
        @JsonUnwrapped
        //@JsonProperty("cluster")
	private Cluster cluster;

        public SaharaClusterUnwrapped(Cluster cluster) {
           this.cluster = cluster;
        }

        public Cluster getCluster() { // need for serialization
           return cluster;
        }
}
