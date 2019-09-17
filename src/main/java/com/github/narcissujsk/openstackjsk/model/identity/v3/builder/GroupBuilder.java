package com.github.narcissujsk.openstackjsk.model.identity.v3.builder;

import java.util.Map;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.identity.v3.Group;

/**
 * A Builder which creates a identity v3 group
 * 
 * 
 */
public interface GroupBuilder extends Builder<GroupBuilder, Group> {

    /**
     * @see Group#getId()
     */
    GroupBuilder id(String id);

    /**
     * @see Group#getName()
     */
    GroupBuilder name(String name);

    /**
     * @see Group#getId()
     */
    GroupBuilder description(String description);

    /**
     * @see Group#getDomainId()
     */
    GroupBuilder domainId(String domainId);

    /**
     * @see Group#getLinks()
     */
    GroupBuilder links(Map<String, String> links);

}
