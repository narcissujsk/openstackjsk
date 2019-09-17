package com.github.narcissujsk.openstackjsk.model.image.v2.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.image.v2.ImageUpdate;
import com.github.narcissujsk.openstackjsk.openstack.image.v2.domain.PatchOperation;

import java.util.List;

public interface ImageUpdateBuilder extends Buildable.Builder<ImageUpdateBuilder, ImageUpdate> {
    /**
     * @see ImageUpdate#getOps()
     */
    ImageUpdateBuilder ops(List<PatchOperation> ops);

    /**
     * @see ImageUpdate#getOps()
     */
    ImageUpdateBuilder ops(PatchOperation op);
}
