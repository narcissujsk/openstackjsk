package com.github.narcissujsk.openstackjsk.openstack.storage.block.domain;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("os-force_delete")
public class ForceDeleteAction implements ModelEntity {

	private static final long serialVersionUID = 1L;

	public ForceDeleteAction() { }
}
