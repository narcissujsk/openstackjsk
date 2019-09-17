package com.github.narcissujsk.openstackjsk.model.sahara;

import java.util.Date;
import java.util.List;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.sahara.JobExecutionAction;

/**
 * An Info of Sahara Job Execution
 * 
 * @author ekasit.kijsipongse@nectec.or.th
 * @author siwat.pru@outlook.com
 */
public interface JobExecutionInfo extends ModelEntity {

    String getStatus();

    String getExternalId();

    int getRun();

    Date getStartTime();

    Date getEndTime();

    String getAppName();

    Date getLastModTime();

    List<? extends JobExecutionAction> getActions();

    String getAcl();

    String getConsoleUrl();

    String getAppPath();

    String getToString();

    String getUser();

    String getConf();

    String getParentId();

    Date getCreatedTime();

    String getGroup();

    String getId();
}
