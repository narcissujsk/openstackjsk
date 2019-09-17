package com.github.narcissujsk.openstackjsk.model.gbp;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.common.Resource;
import com.github.narcissujsk.openstackjsk.model.gbp.builder.PolicyActionCreateBuilder;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Policy Action Model Entity
 * 
 * @author vinod borole
 */
public interface PolicyAction extends Buildable<PolicyActionCreateBuilder>, Resource {

    public enum PolicyActionProtocol{
        ALLOW,
        REDIRECT,
        COPY,
        LOG,
        QoS,
        UNRECOGNIZED;
        
        @JsonCreator
        public static PolicyActionProtocol forValue(String value) {
            if (value != null)
            {
                for (PolicyActionProtocol s : PolicyActionProtocol.values()) {
                    if (s.name().equalsIgnoreCase(value))
                        return s;
                }
            }
            return PolicyActionProtocol.UNRECOGNIZED;
        }
        
        @JsonValue
        public String value() {
            return name().toLowerCase();
        }
    }
    
    /**
     * Gets the Action value
     *
     * @return the Action value
     */
    String getActionValue();

    /**
     * Gets the Action Type
     *
     * @return the Action Type
     */
    PolicyActionProtocol getActionType();

    /**
     * Is Policy Action shared
     *
     * @return the true if shared and false if not shared
     */
    boolean isShared();

    /**
     * Gets the description
     *
     * @return the description
     */
    String getDescription();

}
  