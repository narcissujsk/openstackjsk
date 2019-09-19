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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.narcissujsk.openstackjsk.model.workflow.Execution;
import com.github.narcissujsk.openstackjsk.model.workflow.State;
import com.github.narcissujsk.openstackjsk.model.workflow.builder.ExecutionBuilder;

import java.util.Date;
import java.util.List;


/**
 * Base class for all execution models.
 *
 * @author Renat Akhmerov
 */
public abstract class BaseExecution implements Execution {
    String id;

    String description;

    @JsonProperty("created_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    Date createdAt;

    @JsonProperty("updated_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    Date updatedAt;

    List<String> tags;

    @JsonProperty("workflow_name")
    String wfName;

    State state;

    @JsonProperty("state_info")
    String stateInfo;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getWorkflowName() {
        return wfName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public List<String> getTags() {
        return tags;
    }

    @Override
    public State getState() {
        return state;
    }

    @Override
    public String getStateInfo() {
        return stateInfo;
    }

    /**
     * Base execution builder.
     *
     * @author Renat Akhmerov
     */
    @SuppressWarnings("unchecked")
    public static abstract class BaseExecutionBuilder<T extends ExecutionBuilder<T, M>, M extends BaseExecution>
            implements ExecutionBuilder<T, M> {

        protected M model;

        BaseExecutionBuilder(M model) {
            this.model = model;
        }

        @Override
        public M build() {
            return model;
        }

        public T from(Execution in) {
            return null;
        }

        public T id(String id) {
            model.id = id;

            return (T) this;
        }

        public T description(String description) {
            model.description = description;

            return (T) this;
        }

        public T workflowName(String wfName) {
            model.wfName = wfName;

            return (T) this;
        }

        public T createdAt(Date createdAt) {
            model.createdAt = createdAt;

            return (T) this;
        }

        public T updatedAt(Date updatedAt) {
            model.updatedAt = updatedAt;

            return (T) this;
        }

        public T tags(List<String> tags) {
            model.tags = tags;

            return (T) this;
        }

        public T state(State state) {
            model.state = state;

            return (T) this;
        }

        public T stateInfo(String stateInfo) {
            model.stateInfo = stateInfo;

            return (T) this;
        }
    }
}
