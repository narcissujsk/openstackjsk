package com.github.narcissujsk.openstackjsk.api.baremetal;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.baremetal.*;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.openstack.common.OpenstackUpdate;

import java.util.List;


public interface IronicPortService extends RestService {

	List<? extends Port> list();
	List<? extends Port> list(boolean detail);

	Port get(String uuid);

	Port create(Port port);

    Port update(String portid, List<OpenstackUpdate> update);


    ActionResponse delete(String uuid);
}
