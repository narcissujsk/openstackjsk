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
import com.github.narcissujsk.openstackjsk.model.sahara.Job;

/**
 * Builder interface used for {@link Job} object.
 *
 * @author ekasit.kijsipongse@nectec.or.th
 * @author siwat.pru@outlook.com
 */
public interface JobBuilder extends Builder<JobBuilder, Job> {

    /**
     * See {@link Job#getDescription()}
     * 
     * @param description the description of the job
     * @return JobBuilder
     */
    JobBuilder description(String description);

    /**
     * See {@link Job#getType()}
     * 
     * @param type the type of the job
     * @return JobBuilder
     */
    JobBuilder type(String type);

    /**
     * See {@link Job#getName()}
     * 
     * @param name the name of the job
     * @return JobBuilder
     */
    JobBuilder name(String name);

    /**
     * See {@link Job#getMainIds()}
     * 
     * @param id the id of the job binary
     * @return JobBuilder
     */
    JobBuilder setMain(String jobBinaryId);

    /**
     * See {@link Job#getLibId()}
     * 
     * @param name the name of the job
     * @return JobBuilder
     */
    JobBuilder addLibs(String jobBinaryId);
}
