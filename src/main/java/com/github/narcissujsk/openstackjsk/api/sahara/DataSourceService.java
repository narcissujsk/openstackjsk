package com.github.narcissujsk.openstackjsk.api.sahara;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.sahara.DataSource;

/**
 * Sahara Data Processing Operations
 *
 * @author ekasit.kijsipongse@nectec.or.th
 */
public interface DataSourceService extends RestService {

    /**
     * List all data sources
     * 
     * @return list of data sources or empty
     */
     List<? extends DataSource> list();

    /**
     * Get a data source by ID
     * @param datasourceId the data source identifier
     * @return the data source or null if not found
     */
     DataSource get(String datasourceId);

    /**
     * Create a new data source
     *
     * @param datasource the data source to create
     * @return the created data source
     */
     DataSource create(DataSource datasource);

    /**
     * Delete the specified data source 
     * 
     * @param datasourceId the data source identifier
     * @return the action response
     */
     ActionResponse delete(String datasourceId);

}
