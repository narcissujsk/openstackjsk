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

import com.github.narcissujsk.openstackjsk.api.networking.ext.FlowClassifierService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.PortChainService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.PortPairGroupService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.PortPairService;
import com.github.narcissujsk.openstackjsk.common.RestService;

/**
 * Service Function Chain Operations API
 *
 * @author Dmitry Gerenrot
 *
 */
public interface ServiceFunctionChainService extends RestService {

    /**
     * @return the Flow Classifier Service API
     */
    FlowClassifierService flowclassifiers();

    /**
     * @return the Port Pair Service API
     */
    PortPairService portpairs();

    /**
     * @return the Port Pair Service API
     */
    PortPairGroupService portpairgroups();

    /**
     * @return the Port Chain Service API
     */
    PortChainService portchains();
}
