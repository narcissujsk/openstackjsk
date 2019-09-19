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
package com.github.narcissujsk.openstackjsk.api.networking.ext;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.network.ext.FlowClassifier;

/**
 *
 * Flow Classifier Service
 *
 * @author Dmitry Gerenrot
 *
 */
public interface FlowClassifierService extends RestService {

    /**
     * Lists flow classifiers for port chains
     *
     * @return the list of flow classifiers
     */
    List<? extends FlowClassifier> list();

    /**
     * Get a flow classifier by id.
     *
     * @param flowClassifierId
     * @return FlowClassifier
     */
    FlowClassifier get(String flowClassifierId);

    /**
     * Update a flow classifier with the given id to match the given update object
     *
     * @param flowClassifierId
     * @param flowClassifier
     * @return flowClassifier : object updated
     */
    FlowClassifier update(String flowClassifierId, FlowClassifier flowClassifier);

    /**
     * Create a flow classifier
     *
     * @param flowClassifier
     * @return flowClassifier : object actually created
     */
    FlowClassifier create(FlowClassifier flowClassifier);

    /**
     * Delete a flow classifier
     *
     * @param flowClassifierId
     * @return the action response
     */
    ActionResponse delete(String flowClassifierId);
}
