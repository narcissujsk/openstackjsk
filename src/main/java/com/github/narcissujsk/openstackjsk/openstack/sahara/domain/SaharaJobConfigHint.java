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
package com.github.narcissujsk.openstackjsk.openstack.sahara.domain;

import java.util.List;

import com.github.narcissujsk.openstackjsk.model.sahara.JobConfigHint;
import com.github.narcissujsk.openstackjsk.model.sahara.JobConfigHintConfig;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;

/**
 * For mapping JSON response to/from java objects
 *
 * @author ekasit.kijsipongse@nectec.or.th
 * @author siwat.pru@outlook.com
 */

@JsonRootName("job_config")
@JsonIgnoreProperties(ignoreUnknown=true)
public class SaharaJobConfigHint implements JobConfigHint {

    private static final long serialVersionUID = 1L;
    @JsonProperty("configs")
    private List<SaharaJobConfigHintConfig> configs;
    @JsonProperty("args")
    private List<Object> args;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends JobConfigHintConfig> getConfigs() {
        return configs;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Object> getArgs() {
        return args;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).omitNullValues()
                   .add("configs", configs)
                   .add("args", args)
                   .toString();
    }

}
