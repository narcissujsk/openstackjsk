package com.github.narcissujsk.openstackjsk.api.sahara;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.sahara.NodeGroupTemplate;

/**
 * Sahara Data Processing Operations
 * 
 * @author Ekasit Kijsipongse
 */
public interface NodeGroupTemplateService extends RestService {

    /**
     * List all node group templates
     * 
     * @return list of node group templates or empty
     */
     List<? extends NodeGroupTemplate> list();

    /**
     * Get a node group template by ID
     * @param templateId the template identifier
     * @return the node group template or null if not found
     */
     NodeGroupTemplate get(String templateId);

    /**
     * Create a new node group template
     * 
     * @param template the node group template to create
     * @return the created node group template
     */
     NodeGroupTemplate create(NodeGroupTemplate template);

    /**
     * Delete the specified node group template
     * 
     * @param templateId the template identifier
     * @return the action response
     */
     ActionResponse delete(String templateId);

}
