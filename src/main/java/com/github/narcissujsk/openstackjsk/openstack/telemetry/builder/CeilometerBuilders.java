package com.github.narcissujsk.openstackjsk.openstack.telemetry.builder;


import com.github.narcissujsk.openstackjsk.model.telemetry.builder.*;
import com.github.narcissujsk.openstackjsk.openstack.telemetry.domain.*;

/**
 * The Ceilometer V3 Builders
 */
public class CeilometerBuilders implements TelemetryBuilders {

    @Override
    public AlarmBuilder alarm() {
        return CeilometerAlarm.builder();
    }
}
