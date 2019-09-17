package com.github.narcissujsk.openstackjsk.openstack.sahara.domain;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.sahara.ClusterTemplate;

import com.fasterxml.jackson.annotation.JsonUnwrapped;


/**
 * An OpenStack Sahara
 * Unwrap the root name of ClusterTemplate when serialized into json request 
 * 
 * @author Ekasit Kijsipongse
 */
public class SaharaClusterTemplateUnwrapped implements ModelEntity {

	private static final long serialVersionUID = 1L;
	
        @JsonUnwrapped
        //@JsonProperty("cluster_template")
	private ClusterTemplate template;

        public SaharaClusterTemplateUnwrapped(ClusterTemplate template) {
           this.template = template;
        }

        public ClusterTemplate getTemplate() { // need for serialization
           return template;
        }
}
