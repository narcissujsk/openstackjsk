/*******************************************************************************
 * 	Copyright 2019 ContainX and OpenStack4j
 *
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * 	use this file except in compliance with the License. You may obtain a copy of
 * 	the License at
 *
 * 	    http://www.apache.org/licenses/LICENSE-2.0
 *
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * 	License for the specific language governing permissions and limitations under
 * 	the License.
 *******************************************************************************/
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
