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
package com.github.narcissujsk.openstackjsk.model.network.ext.builder;

import java.util.Map;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.network.ext.Ethertype;
import com.github.narcissujsk.openstackjsk.model.network.ext.FlowClassifier;

/**
 * 	A builder to create a flow classifier
 * @author Dmitry Gerenrot
 *
 */
public interface FlowClassifierBuilder extends Builder<FlowClassifierBuilder, FlowClassifier> {

    /**
     * @param id : Flow Classifier identifer
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder id(String id);

    /**
     * @param name : Human readable name for the flow classifier
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder name(String name);

    /**
     * @param projectId : Project (tenant) identifier
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder projectId(String projectId);

    /**
     * @param description : Human readable description for the flow classifier
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder description(String description);

    /**
     *
     * @param protocol : Short name for the protocol (TCP, UDP, etc)
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder protocol(String protocol);

    /**
     * @param sourcePortRangeMin : Minimum value for the source port, converted to String
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder sourcePortRangeMin(Integer sourcePortRangeMin);

    /**
     * @param sourcePortRangeMax : Maximum value for the source port, converted to String
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder sourcePortRangeMax(Integer sourcePortRangeMax);

    /**
     * @param destinationPortRangeMin : Minimum value for the destination port, converted to String
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder destinationPortRangeMin(Integer destinationPortRangeMin);

    /**
     * @param destinationPortRangeMax : Maximum value for the destination port, converted to String
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder destinationPortRangeMax(Integer destinationPortRangeMax);

    /**
     * @param sourceIpPrefix
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder sourceIpPrefix(String sourceIpPrefix);

    /**
     * @param destinationIpPrefix
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder destinationIpPrefix(String destinationIpPrefix);

    /**
     * @param logicalSourcePort
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder logicalSourcePort(String logicalSourcePort);

    /**
     * @param logicalDestinationPort
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder logicalDestinationPort(String logicalDestinationPort);

    /**
     * @param l7Parameters
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder l7Parameters(Map<String, String> l7Parameters);

    /**
     * @param ethertype
     * @return FlowClassifierBuilder
     */
    FlowClassifierBuilder ethertype(Ethertype ethertype);
}
