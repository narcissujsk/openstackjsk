package com.github.narcissujsk.openstackjsk.model.identity.v3;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.identity.v3.builder.RegionBuilder;

public interface Region extends ModelEntity, Buildable<RegionBuilder> {

    /**
     * @return the user-defined id of the region
     */
    String getId();

    /**
     * @return the description of the region
     */
    String getDescription();

    /**
     * @return the id of the parent region
     */
    String getParentRegionId();

}
