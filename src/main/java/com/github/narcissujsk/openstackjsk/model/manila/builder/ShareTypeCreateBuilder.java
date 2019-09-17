package com.github.narcissujsk.openstackjsk.model.manila.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.manila.ExtraSpecs;
import com.github.narcissujsk.openstackjsk.model.manila.ShareTypeCreate;

/**
 * Builds a {@link ShareTypeCreate}.
 *
 * @author Daniel Gonzalez Nothnagel
 */
public interface ShareTypeCreateBuilder extends Buildable.Builder<ShareTypeCreateBuilder, ShareTypeCreate> {
    /**
     * Adds an extra specification for the share type.
     *
     * @param key the key of the extra specification
     * @param value the value of the extra specification
     * @return ShareTypeCreateBuilder
     */
    ShareTypeCreateBuilder addExtraSpec(String key, String value);

    /**
     * Set extra specifications for the share type.
     *
     * @param extraSpecs the extra specifications
     * @return ShareTypeCreateBuilder
     */
    ShareTypeCreateBuilder extraSpecs(ExtraSpecs extraSpecs);

     /**
      * Set whether a share type is publicly accessible. Default is true, or publicly accessible.
      *
      * @param osShareTypeAccessIsPublic whether the share type is public accessible
      * @return ShareTypeCreateBuilder
      */
     ShareTypeCreateBuilder osShareTypeAccessIsPublic(boolean osShareTypeAccessIsPublic);

    /**
     * Set the share type name.
     *
     * @param name the share type name
     * @return ShareTypeCreateBuilder
     */
    ShareTypeCreateBuilder name(String name);
}
