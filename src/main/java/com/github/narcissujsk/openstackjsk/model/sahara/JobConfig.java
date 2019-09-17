package com.github.narcissujsk.openstackjsk.model.sahara;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.sahara.builder.JobConfigBuilder;

/**
 * An Configuration for Sahara Job Execution
 * 
 * @author ekasit.kijsipongse@nectec.or.th
 * @author siwat.pru@outlook.com
 */
public interface JobConfig extends ModelEntity, Buildable<JobConfigBuilder> {

    /**
     * @return map of configurations
     */
    Map<String, Object> getConfigs();

    /**
     * @return list of arguments
     */
    List<Object> getArgs();

    /**
     * @return map of parameters
     */
    Map<String, Object> getParams();
}
