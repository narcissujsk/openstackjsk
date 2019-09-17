package com.github.narcissujsk.openstackjsk.model.barbican;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.barbican.builder.ContainerSecretBuilder;

/**
 * A secret associated to a container.
 */
public interface ContainerSecret extends ModelEntity, Buildable<ContainerSecretBuilder> {
    /**
     * @return the name of the secret.
     */
    String getName();

    /**
     * @return Full URI reference to the secret.
     */
    String getReference();
}
