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
package com.github.narcissujsk.openstackjsk.model.sahara.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.sahara.JobConfig;

/**
 * Builder interface used for {@link JobConfig} object.
 *
 * @author ekasit.kijsipongse@nectec.or.th
 * @author siwat.pru@outlook.com
 */
public interface JobConfigBuilder extends Builder<JobConfigBuilder, JobConfig> {

    /**
     * See {@link JobConfig#getConfigs()}
     * 
     * @param name the name of the configuration
     * @param value the value of the configuration
     * @return JobConfigBuilder
     */
    JobConfigBuilder addConfig(String name, Object value);

    /**
     * See {@link JobConfig#getArgs()}
     * 
     * @param arg the argument
     * @return JobConfigBuilder
     */
    JobConfigBuilder addArg(Object arg);

    /**
     * See {@link JobConfig#getParams()}
     * 
     * @param param the name of the parameter
     * @param value the value of the parameter
     * @return JobConfigBuilder
     */
    JobConfigBuilder addParam(String param, Object value);
}
