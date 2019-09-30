package com.github.narcissujsk.openstackjsk.api.baremetal;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.baremetal.Connector;
import com.github.narcissujsk.openstackjsk.model.baremetal.Target;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.openstack.common.OpenstackUpdate;

import java.util.List;
import java.util.Map;


public interface TargetService extends RestService {

	List<? extends Target> list();


    List<? extends Target> list(Map<String, String> filteringParams);

    Target get(String uuid);

    Target create(Target target);

    Target update(String uuid, List<OpenstackUpdate> update);


    ActionResponse delete(String uuid);
}
