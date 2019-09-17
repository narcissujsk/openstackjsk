package com.github.narcissujsk.openstackjsk.model.trove;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.trove.Datastore;
import com.github.narcissujsk.openstackjsk.model.trove.builder.InstanceCreateBuilder;

public interface InstanceCreate extends ModelEntity, Buildable<InstanceCreateBuilder> {

    void setFlavor(String flavorRef);

    void setName(String name);

    void setDatastore(Datastore datastore);

    void setVolumetype(String volumeType);

    void setvolumeSize(int size);
}
