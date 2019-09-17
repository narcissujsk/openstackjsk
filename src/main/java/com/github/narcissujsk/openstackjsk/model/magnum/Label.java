package com.github.narcissujsk.openstackjsk.model.magnum;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.magnum.LabelBuilder;

public interface Label extends ModelEntity, Buildable<LabelBuilder> {
    /**
     * Gets key
     * 
     * @return key
     */
    String getKey();

}
