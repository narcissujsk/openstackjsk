package com.github.narcissujsk.openstackjsk.model.barbican.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.barbican.ContainerSecret;

public interface ContainerSecretBuilder extends Buildable.Builder<ContainerSecretBuilder, ContainerSecret> {
    /**
     * @param name Human readable name for identifying your secret within the container.
     * @return
     */
    ContainerSecretBuilder name(String name);

    /**
     * @param type Full URI reference to an existing secret.
     * @return
     */
    ContainerSecretBuilder reference(String type);
}
