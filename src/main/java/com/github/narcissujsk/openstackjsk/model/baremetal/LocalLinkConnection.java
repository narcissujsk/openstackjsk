package com.github.narcissujsk.openstackjsk.model.baremetal;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

public interface LocalLinkConnection extends ModelEntity {

    public String getPortId();

    public String getSwitchId();

    public String getSwitchInfo();

}
