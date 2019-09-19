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
package com.github.narcissujsk.openstackjsk.model.network.ext;

import java.util.Map;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.common.Resource;
import com.github.narcissujsk.openstackjsk.model.network.ext.Ethertype;
import com.github.narcissujsk.openstackjsk.model.network.ext.builder.FlowClassifierBuilder;

/**
 * A Flow Classifier Entity.
 *
 * @author Dmitry Gerenrot.
 *
 */
public interface FlowClassifier extends Resource, Buildable<FlowClassifierBuilder> {

    /**
     * @return description : Human readable description for the flow classifier
     */
    String getDescription();

    /**
     * @return protocol : Short name for the protocol (TCP, UDP, etc)
     */
    String getProtocol();
    /**
     * @return rangeMin : Minimum value for the source port, converted to String
     */
    Integer getSourcePortRangeMin();

    /**
     * @return rangeMax : Maximum value for the source port, converted to String
     */
    Integer getSourcePortRangeMax();

    /**
     * @return rangeMin : Minimum value for the destination port, converted to String
     */
    Integer getDestinationPortRangeMin();

    /**
     * @return rangeMax : Maximum value for the destination port, converted to String
     *
     */
    Integer getDestinationPortRangeMax();

    /**
     * @return sourcePrefix : Prefix for the source ip addresses
     */
    String getSourceIpPrefix();

    /**
     * @return destinationPrefix : Prefix for the destination ip addresses
     */
    String getDestinationIpPrefix();

    /**
     * @return logicalSourcePort : Id of the port pair at the start of the port chain
     */
    String getLogicalSourcePort();

    /**
     * @return logicalDestinationPort : Id of the port pair at the end of the port chain
     */
    String getLogicalDestinationPort();

    /**
     * @return l7Parameters
     */
    Map<String, String> getL7Parameters();

    /**
     * @return ethertype
     */
    Ethertype getEthertype();
}
