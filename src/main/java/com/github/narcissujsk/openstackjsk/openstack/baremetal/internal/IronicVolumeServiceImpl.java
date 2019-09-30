package com.github.narcissujsk.openstackjsk.openstack.baremetal.internal;

import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.baremetal.ConnectorService;
import com.github.narcissujsk.openstackjsk.api.baremetal.IronicVolumeService;
import com.github.narcissujsk.openstackjsk.api.baremetal.TargetService;

/**
 * @program: openstackjsk
 * @description:
 * @author: jiangsk@inspur.com
 * @create: 2019-09-30 15:38
 **/
public class IronicVolumeServiceImpl implements IronicVolumeService{
    @Override
    public ConnectorService connectors() {
        return Apis.get(ConnectorService.class);
    }

    @Override
    public TargetService targets() {
        return Apis.get(TargetService.class);
    }
}
