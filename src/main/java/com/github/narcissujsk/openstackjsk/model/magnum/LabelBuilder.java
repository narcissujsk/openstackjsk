package com.github.narcissujsk.openstackjsk.model.magnum;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.magnum.Label;

public interface LabelBuilder extends Builder<LabelBuilder, com.github.narcissujsk.openstackjsk.model.magnum.Label> {
    /**
     * @see Label#getKey
     */
    LabelBuilder key(String key);

}
