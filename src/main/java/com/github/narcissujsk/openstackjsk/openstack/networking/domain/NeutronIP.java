package com.github.narcissujsk.openstackjsk.openstack.networking.domain;

import com.github.narcissujsk.openstackjsk.model.network.IP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;

/**
 * A Fixed IP Address
 *
 * @author Jeremy Unruh
 */
public class NeutronIP implements IP {

	private static final long serialVersionUID = 1L;

  @JsonProperty("ip_address")
  private String ipAddress;

  @JsonProperty("subnet_id")
  private String subnetId;

  public NeutronIP() { }

  public NeutronIP(String address, String subnetId) {
  	this.ipAddress = address;
  	this.subnetId = subnetId;
  }

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getSubnetId() {
		return subnetId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).omitNullValues().add("ipAddress", ipAddress).add("subnetId", subnetId).toString();
	}

}
