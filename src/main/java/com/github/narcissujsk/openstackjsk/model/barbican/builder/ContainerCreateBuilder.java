package com.github.narcissujsk.openstackjsk.model.barbican.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.barbican.Container;
import com.github.narcissujsk.openstackjsk.model.barbican.ContainerSecret;

import java.util.List;

public interface ContainerCreateBuilder extends Buildable.Builder<ContainerCreateBuilder, Container> {
    /**
     * Optional.
     * @param name Human readable name for identifying your container.
     * @return
     */
    ContainerCreateBuilder name(String name);

    /**
     * Required.
     * @param type Type of container. Options: generic, rsa, certificate
     * @return
     */
    ContainerCreateBuilder type(String type);

    /**
     * Required.
     * @param references A list of dictionaries containing references to secrets
     * @return
     */
    ContainerCreateBuilder secretReferences(List<? extends ContainerSecret> references);
}
