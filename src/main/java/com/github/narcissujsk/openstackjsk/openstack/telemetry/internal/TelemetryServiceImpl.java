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
package com.github.narcissujsk.openstackjsk.openstack.telemetry.internal;

import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.telemetry.AlarmService;
import com.github.narcissujsk.openstackjsk.api.telemetry.CapabilitiesService;
import com.github.narcissujsk.openstackjsk.api.telemetry.EventService;
import com.github.narcissujsk.openstackjsk.api.telemetry.MeterService;
import com.github.narcissujsk.openstackjsk.api.telemetry.ResourceService;
import com.github.narcissujsk.openstackjsk.api.telemetry.SampleService;
import com.github.narcissujsk.openstackjsk.api.telemetry.TelemetryService;

/**
 * Telemetry allows collection of Alarms and Measurements
 * 
 * @author Jeremy Unruh
 */
public class TelemetryServiceImpl implements TelemetryService {

    /**
     * {@inheritDoc}
     */
    @Override
    public MeterService meters() {
        return Apis.get(MeterService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlarmService alarms() {
        return Apis.get(AlarmService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventService events() {
        return Apis.get(EventService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SampleService samples() {
        return Apis.get(SampleService.class);
    }

    @Override
    public ResourceService resources() {
        return Apis.get(ResourceService.class);
    }

    @Override
    public CapabilitiesService capabilities() {
        return Apis.get(CapabilitiesService.class);
    }

}
