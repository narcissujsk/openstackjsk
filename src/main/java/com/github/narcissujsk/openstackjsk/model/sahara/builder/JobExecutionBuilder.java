package com.github.narcissujsk.openstackjsk.model.sahara.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.sahara.JobConfig;
import com.github.narcissujsk.openstackjsk.model.sahara.JobExecution;

/**
 * Builder interface used for {@link JobExecution} object.
 *
 * @author ekasit.kijsipongse@nectec.or.th
 * @author siwat.pru@outlook.com
 */
public interface JobExecutionBuilder extends Builder<JobExecutionBuilder, JobExecution> {

    /**
     * See {@link JobExecution#getClusterId()}
     * 
     * @param clusterId the cluster identifier
     * @return JobExecutionBuilder
     */
    JobExecutionBuilder clusterId(String clusterId);

    /**
     * See {@link JobExecution#getInputId()}
     * 
     * @param inputId the input identifier
     * @return JobExecutionBuilder
     */
    JobExecutionBuilder inputId(String inputId);

    /**
     * See {@link JobExecution#getOutputId()}
     * 
     * @param outputId the output identifier
     * @return JobExecutionBuilder
     */
    JobExecutionBuilder outputId(String outputId);

    /**
     * See {@link JobExecution#getJobConfigs()}
     * 
     * @param jobConfig the job configuration
     * @return JobExecutionBuilder
     */
    JobExecutionBuilder setJobConfig(JobConfig jobConfig);

    /**
     * See {@link JobExecution#getJobId()}
     * 
     * @param jobId the job identifier
     * @return JobExecutionBuilder
     */
    JobExecutionBuilder jobId(String jobId);
}
