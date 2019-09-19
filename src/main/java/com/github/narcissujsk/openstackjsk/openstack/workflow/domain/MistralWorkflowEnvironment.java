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
package com.github.narcissujsk.openstackjsk.openstack.workflow.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.narcissujsk.openstackjsk.model.workflow.Scope;
import com.github.narcissujsk.openstackjsk.model.workflow.WorkflowEnvironment;
import com.github.narcissujsk.openstackjsk.model.workflow.builder.WorkflowEnvironmentBuilder;
import com.github.narcissujsk.openstackjsk.openstack.common.ListResult;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Mistral workflow environment.
 *
 * @author Renat Akhmerov
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MistralWorkflowEnvironment implements WorkflowEnvironment {
    private static final long serialVersionUID = 1L;

    private String id;

    @JsonProperty("created_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createdAt;

    @JsonProperty("updated_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatedAt;

    @JsonProperty("project_id")
    private String projectId;

    private Scope scope;

    private String name;

    private String description;

    private Map<String, Object> variables;

    public static MistralWorkflowEnvironmentBuilder builder() {
        return new MistralWorkflowEnvironmentBuilder();
    }

    @Override
    public MistralWorkflowEnvironmentBuilder toBuilder() {
        return new MistralWorkflowEnvironmentBuilder(this);
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public Date getCreatedAt() {
        return createdAt;
    }

    @Override
    public Date getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public String getProjectId() {
        return projectId;
    }

    @Override
    public Scope getScope() {
        return scope;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Map<String, Object> getVariables() {
        return variables;
    }

    /**
     * Mistral workflow environment builder.
     *
     * @author Renat Akhmerov
     */
    public static class MistralWorkflowEnvironmentBuilder implements
            WorkflowEnvironmentBuilder<MistralWorkflowEnvironmentBuilder, MistralWorkflowEnvironment> {

        protected MistralWorkflowEnvironment model;

        MistralWorkflowEnvironmentBuilder() {
            this(new MistralWorkflowEnvironment());
        }

        MistralWorkflowEnvironmentBuilder(MistralWorkflowEnvironment model) {
            this.model = model;
        }

        @Override
        public MistralWorkflowEnvironment build() {
            return model;
        }

        @Override
        public MistralWorkflowEnvironmentBuilder from(MistralWorkflowEnvironment in) {
            return null;
        }

        @Override
        public MistralWorkflowEnvironmentBuilder id(String id) {
            this.model.id = id;

            return this;
        }

        @Override
        public MistralWorkflowEnvironmentBuilder createdAt(Date createdAt) {
            this.model.createdAt = createdAt;

            return this;
        }

        @Override
        public MistralWorkflowEnvironmentBuilder updatedAt(Date updatedAt) {
            this.model.updatedAt = updatedAt;

            return this;
        }

        @Override
        public MistralWorkflowEnvironmentBuilder projectId(String projectId) {
            this.model.projectId = projectId;

            return this;
        }

        @Override
        public MistralWorkflowEnvironmentBuilder scope(Scope scope) {
            this.model.scope = scope;

            return this;
        }

        @Override
        public MistralWorkflowEnvironmentBuilder name(String name) {
            this.model.name = name;

            return this;
        }

        @Override
        public MistralWorkflowEnvironmentBuilder description(String description) {
            this.model.description = description;

            return this;
        }

        @Override
        public MistralWorkflowEnvironmentBuilder variables(Map<String, Object> variables) {
            this.model.variables = variables;

            return this;
        }
    }

    public static class MistralWorkflowEnvironments extends ListResult<MistralWorkflowEnvironment> {
        private static final long serialVersionUID = 1L;

        @JsonProperty("environments")
        private List<MistralWorkflowEnvironment> list;

        @Override
        protected List<MistralWorkflowEnvironment> value() {
            return this.list;
        }
    }
}
