package com.github.narcissujsk.openstackjsk.model.identity.v3;

import java.util.Map;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.identity.v3.builder.GroupBuilder;

/**
 * Group model
 *
 * @see <a href="http://developer.openstack.org/api-ref-identity-v3.html#groups-v3">API reference</a>
 */
public interface Group extends ModelEntity, Buildable<GroupBuilder> {

    /**
     * Globally unique within the owning domain.
     * 
     * @return the id of the group
     */
    String getId();

    /**
     * @return the name of the group
     */
    String getName();

    /**
     * @return the description of the group
     */
    String getDescription();

    /**
     * @return the domain id of the group
     */
    String getDomainId();

    /**
     * @return the links of the group
     */
    Map<String, String> getLinks();

}
