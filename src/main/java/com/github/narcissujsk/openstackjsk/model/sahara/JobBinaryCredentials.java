package com.github.narcissujsk.openstackjsk.model.sahara;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

/**
 * Credentials for JobBinary
 * 
 * @author ekasit.kijsipongse@nectec.or.th
 * @author siwat.pru@outlook.com
 */
public interface JobBinaryCredentials extends ModelEntity {

    /**
     * @return the username
     */
    String getUser();

    /**
     * @return the password
     */
    String getPassword();

}
