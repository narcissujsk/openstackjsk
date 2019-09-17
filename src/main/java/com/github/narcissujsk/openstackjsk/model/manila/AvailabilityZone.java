package com.github.narcissujsk.openstackjsk.model.manila;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

/**
 * Represents an availability zone.
 *
 * @author Daniel Gonzalez Nothnagel
 */
public interface AvailabilityZone extends ModelEntity {
    /**
     * @return the name of the availability zone
     */
    String getName();

    /**
     * @return the availability zone ID
     */
    String getId();

    /**
     * @return the date and time stamp when the availability zone was created
     */
    String getCreatedAt();

    /**
     * @return the date and time stamp when the availability zone was updated
     */
    String getUpdatedAt();
}
