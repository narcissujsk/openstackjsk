package com.github.narcissujsk.openstackjsk.api.baremetal;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.artifact.ArtifactUpdate;
import com.github.narcissujsk.openstackjsk.model.baremetal.*;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;

import java.util.List;


public interface IronicPortService extends RestService {

	List<? extends Port> list();
	List<? extends Port> list(boolean detail);

	Port get(String uuid);

	Port create(Port port);

    Port update(String portid, List<ArtifactUpdate> update);


    ActionResponse delete(String uuid);
}
