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
package com.github.narcissujsk.openstackjsk.model.heat.builder;

import java.util.Map;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.heat.SoftwareConfig;

/**
 * A builder which produces a SoftwareConfig object
 * 
 * @author Jeremy Unruh
 */
public interface SoftwareConfigBuilder extends Buildable.Builder<SoftwareConfigBuilder, SoftwareConfig> {

    /**
     * The name of this configuration
     * 
     * @param name the config name
     * @return SoftwareConfigBuilder
     */
    SoftwareConfigBuilder name(String name);

    /**
     * Namespace that groups this software configuration by when it is delivered to a server. 
     * This setting might imply which configuration tool performs the configuration.
     * 
     * @param group the group namespace
     * @return SoftwareConfigBuilder
     */
    SoftwareConfigBuilder group(String group);

    /**
     * Adds an input that this software configuration expects
     * 
     * @param name the input name
     * @return SoftwareConfigBuilder
     */
    SoftwareConfigBuilder input(String name);

    /**
     * Adds an input that this software configuration expects
     * 
     * @param name the input name
     * @param type the input type (ex. String)
     * @return SoftwareConfigBuilder
     */
    SoftwareConfigBuilder input(String name, String type);

    /**
     * Adds an input that this software configuration expects
     * 
     * @param name the input name
     * @param type the input type (ex. String)
     * @param description a description about this input
     * @param defaultValue the initial value
     * @return SoftwareConfigBuilder
     */
    SoftwareConfigBuilder input(String name, String type, String description, String defaultValue);

    /**
     * Adds an output this software configuration produces
     * 
     * @param name the name of the output
     * @return SoftwareConfigBuilder
     */
    SoftwareConfigBuilder output(String name);

    /**
     * Adds an output this software configuration produces
     * 
     * @param name the name of the output
     * @param type the output type (ex. String)
     * @return SoftwareConfigBuilder
     */
    SoftwareConfigBuilder output(String name, String type);

    /**
     * Adds an output this software configuration produces
     * 
     * @param name the name of the output
     * @param type the output type (ex. String)
     * @param description the description of this output
     * @param isErrorOutput true if this is an error related output
     * @return SoftwareConfigBuilder
     */
    SoftwareConfigBuilder output(String name, String type, String description, boolean isErrorOutput);

    /**
     * Adds a map containing options specific to the configuration management tool used by this resource
     * 
     * @param options map of options
     * @return SoftwareConfigBuilder
     */
    SoftwareConfigBuilder options(Map<String, Object> options);

    /**
     * Configuration script or manifest that defines which configuration is performed
     * 
     * @param config the configuration script or manifest to add
     * @return SoftwareConfigBuilder
     */
    SoftwareConfigBuilder config(String config);

}
