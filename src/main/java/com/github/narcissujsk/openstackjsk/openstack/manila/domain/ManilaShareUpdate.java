package com.github.narcissujsk.openstackjsk.openstack.manila.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.manila.ShareUpdateOptions;

/**
 * Object used to update existing shares.
 *
 * @author Daniel Gonzalez Nothnagel
 */
@JsonRootName(("share"))
public class ManilaShareUpdate implements ModelEntity {
    private static final long serialVersionUID = 1L;

    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("display_description")
    private String displayDescription;
    @JsonProperty("is_public")
    private Boolean isPublic;

    private ManilaShareUpdate() {}

    public static ManilaShareUpdate fromOptions(ShareUpdateOptions options) {
        ManilaShareUpdate shareUpdate = new ManilaShareUpdate();
        shareUpdate.displayName = options.getDisplayName();
        shareUpdate.displayDescription = options.getDisplayDescription();
        shareUpdate.isPublic = options.isPublic();

        return shareUpdate;
    }
}
