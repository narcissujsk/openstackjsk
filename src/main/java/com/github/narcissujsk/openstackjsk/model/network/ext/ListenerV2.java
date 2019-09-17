package com.github.narcissujsk.openstackjsk.model.network.ext;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.network.ext.ListenerProtocol;
import com.github.narcissujsk.openstackjsk.model.network.ext.builder.ListenerV2Builder;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.ext.ListItem;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.ext.NeutronListenerV2;

import java.util.List;

/**
 * A listener for v2 loadbalancer
 * @author emjburns
 */
@JsonDeserialize(as = NeutronListenerV2.class)
public interface ListenerV2 extends ModelEntity, Buildable<ListenerV2Builder> {

    /**
     * @return id. The unique ID for the listener.
     */
    String getId();

    /**
     * @return tenantId.
     * Owner of the listener. Only an administrative user can specify a tenant ID other than its own.
     */
    String getTenantId();

    /**
     * @return listener name. Does not have to be unique.
     */
    String getName();

    /**
     * @return Description for the listener.
     */
    String getDescription();

    /**
     * @return The protocol of the listener, which is TCP, HTTP, or HTTPS.
     */
    ListenerProtocol getProtocol();

    /**
     * @return The protocol of the listener.
     */
    Integer getProtocolPort();

    /**
     * @return The connection limit of the listener.
     * -1 indicates an infinite limit.
     */
    Integer getConnectionLimit();

    /**
     * @return The default pool id of the listener.
     */
    String getDefaultPoolId();

    /**
     * @return the default tls container ref
     */
    String getDefaultTlsContainerRef();

    /**
     * @return the sni container refs
     */
    List<String> getSniContainerRefs();

    /**
     * @return The administrative state of the listener, which is up (true) or
     *         down (false).
     */
    boolean isAdminStateUp();

    /**
     * @return The loadbalancers of the listener.
     */
    List<ListItem> getLoadBalancers();
}
