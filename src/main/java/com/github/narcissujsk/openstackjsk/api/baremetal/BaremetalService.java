package com.github.narcissujsk.openstackjsk.api.baremetal;

import com.github.narcissujsk.openstackjsk.api.compute.*;
import com.github.narcissujsk.openstackjsk.api.compute.ext.*;
import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.common.Extension;

import java.util.List;


public interface BaremetalService extends RestService {


    NodeService nodes();

    IronicPortService ports();

    IronicPortgroupService portgroups();

    IronicVolumeService volume();


}
