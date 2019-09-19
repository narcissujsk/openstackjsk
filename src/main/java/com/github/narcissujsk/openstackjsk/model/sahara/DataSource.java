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
package com.github.narcissujsk.openstackjsk.model.sahara;

import java.util.Date;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.sahara.DataSourceCredentials;
import com.github.narcissujsk.openstackjsk.model.sahara.builder.DataSourceBuilder;

/**
 * An OpenStack Data Source
 * 
 * @author ekasit.kijsipongse@nectec.or.th
 * @author siwat.pru@outlook.com
 */
public interface DataSource extends ModelEntity, Buildable<DataSourceBuilder> {

    /**
     * @return the description of the data source
     */
    String getDescription();

    /**
     * @return the URL of the data source
     */
    String getURL();

    /**
     * @return the tenant id of the data source
     */
    String getTenantId();

    /**
     * @return the created date of the data source
     */
    Date getCreatedAt();

    /**
     * @return the updated date of the data source
     */
    Date getUpdatedAt();

    /**
     * @return the type of the data source
     */
    String getType();

    /**
     * @return the identifier of the data source
     */
    String getId();

    /**
     * @return the name of the data source
     */
    String getName();

    /**
     * @return the credentials of the data source
     */
    DataSourceCredentials getCredentials();
}
