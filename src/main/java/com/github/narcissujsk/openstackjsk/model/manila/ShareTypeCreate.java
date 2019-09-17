package com.github.narcissujsk.openstackjsk.model.manila;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.manila.ExtraSpecs;
import com.github.narcissujsk.openstackjsk.model.manila.builder.ShareTypeCreateBuilder;

/**
 * Object used to create new share types.
 *
 * @author Daniel Gonzalez Nothnagel
 */
public interface ShareTypeCreate extends ModelEntity, Buildable<ShareTypeCreateBuilder> {
    /**
     * @return the extra specifications for the share type
     */
    ExtraSpecs getExtraSpecs();

    /**
     * @return indicates whether a share type is publicly accessible
     */
    Boolean getOsShareTypeAccessIsPublic();

    /**
     * @return the share type name
     */
    String getName();
}
