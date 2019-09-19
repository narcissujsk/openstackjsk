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
package com.github.narcissujsk.openstackjsk.openstack.tacker.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;

/**
 *
 * @author Vishvesh Deshmukh
 * @date Aug 11, 2016
 */
@JsonRootName("attributes")
@JsonIgnoreProperties(ignoreUnknown = true)
public class VnfAttributes {

	@JsonProperty("service_type")
	private String serviceType;

	@JsonProperty("param_values")
	private String paramValues;

	@JsonProperty("heat_template")
	private String heatTemplate;

	@JsonProperty("monitoring_policy")
	private String monitoringPolicy;

	@JsonProperty("failure_policy")
	private String failurePolicy;

	public static VnfAttributes create() {
		return new VnfAttributes();
	}

	/**
	 * serviceType to Set..
	 *
	 * @param serviceType the serviceType to set
	 * @return VnfAttributes
	 */
	public VnfAttributes serviceType(String serviceType) {
		this.serviceType = serviceType;
		return this;
	}

	/**
	 * paramValues to Set..
	 *
	 * @param paramValues the paramValues to set
	 * @return VnfAttributes
	 */
	public VnfAttributes paramValues(String paramValues) {
		this.paramValues = paramValues;
		return this;
	}

	/**
	 * heatTemplate to Set..
	 *
	 * @param heatTemplate the heatTemplate to set
	 * @return VnfAttributes
	 */
	public VnfAttributes heatTemplate(String heatTemplate) {
		this.heatTemplate = heatTemplate;
		return this;
	}

	/**
	 * monitoringPolicy to Set..
	 *
	 * @param monitoringPolicy the monitoringPolicy to set
	 * @return VnfAttributes
	 */
	public VnfAttributes monitoringPolicy(String monitoringPolicy) {
		this.monitoringPolicy = monitoringPolicy;
		return this;
	}

	/**
	 * failurePolicy to Set..
	 *
	 * @param failurePolicy the failurePolicy to set
	 * @return VnfAttributes
	 */
	public VnfAttributes failurePolicy(String failurePolicy) {
		this.failurePolicy = failurePolicy;
		return this;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).omitNullValues()
				.add("serviceType", serviceType)
				.add("paramValues", paramValues)
				.add("heatTemplate", heatTemplate)
				.add("monitoringPolicy", monitoringPolicy)
				.add("failurePolicy", failurePolicy)
				.toString();
	}

	/**
	 * @return the serviceType
	 */
	public String getServiceType() {
		return serviceType;
	}

	/**
	 * @return the paramValues
	 */
	public String getParamValues() {
		return paramValues;
	}

	/**
	 * @return the heatTemplate
	 */
	public String getHeatTemplate() {
		return heatTemplate;
	}

	/**
	 * @return the monitoringPolicy
	 */
	public String getMonitoringPolicy() {
		return monitoringPolicy;
	}

	/**
	 * @return the failurePolicy
	 */
	public String getFailurePolicy() {
		return failurePolicy;
	}
}
