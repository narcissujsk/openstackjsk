package com.github.narcissujsk.openstackjsk.model.identity.v3.builder;

import java.util.Map;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.identity.v3.Domain;

/**
 * A Builder which creates a identity v3 domain.
 * 
 * 
 */
public interface DomainBuilder extends Builder<DomainBuilder, Domain> {

    /**
     * @see Domain#getId()
     */
    DomainBuilder id(String id);

    /**
     * @see Domain#getDescription()
     */
    DomainBuilder description(String description);

    /**
     * @see Domain#getName()
     */
    DomainBuilder name(String name);

    /**
     * @see Domain#getLinks()
     */
    DomainBuilder links(Map<String, String> links);

    /**
     * @see Domain#isEnabled()
     */
    DomainBuilder enabled(boolean enabled);

}
