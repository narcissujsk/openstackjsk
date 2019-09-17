package com.github.narcissujsk.openstackjsk.openstack.compute.internal.ext;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.compute.ext.ZoneService;
import com.github.narcissujsk.openstackjsk.model.compute.ext.AvailabilityZone;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.ext.ExtAvailabilityZone.AvailabilityZones;
import com.github.narcissujsk.openstackjsk.openstack.compute.internal.BaseComputeServices;

/**
 * Service implementation for ZoneService API
 */
public class ZoneServiceImpl extends BaseComputeServices implements ZoneService {

    @Override
    public List<? extends AvailabilityZone> list() {
        return list(Boolean.FALSE);
    }

    @Override
    public List<? extends AvailabilityZone> list(boolean detailed) {
        String uri = (detailed) ? "/os-availability-zone/detail" : "/os-availability-zone";
        return get(AvailabilityZones.class, uri).execute().getList();
    }
}
