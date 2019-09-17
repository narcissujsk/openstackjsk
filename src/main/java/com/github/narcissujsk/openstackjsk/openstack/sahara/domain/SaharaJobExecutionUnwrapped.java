package com.github.narcissujsk.openstackjsk.openstack.sahara.domain;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.sahara.JobExecution;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

/**
 * An OpenStack Sahara
 * Unwrap the root name of Job Execution when serialized into json request
 *
 * @author ekasit.kijsipongse@nectec.or.th
 * @author siwat.pru@outlook.com
 */

public class SaharaJobExecutionUnwrapped implements ModelEntity {

    private static final long serialVersionUID = 1L;

    @JsonUnwrapped
    //@JsonProperty("job_execution")
    private JobExecution jobExecution;

    public SaharaJobExecutionUnwrapped(JobExecution jobExecution) {
        this.jobExecution = jobExecution;
    }

    public JobExecution getJobExecution() { // need for serialization
        return jobExecution;
    }
}
