package com.github.narcissujsk.openstackjsk.openstack.sahara.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.sahara.SaharaPluginService;
import com.github.narcissujsk.openstackjsk.core.transport.ExecutionOptions;
import com.github.narcissujsk.openstackjsk.core.transport.propagation.PropagateOnStatus;
import com.github.narcissujsk.openstackjsk.model.common.Payload;
import com.github.narcissujsk.openstackjsk.model.sahara.ClusterTemplate;
import com.github.narcissujsk.openstackjsk.model.sahara.Plugin;
import com.github.narcissujsk.openstackjsk.openstack.sahara.domain.SaharaClusterTemplate;
import com.github.narcissujsk.openstackjsk.openstack.sahara.domain.SaharaPlugin;
import com.github.narcissujsk.openstackjsk.openstack.sahara.domain.SaharaPlugin.SaharaPlugins;

/**
 * Sahara Data Processing Operations
 * 
 * @author ekasit.kijsipongse@nectec.or.th
 */
public class SaharaPluginServiceImpl extends BaseSaharaServices implements SaharaPluginService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Plugin> list() {
        return get(SaharaPlugins.class, uri("/plugins")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Plugin get(String name) {
        checkNotNull(name);
        return get(SaharaPlugin.class, uri("/plugins/%s", name)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Plugin get(String name, String version) {
        checkNotNull(name);
        checkNotNull(version);
        return get(SaharaPlugin.class, uri("/plugins/%s/%s", name, version)).execute();
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterTemplate convertConfig(String name, String version, String templateName, Payload<?> payload) {
        checkNotNull(name);
        checkNotNull(version);
        checkNotNull(templateName);
        return post(SaharaClusterTemplate.class, uri("/plugins/%s/%s/convert-config/%s", name, version, templateName)).entity(payload)  // setup request
                     .execute(ExecutionOptions.<SaharaClusterTemplate>create(PropagateOnStatus.on(404))); // Use respongse progagation for "Not found" status to throw exception instead of return null


    }

}
