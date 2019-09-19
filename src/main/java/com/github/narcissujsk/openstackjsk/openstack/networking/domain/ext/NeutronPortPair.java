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
package com.github.narcissujsk.openstackjsk.openstack.networking.domain.ext;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.model.network.ext.PortPair;
import com.github.narcissujsk.openstackjsk.model.network.ext.builder.PortPairBuilder;
import com.github.narcissujsk.openstackjsk.openstack.common.ListResult;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 *
 * @author Dmitry Gerenrot
 *
 */
@JsonRootName("port_pair")
public class NeutronPortPair implements PortPair {

    private static final long serialVersionUID = 1L;

    @JsonProperty
    private String id;

    @JsonProperty
    private String name;

    @JsonProperty("project_id")
    private String projectId;

    @JsonProperty
    private String description;

    @JsonProperty("egress")
    private String egressId;

    @JsonProperty("ingress")
    private String ingressId;

    @JsonProperty("service_function_parameters")
    Map<String, String> serviceFunctionParameters;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @JsonIgnore
    @Override
    public String getTenantId() {
        return projectId;
    }

    @Override
    public void setTenantId(String tenantId) {
        this.projectId = tenantId;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String getEgressId() {
        return egressId;
    }

    public void setEgressId(String egressId) {
        this.egressId = egressId;
    }

    @Override
    public String getIngressId() {
        return ingressId;
    }

    public void setIngressId(String ingressId) {
        this.ingressId = ingressId;
    }

    @Override
    public Map<String, String> getServiceFunctionParameters() {
        return serviceFunctionParameters;
    }

    public void setServiceFunctionParameters(Map<String, String> serviceFunctionParameters) {
        this.serviceFunctionParameters = serviceFunctionParameters;
    }


    @Override
    public PortPairBuilder toBuilder() {
        return new PortPairConcreteBuilder(this);
    }

    public static PortPairBuilder builder() {
        return new PortPairConcreteBuilder();
    }

    public static class PortPairs extends ListResult<NeutronPortPair> {

        private static final long serialVersionUID = 1L;

        @JsonProperty("port_pairs")
        private List<NeutronPortPair> portPairs;

        public List<NeutronPortPair> value() {
            return portPairs;
        }
    }

    public static class PortPairConcreteBuilder implements PortPairBuilder {

        private NeutronPortPair neutronPortPair;

        public PortPairConcreteBuilder() {
            this.neutronPortPair = new NeutronPortPair();
        }

        public PortPairConcreteBuilder(NeutronPortPair neutronPortPair) {
            this.neutronPortPair = neutronPortPair;
        }

        @Override
        public PortPair build() {
            return neutronPortPair;
        }

        @Override
        public PortPairBuilder from(PortPair in) {
            this.neutronPortPair = (NeutronPortPair) in;
            return this;
        }

        @Override
        public PortPairBuilder id(String id) {
            this.neutronPortPair.id = id;
            return this;
        }

        @Override
        public PortPairBuilder name(String name) {
            this.neutronPortPair.name = name;
            return this;
        }

        @Override
        public PortPairBuilder projectId(String projectId) {
            this.neutronPortPair.projectId = projectId;
            return this;
        }

        @Override
        public PortPairBuilder description(String description) {
            this.neutronPortPair.description = description;
            return this;
        }

        @Override
        public PortPairBuilder egressId(String egressId) {
            this.neutronPortPair.egressId = egressId;
            return this;
        }

        @Override
        public PortPairBuilder ingressId(String ingressId) {
            this.neutronPortPair.ingressId = ingressId;
            return this;
        }

        @Override
        public PortPairBuilder serviceFunctionParameters(Map<String, String> serviceFunctionParameters) {
            this.neutronPortPair.serviceFunctionParameters = serviceFunctionParameters;
            return this;
        }
    }
}
