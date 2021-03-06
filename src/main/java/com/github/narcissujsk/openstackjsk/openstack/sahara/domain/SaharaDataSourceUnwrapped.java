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

import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.sahara.DataSource;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

/**
 * An OpenStack Sahara
 * Unwrap the root name of Data Source when serialized into json request 
 * 
 * @author ekasit.kijsipongse@nectec.or.th
 * @author siwat.pru@outlook.com
 */

public class SaharaDataSourceUnwrapped implements ModelEntity {

    private static final long serialVersionUID = 1L;
    
    @JsonUnwrapped
    //@JsonProperty("data_source")
    private DataSource dataSource;

    public SaharaDataSourceUnwrapped(DataSource datasource) {
        this.dataSource = datasource;
    }

    public DataSource getDataSource() { // need for serialization
        return dataSource;
    }
}
