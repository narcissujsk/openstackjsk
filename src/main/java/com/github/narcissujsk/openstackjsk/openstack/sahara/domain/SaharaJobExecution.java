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

import java.util.Date;
import java.util.List;

import com.github.narcissujsk.openstackjsk.model.sahara.JobConfig;
import com.github.narcissujsk.openstackjsk.model.sahara.JobExecution;
import com.github.narcissujsk.openstackjsk.model.sahara.JobExecutionInfo;
import com.github.narcissujsk.openstackjsk.model.sahara.builder.JobExecutionBuilder;
import com.github.narcissujsk.openstackjsk.openstack.common.ListResult;

import com.fasterxml.jackson.annotation.JsonFormat;
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

@JsonRootName("job_execution")
@JsonIgnoreProperties(value={"jobIdForExecution"}, ignoreUnknown=true)
public class SaharaJobExecution implements JobExecution {

    private static final long serialVersionUID = 1L;

    @JsonProperty("cluster_id")
    private String clusterId;
    @JsonProperty("input_id")
    private String inputId;
    @JsonProperty("output_id")
    private String outputId;
    @JsonProperty("job_configs")
    private SaharaJobConfig jobConfigs;
    @JsonProperty("job_id")
    private String jobId;
    @JsonProperty("tenant_id")
    private String tenantId;
    @JsonProperty("start_time")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date startTime;
    @JsonProperty("end_time")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date endTime;
    @JsonProperty("created_at")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date createdAt;
    @JsonProperty("updated_at")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date updatedAt;
    @JsonProperty("oozie_job_id")
    private String oozieJobId;
    @JsonProperty("return_code")
    private String returnCode;
    @JsonProperty("progress")
    private String progress;
    @JsonProperty("id")
    private String id;
    @JsonProperty("info")
    private SaharaJobExecutionInfo info;

    private String jobIdForExecute;

    /**
     * {@inheritDoc}
     */
    @Override
    public String getJobIdForExecution() {
        return jobIdForExecute;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getClusterId() {
        return clusterId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getInputId() {
        return inputId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getOutputId() {
        return outputId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobConfig getJobConfigs() {
        return jobConfigs;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getTenantId() {
        return tenantId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date getStartTime() {
        return startTime;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date getEndtime() {
        return endTime;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getOozieJobId() {
        return oozieJobId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getJobId() {
        return jobId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getProgress() {
        return progress;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobExecutionInfo getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).omitNullValues()
                   .add("cluster_id", clusterId)
                   .add("input_id", inputId)
                   .add("output_id", outputId)
                   .add("job_configs", jobConfigs)
                   .add("job_id", jobId)
                   .add("tenant_id", tenantId)
                   .add("start_time", startTime)
                   .add("end_time", endTime)
                   .add("created_at", createdAt)
                   .add("updated_at", updatedAt)
                   .add("oozie_job_id", oozieJobId)
                   .add("return_code", returnCode)
                   .add("progress", progress)
                   .add("info", info)
                   .add("id", id)
                   .toString();
    }

    public static class JobExecutions extends ListResult<SaharaJobExecution> {

        private static final long serialVersionUID = 1L;

        @JsonProperty("job_executions")
        private List<SaharaJobExecution> jobExecutions;

        public List<SaharaJobExecution> value() {
            return jobExecutions;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobExecutionBuilder toBuilder() {
        return new concreteJobExecutionBuilder(this);
    }

    /**
     * @return the job execution Builder
     */
    public static JobExecutionBuilder builder() {
        return new concreteJobExecutionBuilder();
    }

    public static class  concreteJobExecutionBuilder implements JobExecutionBuilder {

        SaharaJobExecution m;

        concreteJobExecutionBuilder() {
            this(new SaharaJobExecution());
        }

        concreteJobExecutionBuilder(SaharaJobExecution m) {
            this.m = m;
        }

        @Override
        public JobExecution build() {
            return m;
        }

        @Override
        public JobExecutionBuilder from(JobExecution in) {
            m = (SaharaJobExecution) in;
            return this;
        }

        @Override
        public JobExecutionBuilder clusterId(String clusterId) {
            m.clusterId = clusterId;
            return this;
        }

        @Override
        public JobExecutionBuilder inputId(String inputId) {
            m.inputId = inputId;
            return this;
        }

        @Override
        public JobExecutionBuilder outputId(String outputId) {
            m.outputId = outputId;
            return this;
        }

        @Override
        public JobExecutionBuilder setJobConfig(JobConfig jobConfig) {
            m.jobConfigs = (SaharaJobConfig) jobConfig;
            return this;
        }

        @Override
        public JobExecutionBuilder jobId(String jobId) {
            m.jobIdForExecute = jobId;
            return this;
        }
    }
}
