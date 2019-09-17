package com.github.narcissujsk.openstackjsk.api.sahara;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.sahara.ClusterTemplate;

/**
 * Sahara Data Processing Operations
 * 
 * @author Ekasit Kijsipongse
 */
public interface ClusterTemplateService extends RestService {

    /**
     * List all cluster templates
     * 
     * @return list of cluster templates or empty
     */
     List<? extends ClusterTemplate> list();

    /**
     * Get a cluster template by ID
     * @param templateId the template identifier
     * @return the cluster template or null if not found
     */
     ClusterTemplate get(String templateId);

    /**
     * Create a new cluster template
     * 
     * @param template the cluster template to create
     * @return the created cluster template
     */
     ClusterTemplate create(ClusterTemplate template);

    /**
     * Delete the specified cluster template
     * 
     * @param templateId the template identifier
     * @return the action response
     */
     ActionResponse delete(String templateId);

}
