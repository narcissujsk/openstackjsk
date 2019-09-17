package com.github.narcissujsk.openstackjsk.model.network.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.network.ExtraDhcpOptCreate;

/**
 *
 * @author Ales Kemr
 */
public interface ExtraDhcpOptBuilder extends Builder<ExtraDhcpOptBuilder, ExtraDhcpOptCreate> {

	ExtraDhcpOptBuilder optValue(String optValue);

	ExtraDhcpOptBuilder optName(String optName);

}
