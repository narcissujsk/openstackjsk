package com.github.narcissujsk.openstackjsk.api.baremetal;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.artifact.ArtifactUpdate;
import com.github.narcissujsk.openstackjsk.model.baremetal.Port;
import com.github.narcissujsk.openstackjsk.model.baremetal.Portgroup;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;

import java.util.List;


public interface IronicPortgroupService extends RestService {

	List<? extends Portgroup> list();
	List<? extends Portgroup> list(boolean detail);

    Portgroup get(String uuid);

    Portgroup create(Portgroup portgroup);

    Portgroup update(String portgroupId, List<ArtifactUpdate> update);


    ActionResponse delete(String uuid);
}
