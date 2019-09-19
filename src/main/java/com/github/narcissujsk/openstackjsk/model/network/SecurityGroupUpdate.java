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
package com.github.narcissujsk.openstackjsk.model.network;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.network.builder.NetSecurityGroupUpdateBuilder;

/**
 * The Interface SecurityGroupUpdate.
 *
 * Created by Ayberk CAL on 17.03.2017.
 */
public interface SecurityGroupUpdate extends ModelEntity, Buildable<NetSecurityGroupUpdateBuilder> {

    /**
     * Gets the name.
     *
     * @return the name
     */
    String getName();

    /**
     * Gets the description.
     *
     * @return the description
     */
    String getDescription();

    /**
     * Gets the spesific Id.
     *
     * @return the Id
     */
    String getId();

}
