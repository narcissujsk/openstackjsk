package com.github.narcissujsk.openstackjsk.openstack.senlin.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.narcissujsk.openstackjsk.model.senlin.ActionID;

/**
 * This is a model of a senlinAction. It uses Jackson annotations for
 * (de)serialization into JSON format
 * 
 * @author lion
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SenlinActionID implements ActionID {
	private static final long serialVersionUID = -1125919503657762374L;

	@JsonProperty("action")
	private String action;

	@Override
	public String getActionID() {
		return action;
	}

	@Override
	public String toString() {
		return "SenlinActionID{" +
				"action='" + action + '\'' +
				'}';
	}
}
