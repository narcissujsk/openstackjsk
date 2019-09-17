package com.github.narcissujsk.openstackjsk.model.murano.v1.domain;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

/**
 * @author Nikolay Mahotkin.
 */
public interface ActionInfo extends ModelEntity {
    /**
     * @return Action name.
     */
    String getName();

    /**
     * @return Action title.
     */
    String getTitle();

    /**
     * @return if action is enabled.
     */
    boolean getEnabled();

    /**
     * @return the action id.
     */
    String getId();
}
