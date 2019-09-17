package com.github.narcissujsk.openstackjsk.openstack.compute.domain;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
/**
 * Adds a host to an aggregate.
 * @author liujunpeng
 *
 */
@JsonRootName("add_host")
public class AggregateAddHost implements ModelEntity {

	
	private static final long serialVersionUID = 1L;
	/**
	 * host id
	 */
	@JsonProperty("host")
	String host;
	/**
	 * 
	 * @param host
	 * @return AggregateAddHost
	 */
	public  AggregateAddHost(String host){
		this.host=host;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	
}
