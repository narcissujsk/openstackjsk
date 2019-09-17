package com.github.narcissujsk.openstackjsk.model.octavia;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.octavia.ListenerV2;
import com.github.narcissujsk.openstackjsk.model.octavia.builder.ListenerV2UpdateBuilder;

/**
 * An entity used to update an lbaas v2 listener
 * @author wei
 */
public interface ListenerV2Update extends ModelEntity, Buildable<ListenerV2UpdateBuilder> {
    /**
     * Optional
     * @see com.github.narcissujsk.openstackjsk.model.octavia.ListenerV2#isAdminStateUp()
     */
    public boolean isAdminStateUp();

    /**
     * Optional
     * @see com.github.narcissujsk.openstackjsk.model.octavia.ListenerV2#getDescription()
     */
    public String getDescription();

    /**
     * Optional
     * @see com.github.narcissujsk.openstackjsk.model.octavia.ListenerV2#getName()
     */
    public String getName();

    /**
     * Optional
     * @see com.github.narcissujsk.openstackjsk.model.octavia.ListenerV2#getConnectionLimit()
     */
    public Integer getConnectionLimit();

    /**
     * Optional
     * @see ListenerV2#getDefaultTlsContainerRef()
     */
    public String getDefaultTlsContainerRef();
}
