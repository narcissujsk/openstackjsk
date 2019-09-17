package com.github.narcissujsk.openstackjsk.openstack.compute.domain;

import java.util.Date;

import com.github.narcissujsk.openstackjsk.model.compute.Fault;

/**
 * A server Fault
 * 
 * @author Jeremy Unruh
 */
public class NovaFault implements Fault {

	private static final long serialVersionUID = 1L;
	private int code;
	private String message;
	private String details;
	private Date created;
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getCode() {
		return code;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getDetails() {
		return details;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date getCreated() {
		return created;
	}

	@Override
	public String toString() {
		return String.format("NovaFault %d: %s", code, message);
	}
}
