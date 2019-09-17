package com.github.narcissujsk.openstackjsk.openstack.baremetal.internal;

import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.baremetal.BaremetalService;
import com.github.narcissujsk.openstackjsk.api.baremetal.IronicPortService;
import com.github.narcissujsk.openstackjsk.api.baremetal.NodeService;

/**
 * Compute (Nova) Operations API implementation
 * 
 * @author Jeremy Unruh
 */
public class BaremetalServiceImpl extends BaseBaremetalServices implements BaremetalService {


    @Override
    public NodeService nodes() {
        return Apis.get(NodeService.class);
    }

    @Override
    public IronicPortService ports() {
        return Apis.get(IronicPortService.class);
    }


}
