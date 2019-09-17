package com.github.narcissujsk.openstackjsk.openstack.storage.block.internal;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.storage.CinderZoneService;
import com.github.narcissujsk.openstackjsk.openstack.storage.block.domain.AvailabilityZone;
import com.github.narcissujsk.openstackjsk.openstack.storage.block.domain.ExtAvailabilityZone.AvailabilityZones;

public class CinderZoneServiceImpl  extends BaseBlockStorageServices implements CinderZoneService
{

    @Override
    public List<? extends AvailabilityZone> list()
    {
        String uri =  "/os-availability-zone";
        return get(AvailabilityZones.class, uri).execute().getList();
    }


}
