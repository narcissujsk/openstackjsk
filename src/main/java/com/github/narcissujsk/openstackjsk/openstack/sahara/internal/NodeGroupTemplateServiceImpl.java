package com.github.narcissujsk.openstackjsk.openstack.sahara.internal;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.sahara.NodeGroupTemplateService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.sahara.NodeGroupTemplate;
import com.github.narcissujsk.openstackjsk.openstack.sahara.domain.SaharaNodeGroupTemplate;
import com.github.narcissujsk.openstackjsk.openstack.sahara.domain.SaharaNodeGroupTemplateUnwrapped;
import com.github.narcissujsk.openstackjsk.openstack.sahara.domain.SaharaNodeGroupTemplate.NodeGroupTemplates;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Sahara Data Processing Operations
 * 
 * @author Ekasit Kijsipongse
 */
public class NodeGroupTemplateServiceImpl extends BaseSaharaServices implements NodeGroupTemplateService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends NodeGroupTemplate> list() {
        return get(NodeGroupTemplates.class, uri("/node-group-templates")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeGroupTemplate get(String templateId) {
        checkNotNull(templateId);
        return get(SaharaNodeGroupTemplate.class, uri("/node-group-templates/%s", templateId)).execute();
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public NodeGroupTemplate create(NodeGroupTemplate template) {
        checkNotNull(template);
        SaharaNodeGroupTemplateUnwrapped unwrapped = new SaharaNodeGroupTemplateUnwrapped(template);  
        return post(SaharaNodeGroupTemplate.class, uri("/node-group-templates"))
                     .entity(unwrapped)  // setup request
                     .execute();
       
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String templateId) {
        checkNotNull(templateId);
        return deleteWithResponse(uri("/node-group-templates/%s", templateId)).execute();
    }

}
