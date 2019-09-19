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
package com.github.narcissujsk.openstackjsk.model.magnum;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.magnum.Label;
import com.github.narcissujsk.openstackjsk.model.magnum.PodBuilder;

public interface Pod extends ModelEntity, Buildable<PodBuilder> {
    /**
     * Gets id
     * 
     * @return id
     */
    String getId();

    /**
     * Gets uuid
     * 
     * @return uuid
     */
    String getUuid();

    /**
     * Gets name
     * 
     * @return name
     */
    String getName();

    /**
     * Gets desc
     * 
     * @return desc
     */
    String getDesc();

    /**
     * Gets bayUuid
     * 
     * @return bayUuid
     */
    String getBayUuid();

    /**
     * Gets images
     * 
     * @return images
     */
    List<String> getImages();

    /**
     * Gets labels
     * 
     * @return labels
     */
    Label getLabels();

    /**
     * Gets status
     * 
     * @return status
     */
    String getStatus();

}
