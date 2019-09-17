package com.github.narcissujsk.openstackjsk.model.sahara;

import java.util.List;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.sahara.JobConfigHintConfig;

/**
 * Hints for job configuration that can be applied to job exeuctions.
 *
 * @author ekasit.kijsipongse@nectec.or.th
 * @author siwat.pru@outlook.com
 */
public interface JobConfigHint extends ModelEntity {

    /**
     * @return the list of configuration maps
     */
    List<? extends JobConfigHintConfig> getConfigs();

    /**
     * @return the list of arguments
     */
    List<Object> getArgs();
}
