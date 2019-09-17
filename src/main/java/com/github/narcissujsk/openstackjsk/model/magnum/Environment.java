package com.github.narcissujsk.openstackjsk.model.magnum;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.magnum.EnvironmentBuilder;

public interface Environment extends ModelEntity, Buildable<EnvironmentBuilder> {
    /**
     * Gets path
     * @return path
     */
    String getPath();


    /**
     * Gets ldLibraryPath
     * @return ldLibraryPath
     */
    String getLdLibraryPath();


}
