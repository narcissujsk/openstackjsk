package com.github.narcissujsk.openstackjsk.model.telemetry.builder;

import com.github.narcissujsk.openstackjsk.model.telemetry.Alarm;
import com.github.narcissujsk.openstackjsk.model.telemetry.builder.AlarmBuilder;

/**
 * The Ceilometer builders
 */
public interface TelemetryBuilders {

    /**
     * The builder to create an Alarm
     *
     * @return the image builder
     */
    public AlarmBuilder alarm();

}
