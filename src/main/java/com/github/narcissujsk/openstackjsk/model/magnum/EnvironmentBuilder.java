package com.github.narcissujsk.openstackjsk.model.magnum;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.magnum.Environment;

public interface EnvironmentBuilder extends Builder<EnvironmentBuilder, com.github.narcissujsk.openstackjsk.model.magnum.Environment> {
    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Environment#getPath
     */
    EnvironmentBuilder path(String path);

    /**
     * @see Environment#getLdLibraryPath
     */
    EnvironmentBuilder ldLibraryPath(String ldLibraryPath);

}
