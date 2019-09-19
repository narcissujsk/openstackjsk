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
import com.github.narcissujsk.openstackjsk.model.workflow.CronTrigger;
import com.github.narcissujsk.openstackjsk.model.workflow.Scope;
import com.github.narcissujsk.openstackjsk.model.workflow.builder.CronTriggerBuilder;
import com.github.narcissujsk.openstackjsk.openstack.common.ListResult;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Mistral cron trigger.
 *
 * @author Renat Akhmerov
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MistralCronTrigger implements CronTrigger {
    private static final long serialVersionUID = 1L;

    private String id;

    @JsonProperty("created_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createdAt;

    @JsonProperty("updated_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatedAt;

    private Scope scope;

    private String name;

    private String pattern;

    @JsonProperty("workflow_name")
    private String wfName;

    @JsonProperty("workflow_id")
    private String wfId;

    @JsonProperty("workflow_input")
    private Map<String, Object> wfInput;

    @JsonProperty("workflow_params")
    private Map<String, Object> wfParams;

    @JsonProperty("remaining_executions")
    private Integer remainingExecutionsCount;

    @JsonProperty("first_execution_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date firstExecTime;

    @JsonProperty("next_execution_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date nextExecTime;

    public static MistralCronTriggerBuilder builder() {
        return new MistralCronTriggerBuilder();
    }

    @Override
    public MistralCronTriggerBuilder toBuilder() {
        return new MistralCronTriggerBuilder(this);
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
    public Scope getScope() {
        return scope;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPattern() {
        return pattern;
    }

    @Override
    public String getWorkflowName() {
        return wfName;
    }

    @Override
    public String getWorkflowId() {
        return wfId;
    }

    @Override
    public Map<String, ?> getWorkflowInput() {
        return wfInput;
    }

    @Override
    public Map<String, ?> getWorkflowParameters() {
        return wfParams;
    }

    @Override
    public Integer getRemainingExecutionsCount() {
        return null;
    }

    @Override
    public Date getFirstExecutionTime() {
        return firstExecTime;
    }

    @Override
    public Date getNextExecutionTime() {
        return nextExecTime;
    }

    /**
     * Mistral cron trigger builder.
     *
     * @author Renat Akhmerov
     */
    public static class MistralCronTriggerBuilder implements
            CronTriggerBuilder<MistralCronTriggerBuilder, MistralCronTrigger> {

        protected MistralCronTrigger model;

        MistralCronTriggerBuilder() {
            this(new MistralCronTrigger());
        }

        MistralCronTriggerBuilder(MistralCronTrigger model) {
            this.model = model;
        }

        @Override
        public MistralCronTrigger build() {
            return model;
        }

        @Override
        public MistralCronTriggerBuilder from(MistralCronTrigger in) {
            return null;
        }

        @Override
        public MistralCronTriggerBuilder id(String id) {
            this.model.id = id;

            return this;
        }

        @Override
        public MistralCronTriggerBuilder createdAt(Date createdAt) {
            this.model.createdAt = createdAt;

            return this;
        }

        @Override
        public MistralCronTriggerBuilder updatedAt(Date updatedAt) {
            this.model.updatedAt = updatedAt;

            return this;
        }

        @Override
        public MistralCronTriggerBuilder scope(Scope scope) {
            this.model.scope = scope;

            return this;
        }

        @Override
        public MistralCronTriggerBuilder name(String name) {
            this.model.name = name;

            return this;
        }

        @Override
        public MistralCronTriggerBuilder pattern(String pattern) {
            this.model.pattern = pattern;

            return this;
        }

        @Override
        public MistralCronTriggerBuilder workflowName(String wfName) {
            this.model.wfName = wfName;

            return this;
        }

        @Override
        public MistralCronTriggerBuilder workflowId(String wfId) {
            this.model.wfId = wfId;

            return this;
        }

        @Override
        public MistralCronTriggerBuilder workflowInput(Map<String, Object> wfInput) {
            this.model.wfInput = wfInput;

            return this;
        }

        @Override
        public MistralCronTriggerBuilder workflowParameters(Map<String, Object> wfParams) {
            this.model.wfParams = wfParams;

            return this;
        }

        @Override
        public MistralCronTriggerBuilder remainingExecutionsCount(Integer cnt) {
            this.model.remainingExecutionsCount = cnt;

            return this;
        }

        @Override
        public MistralCronTriggerBuilder firstExecutionTime(Date firstExecTime) {
            this.model.firstExecTime = firstExecTime;

            return this;
        }

        @Override
        public MistralCronTriggerBuilder nextExecutionTime(Date nextExecTime) {
            this.model.nextExecTime = nextExecTime;

            return this;
        }
    }

    public static class MistralCronTriggers extends ListResult<MistralCronTrigger> {
        private static final long serialVersionUID = 1L;

        @JsonProperty("cron_triggers")
        private List<MistralCronTrigger> list;

        @Override
        protected List<MistralCronTrigger> value() {
            return this.list;
        }
    }
}
