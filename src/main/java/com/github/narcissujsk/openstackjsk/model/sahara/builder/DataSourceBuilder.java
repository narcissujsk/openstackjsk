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
package com.github.narcissujsk.openstackjsk.model.sahara.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.sahara.DataSource;

/**
 * Builder interface used for {@link DataSource} object.
 * 
 * @author ekasit.kijsipongse@nectec.or.th
 * @author siwat.pru@outlook.com
 */
public interface DataSourceBuilder extends Builder<DataSourceBuilder, DataSource> {

    /**
     * See {@link DataSource#getDescription()}
     * 
     * @param description the description of the data source
     * @return DataSourceBuilder
     */
    DataSourceBuilder description(String description);

    /**
     * See {@link DataSource#getURL()}
     * 
     * @param url the URL of the data source
     * @return DataSourceBuilder
     */
    DataSourceBuilder url(String url);

    /**
     * See {@link DataSource#getType()}
     * 
     * @param type the type of the data source
     * @return DataSourceBuilder
     */
    DataSourceBuilder type(String type);

    /**
     * See {@link DataSource#getName()}
     * 
     * @param name the name of the data source
     * @return DataSourceBuilder
     */
    DataSourceBuilder name(String name);

    /**
     * See {@link DataSource#getCredentials()}
     * 
     * @param user username of the credentials
     * @param password password of the credentials
     * @return DataSourceBuilder
     */
    DataSourceBuilder credentials(String user, String password);

}
