package com.github.narcissujsk.openstackjsk.model.sahara.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.sahara.JobConfig;

/**
 * Builder interface used for {@link JobConfig} object.
 *
 * @author ekasit.kijsipongse@nectec.or.th
 * @author siwat.pru@outlook.com
 */
public interface JobConfigBuilder extends Builder<JobConfigBuilder, JobConfig> {

    /**
     * See {@link JobConfig#getConfigs()}
     * 
     * @param name the name of the configuration
     * @param value the value of the configuration
     * @return JobConfigBuilder
     */
    JobConfigBuilder addConfig(String name, Object value);

    /**
     * See {@link JobConfig#getArgs()}
     * 
     * @param arg the argument
     * @return JobConfigBuilder
     */
    JobConfigBuilder addArg(Object arg);

    /**
     * See {@link JobConfig#getParams()}
     * 
     * @param param the name of the parameter
     * @param value the value of the parameter
     * @return JobConfigBuilder
     */
    JobConfigBuilder addParam(String param, Object value);
}
