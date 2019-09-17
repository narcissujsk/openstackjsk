package com.github.narcissujsk.openstackjsk.openstack.telemetry.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.narcissujsk.openstackjsk.model.telemetry.Event;
import com.github.narcissujsk.openstackjsk.model.telemetry.Trait;

import java.util.List;

/**
 * Event represents the state of an object in an OpenStack service
 * at a point in time when something of interest has occurred
 *
 * @author Miroslav Lacina
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CeilometerEvent implements Event {

    private static final long serialVersionUID = 1L;

	@JsonProperty("event_type")
	private String eventType;
    @JsonProperty("generated")
    private String generated;
    @JsonProperty("message_id")
    private String messageId;
    @JsonProperty("traits")
    private List<CeilometerTrait> traits;

    /**
     * {@inheritDoc}
     */
    @Override
    public String getEventType() {
        return eventType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getGenerated() {
        return generated;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getMessageId() {
        return messageId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Trait> getTraits() {
        return traits;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public void setGenerated(String generated) {
        this.generated = generated;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public void setTraits(List<CeilometerTrait> traits) {
        this.traits = traits;
    }

}
