/*
 * 
 */
package com.github.narcissujsk.openstackjsk.model.compute;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.common.Link;
import com.github.narcissujsk.openstackjsk.model.compute.builder.FlavorBuilder;

/**
 * An OpenStack Flavor which is a template used for configuration against running Instances
 * 
 * @author Jeremy Unruh
 */
public interface Flavor extends ModelEntity, Buildable<FlavorBuilder> {

	/**
	 * @return the id for this flavor
	 */
	String getId();
	
	/**
	 * @return the descriptive name of the flavor
	 */
	String getName();
	
	/**
	 * @return the Memory in MB for the flavor
	 */
	int getRam();
	
	/**
	 * @return the Number of VCPUs for the flavor
	 */
	int getVcpus();
	
	/**
	 * @return the size of the local disk in GB
	 */
	int getDisk();
	
	/**
	 * @return the Swap space in MB
	 */
	int getSwap();
	
	/**
	 * @return the RX/TX factor
	 */
	float getRxtxFactor();
	
	/**
	 * Gets the ephemeral.
	 *
	 * @return the ephemeral
	 */
	int getEphemeral();
	
	/**
	 * Gets the rxtx quota.
	 *
	 * @return the rxtx quota
	 */
	int getRxtxQuota();
	
	/**
	 * Gets the rxtx cap.
	 *
	 * @return the rxtx cap
	 */
	int getRxtxCap();
	
	/**
	 * Checks if is public.
	 *
	 * @return true, if is public
	 */
	Boolean isPublic();
	
	/**
	 * Checks if is disabled.
	 *
	 * @return true, if is disabled
	 */
	Boolean isDisabled();
	
	/**
	 * Gets the links.
	 *
	 * @return the links
	 */
	List<? extends Link> getLinks();
	
}
