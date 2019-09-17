package com.github.narcissujsk.openstackjsk.model.telemetry;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

/**
 * The event’s Traits contain most of the details of the event.
 * Traits are typed, and can be strings, ints, floats, or datetime
 *
 * @author Miroslav Lacina
 */
public interface Trait extends ModelEntity {

    /**
     * @return name of Trait
     */
    String getName();

    /**
     * @return data type of Trait
     */
    String getType();

    /**
     * @return value of Trait
     */
    String getValue();

}
