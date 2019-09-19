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
package com.github.narcissujsk.openstackjsk.model.heat;

import java.util.Map;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;

/**
 * This interface describes <code>adopt_stack_data</code> element. It is used
 * for stack adoption and as a return value for stack abandoning. All getters
 * map to the possible return values of
 * <code> Delete /v1/{tenant_id}/stacks/{stack_name}/{stack_id}/abandon</code>
 *
 * @see https://developer.openstack.org/api-ref/orchestration/v1
 *
 * @author Ales Kemr
 */
public interface AdoptStackData extends ModelEntity {

    /**
     * Returns stack action, e.g. CREATE
     * 
     * @return stack action
     */
    String getAction();

    /**
     * Returns the id of the stack
     *
     * @return the id of the stack
     */
    String getId();

    /**
     * Returns the name of the stack
     *
     * @return the name of the stack
     */
    String getName();

    /**
     * Returns the status of the stack
     *
     * @return the status of the stack
     */
    String getStatus();

    /**
     * Returns stack template as a map
     *
     * @return stack template as a map
     */
    Map<String, Object> getTemplate();

    /**
     * Returns map of existing resources, to be adopted into the stack
     *
     * @return Map of existing resources to be adopted into the stack
     */
    Map<String, Map<String, Object>> getResources();
}
