package com.github.narcissujsk.openstackjsk.model.dns.v2.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.dns.v2.Nameserver;

/**
 * A Builder which creates a designate v2 nameserver
 */
public interface NameserverBuilder extends Builder<NameserverBuilder, Nameserver> {

	/**
	 * @see Nameserver#getHostname()
	 */
	NameserverBuilder hostname(String hostname);

	/**
	 * @see Nameserver#getPriority()
	 */
	NameserverBuilder priority(Integer priority);

}
