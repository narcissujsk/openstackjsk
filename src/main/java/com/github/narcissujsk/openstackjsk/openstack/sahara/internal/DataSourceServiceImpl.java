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
