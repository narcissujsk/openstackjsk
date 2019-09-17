package com.github.narcissujsk.openstackjsk.model.tacker;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.tacker.builder.VnfUpdateBuilder;
import com.github.narcissujsk.openstackjsk.openstack.tacker.domain.VnfUpdateAttributes;

/**
 * A Builder to Update Firewall of FwaaS
 * 
 * @author Vishvesh Deshmukh
 */
public interface VnfUpdate extends ModelEntity, Buildable<VnfUpdateBuilder> {

	/**
	 * @return attributes : VnfUpdateAttributes
	 */
	VnfUpdateAttributes getAttributes();
}
