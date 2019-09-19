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
package com.github.narcissujsk.openstackjsk.model.telemetry.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.telemetry.Alarm;
import com.github.narcissujsk.openstackjsk.model.telemetry.Alarm.Type;
import com.github.narcissujsk.openstackjsk.openstack.telemetry.domain.CeilometerAlarm.*;

import java.util.List;
import java.util.Map;

/**
 * An alarm builder
 *
 * @author Martin Belperchinov
 */

public interface AlarmBuilder extends Builder<AlarmBuilder, Alarm> {

	AlarmBuilder name(String name);

	AlarmBuilder okActions(List<String> okActions);

	AlarmBuilder alarmActions(List<String> alarmActions);

	AlarmBuilder type(Type type);

	AlarmBuilder thresholeRule(CeilometerThresholdRule te);

	AlarmBuilder combinationRule(CeilometerCombinationRule ce);

	AlarmBuilder compositeRule(Map<String, Object> cr);

	AlarmBuilder gnocchiResourcesThresholdRule(CeilometerGnocchiResourcesThresholdRule ceilometerGnocchiResourcesThreshold);

	AlarmBuilder gnocchiAggregationByMetricsThresholdRule(CeilometerGnocchiAggregationByMetricsThresholdRule ceilometerGnocchiAggregationByMetricsThreshold);

	AlarmBuilder gnocchiAggregationByResourcesThresholdRule(CeilometerGnocchiAggregationByResourcesThresholdRule ceilometerGnocchiAggregationByResourcesThreshold);

	AlarmBuilder repeatActions(boolean repeatActions);

	AlarmBuilder description(String description);

	AlarmBuilder isEnabled(boolean isEnabled);

	AlarmBuilder insufficientDataActions(List<String> insufficientDataActions) ;


}
