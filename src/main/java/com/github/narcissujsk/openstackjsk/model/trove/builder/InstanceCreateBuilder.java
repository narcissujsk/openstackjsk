package com.github.narcissujsk.openstackjsk.model.trove.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.trove.Datastore;
import com.github.narcissujsk.openstackjsk.model.trove.InstanceCreate;

public interface InstanceCreateBuilder extends Buildable.Builder<InstanceCreateBuilder, InstanceCreate> {

    InstanceCreateBuilder volumeType(String volumeType);

    InstanceCreateBuilder volumeSize(int size);

    InstanceCreateBuilder flavor(String flavorRef);

    InstanceCreateBuilder name(String name);

    InstanceCreateBuilder datastore(Datastore datastore);

}
