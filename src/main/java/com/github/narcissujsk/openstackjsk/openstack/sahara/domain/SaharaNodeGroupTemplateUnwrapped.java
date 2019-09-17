package com.github.narcissujsk.openstackjsk.openstack.sahara.domain;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.sahara.NodeGroupTemplate;

import com.fasterxml.jackson.annotation.JsonUnwrapped;


/**
 * An OpenStack Sahara
 * Unwrap the root name of NodeGroupTemplate when serialized into json request 
 * 
 * @author Ekasit Kijsipongse
 */
public class SaharaNodeGroupTemplateUnwrapped implements ModelEntity {

	private static final long serialVersionUID = 1L;
	
        @JsonUnwrapped
        //@JsonProperty("node_group_template")
	private NodeGroupTemplate template;

        public SaharaNodeGroupTemplateUnwrapped(NodeGroupTemplate template) {
           this.template = template;
        }

        public NodeGroupTemplate getTemplate() { // need for serialization
           return template;
        }
}
