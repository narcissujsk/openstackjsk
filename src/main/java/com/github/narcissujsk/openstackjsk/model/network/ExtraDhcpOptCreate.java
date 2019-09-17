package com.github.narcissujsk.openstackjsk.model.network;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.network.builder.ExtraDhcpOptBuilder;

/**
 *
 * @author Ales Kemr
 */
public interface ExtraDhcpOptCreate extends Buildable<ExtraDhcpOptBuilder> {
    
    String getOptValue();

    String getOptName();
}
