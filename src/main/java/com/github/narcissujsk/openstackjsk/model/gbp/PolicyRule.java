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
package com.github.narcissujsk.openstackjsk.model.gbp;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.common.Resource;
import com.github.narcissujsk.openstackjsk.model.gbp.builder.PolicyRuleBuilder;

/**
 * Policy rule Model Entity
 * 
 * @author vinod borole
 */
public interface PolicyRule extends Resource,Buildable<PolicyRuleBuilder> {

    /**
     * Is policy rule enabled
     *
     * @return True or False
     */
    boolean isEnabled();

    /**
     * Is Policy Rule shared
     *
     * @return the true if shared and false if not shared
     */
    boolean isShared();

    /**
     * Gets the list of Policy actions
     *
     * @return the list of Policy actions
     */
    List<String> getPolicyActions();

    /**
     * Gets the policy classifier Id
     *
     * @return the policy classifier Id
     */
    String getPolicyClassifierId();

    /**
     * Gets the description
     *
     * @return the description
     */
    String getDescription();

}
 