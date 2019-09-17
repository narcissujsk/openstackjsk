package com.github.narcissujsk.openstackjsk.model.identity.v3.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.identity.v3.Region;

public interface RegionBuilder extends Builder<RegionBuilder, Region> {

    /**
     * @see Region#getId()
     */
    RegionBuilder id(String id);

    /**
     * @see Region#getDescription()
     */
    RegionBuilder description(String description);

    /**
     * @see Region#getParentRegionId()
     */
    RegionBuilder parentRegionId(String parentRegionId);

}
