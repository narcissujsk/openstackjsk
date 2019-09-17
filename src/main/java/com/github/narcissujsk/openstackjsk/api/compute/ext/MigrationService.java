package com.github.narcissujsk.openstackjsk.api.compute.ext;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.compute.ext.Migration;
import com.github.narcissujsk.openstackjsk.model.compute.ext.MigrationsFilter;

/**
 * API which supports the "os-migrations" extension.  
 * 
 * @author Jeremy Unruh
 */
public interface MigrationService extends RestService {

    /**
     * Administrators only. Fetch in-progress migrations for a region or a specified cell in a region.
     * 
     * @return in-progress migrations or empty list
     */
    List<? extends Migration> list();
    
    /**
     * Administrators only. Fetch in-progress migrations for a region or a specified cell in a region with filtering options
     * 
     * @param filter the filter constraints
     * @return in-progress migrations or empty list
     */
    List<? extends Migration> list(MigrationsFilter filter);
}
