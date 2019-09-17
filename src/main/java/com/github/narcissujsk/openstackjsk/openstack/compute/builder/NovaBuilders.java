package com.github.narcissujsk.openstackjsk.openstack.compute.builder;

import com.github.narcissujsk.openstackjsk.model.compute.builder.*;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.*;

/**
 * The Compute V3 Builders
 */
public class NovaBuilders implements ComputeBuilders {

    private ComputeBuilders NovaBuilders() {
        return this;
    }

    @Override
    public ServerCreateBuilder server() {
        return NovaServerCreate.builder();
    }

    @Override
    public BlockDeviceMappingBuilder blockDeviceMapping() {
        return NovaBlockDeviceMappingCreate.builder();
    }

    @Override
    public FlavorBuilder flavor() {
        return NovaFlavor.builder();
    }

    @Override
    public FloatingIPBuilder floatingIP() {
        return NovaFloatingIP.builder();
    }

    @Override
    public QuotaSetUpdateBuilder quotaSet() {
        return NovaQuotaSetUpdate.builder();
    }
}
