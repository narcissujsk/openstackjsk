/*******************************************************************************
 * 	Copyright 2019 ContainX and OpenStack4j
 *
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * 	use this file except in compliance with the License. You may obtain a copy of
 * 	the License at
 *
 * 	    http://www.apache.org/licenses/LICENSE-2.0
 *
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * 	License for the specific language governing permissions and limitations under
 * 	the License.
 *******************************************************************************/
package com.github.narcissujsk.openstackjsk.model.compute;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.compute.Server.Status;

/**
 * Provides simple usage reporting for tenants
 * 
 * @author Jeremy Unruh
 */
public interface SimpleTenantUsage extends ModelEntity {

	/**
	 * @return the total memory usage in MB
	 */
	BigDecimal getTotalMemoryMbUsage();

	/**
	 * @return the total Virtual CPU Usage
	 */
	BigDecimal getTotalVcpusUsage();

	/**
	 * @return the total local GB of data used
	 */
	BigDecimal getTotalLocalGbUsage();

	/**
	 * @return the start date/time
	 */
	Date getStart();

	/**
	 * @return the stop date/time
	 */
	Date getStop();

	/**
	 * @return the tenant the usage is reporting againt
	 */
	String getTenantId();

	/**
	 * @return the total hours of usage
	 */
	String getTotalHours();

	/**
	 * @return the list of usages per tenant server (Null when query was against all tenants)
	 */
	List<? extends ServerUsage> getServerUsages();


	public interface ServerUsage extends Serializable {

		/**
		 * @return the instance id of the server
		 */
		String getInstanceId();

		/**
		 * @return the uptime of the server
		 */
		int getUptime();

		/**
		 * @return the date the server was started or null
		 */
		Date getStartedAt();

		/**
		 * @return the date the server was last stopped or null
		 */
		Date getEndedAt();

		/**
		 * @return the memory used for the server in MB
		 */
		int getMemoryMb();

		/**
		 * @return the tenant assigned to the server
		 */
		String getTenantId();

		/**
		 * @return the state
		 */
		Status getState();

		/**
		 * @return the hours of usage
		 */
		double getHours();

		/**
		 * @return the Virtual CPUs used
		 */
		int getVcpus();

		/**
		 * @return the flavor assigned to the server
		 */
		String getFlavor();

		/**
		 * @return the local disk size in GB
		 */
		int getLocalDiskSize();

		/**
		 * @return the name of the server
		 */
		String getName();
	}

}
