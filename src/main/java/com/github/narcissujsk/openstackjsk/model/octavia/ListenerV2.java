package com.github.narcissujsk.openstackjsk.model.octavia;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.octavia.ListenerProtocol;
import com.github.narcissujsk.openstackjsk.model.octavia.builder.ListenerV2Builder;
import com.github.narcissujsk.openstackjsk.openstack.octavia.domain.ListItem;
import com.github.narcissujsk.openstackjsk.openstack.octavia.domain.OctaviaListenerV2;

import java.util.List;

/**
 * A listener for v2 loadbalancer
 * @author wei
 */
@JsonDeserialize(as = OctaviaListenerV2.class)
public interface ListenerV2 extends ModelEntity, Buildable<ListenerV2Builder> {

    /**
     * @return id. The unique ID for the listener.
     */
    String getId();

    /**
     * @return the ID of the project/tenant that owns the resource
     */
    String getProjectId();

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
