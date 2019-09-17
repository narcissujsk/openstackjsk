package com.github.narcissujsk.openstackjsk.model.network.ext;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.narcissujsk.openstackjsk.model.network.ext.FlowClassifier;

/**
 * Ethertype values used by {@link FlowClassifier}
 */
public enum Ethertype {

    IPv4,
    IPv6,
    UNRECOGNIZED;

    @JsonCreator
    public static Ethertype forValue(String value) {
        if (value != null)
        {
            for (Ethertype s : Ethertype.values()) {
                if (s.name().equalsIgnoreCase(value)) {
                    return s;
                }
            }
        }
        return UNRECOGNIZED;
    }
}
