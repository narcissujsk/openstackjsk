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
package com.github.narcissujsk.openstackjsk.api.senlin;

import com.github.narcissujsk.openstackjsk.model.senlin.ClusterPolicy;

import java.util.List;

/**
 * This interface defines all methods for the manipulation of ClusterPolicy
 * 
 * @author lion
 * 
 */
public interface SenlinClusterPolicyService {
	
	/**
	 * Gets a list of currently existing {@link ClusterPolicy}s.
	 * 
	 * @return the list of {@link ClusterPolicy}s
	 */
	List<? extends ClusterPolicy> list(String clusterID);

	/**
	 * returns details of a {@link ClusterPolicy}.
	 *
	 * @param clusterID
	 *            Id of Cluster
	 * @param policyID
	 *            Id of {@link ClusterPolicy}
	 * @return ClusterPolicy
	 */
	ClusterPolicy get(String clusterID, String policyID);
}
