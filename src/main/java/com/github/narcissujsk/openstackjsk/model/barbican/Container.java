package com.github.narcissujsk.openstackjsk.model.barbican;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.barbican.ContainerConsumer;
import com.github.narcissujsk.openstackjsk.model.barbican.ContainerSecret;
import com.github.narcissujsk.openstackjsk.model.barbican.builder.ContainerCreateBuilder;

import java.util.Date;
import java.util.List;

/**
 * Project storage unit for secrets.
 */
public interface Container extends ModelEntity, Buildable<ContainerCreateBuilder> {

    /**
     * @return current status of the container.
     */
    String getStatus();

    /**
     * @return container type (generic, rsa, certificate).
     */
    String getType();

    /**
     * @return name of the container.
     */
    String getName();

    /**
     * @return system generated last update time.
     */
    Date getUpdatedTime();

    /**
     * @return system generated creation time.
     */
    Date getCreatedTime();

    /**
     * @return URL reference to the container.
     */
    String getContainerReference();

    /**
     * @return user uuid of the creator of this container.
     */
    String getCreatorId();

    /**
     * @return current consumers of this container.
     */
    List<? extends ContainerConsumer> getConsumers();

    /**
     * @return associated secrets.
     */
    List<? extends ContainerSecret> getSecretReferences();
}
