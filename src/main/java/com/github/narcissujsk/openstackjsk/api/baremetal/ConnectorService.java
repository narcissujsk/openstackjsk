package com.github.narcissujsk.openstackjsk.api.baremetal;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.baremetal.Connector;
import com.github.narcissujsk.openstackjsk.model.baremetal.Portgroup;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.openstack.common.OpenstackUpdate;

import java.util.List;
import java.util.Map;


public interface ConnectorService extends RestService {

	List<? extends Connector> list();


    List<? extends Connector> list(Map<String, String> filteringParams);

    Connector get(String uuid);

    Connector create(Connector connector);

    Connector update(String uuid, List<OpenstackUpdate> update);


    ActionResponse delete(String uuid);
}
