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
package com.github.narcissujsk.openstackjsk.openstack.heat.builder;

import com.github.narcissujsk.openstackjsk.model.heat.builder.OrchestrationBuilders;
import com.github.narcissujsk.openstackjsk.model.heat.builder.ResourceHealthBuilder;
import com.github.narcissujsk.openstackjsk.model.heat.builder.SoftwareConfigBuilder;
import com.github.narcissujsk.openstackjsk.model.heat.builder.StackCreateBuilder;
import com.github.narcissujsk.openstackjsk.model.heat.builder.StackUpdateBuilder;
import com.github.narcissujsk.openstackjsk.model.heat.builder.TemplateBuilder;
import com.github.narcissujsk.openstackjsk.openstack.heat.domain.HeatResourceHealth;
import com.github.narcissujsk.openstackjsk.openstack.heat.domain.HeatSoftwareConfig;
import com.github.narcissujsk.openstackjsk.openstack.heat.domain.HeatStackCreate;
import com.github.narcissujsk.openstackjsk.openstack.heat.domain.HeatStackUpdate;
import com.github.narcissujsk.openstackjsk.openstack.heat.domain.HeatTemplate;

/**
 * The Orchestration V3 Builders
 */
public class HeatBuilders implements OrchestrationBuilders {

    private OrchestrationBuilders HeatBuilders() {
        return this;
    }

    @Override
    public TemplateBuilder template() {
        return HeatTemplate.build();
    }

    @Override
    public StackCreateBuilder stack() {
        return HeatStackCreate.build();
    }

    @Override
    public SoftwareConfigBuilder softwareConfig() {
        return new HeatSoftwareConfig.Builder();
    }

    @Override
    public StackUpdateBuilder stackUpdate() {
        return HeatStackUpdate.builder();
    }

    @Override
    public ResourceHealthBuilder resourceHealth() {
        return HeatResourceHealth.builder();
    }
}
