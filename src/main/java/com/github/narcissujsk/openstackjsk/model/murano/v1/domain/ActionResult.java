package com.github.narcissujsk.openstackjsk.model.murano.v1.domain;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

/**
 * @author Nikolay Mahotkin.
 */
public interface ActionResult extends ModelEntity {
    /**
     * @return true if exception was raised during action execution.
     */
    Boolean isException();

    /**
     * @return the Result object.
     * It might be one of:
     *  - String
     *  - boolean
     *  - int
     *  - float
     *  - List
     *  - Map<String, Object>
     *
     *  depending on Action itself.
     */
    Object getResult();
}
