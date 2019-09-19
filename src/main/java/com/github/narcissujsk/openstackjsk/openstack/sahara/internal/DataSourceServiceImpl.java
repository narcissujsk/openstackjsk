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
package com.github.narcissujsk.openstackjsk.openstack.sahara.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.sahara.DataSourceService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.sahara.DataSource;
import com.github.narcissujsk.openstackjsk.openstack.sahara.domain.SaharaDataSource;
import com.github.narcissujsk.openstackjsk.openstack.sahara.domain.SaharaDataSource.DataSources;
import com.github.narcissujsk.openstackjsk.openstack.sahara.domain.SaharaDataSourceUnwrapped;

/**
 * Sahara Data Processing Operations
 * 
 * @author ekasit.kijsipongse@nectec.or.th
 * @author siwat.pru@outlook.com
 */
public class DataSourceServiceImpl extends BaseSaharaServices implements DataSourceService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends DataSource> list() {
        return get(DataSources.class, uri("/data-sources")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataSource get(String datasourceId) {
        checkNotNull(datasourceId);
        return get(SaharaDataSource.class, uri("/data-sources/%s", datasourceId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataSource create(DataSource datasource) {
        checkNotNull(datasource);
        SaharaDataSourceUnwrapped unwrapped = new SaharaDataSourceUnwrapped(datasource);
        return post(SaharaDataSource.class, uri("/data-sources"))
                     .entity(unwrapped)  // setup request
                     .execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String datasourceId) {
        checkNotNull(datasourceId);
        return deleteWithResponse(uri("/data-sources/%s", datasourceId)).execute();
    }

}
