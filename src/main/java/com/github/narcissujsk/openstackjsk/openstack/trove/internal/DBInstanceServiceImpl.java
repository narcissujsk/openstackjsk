package com.github.narcissujsk.openstackjsk.openstack.trove.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.trove.InstanceService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.trove.Instance;
import com.github.narcissujsk.openstackjsk.model.trove.InstanceCreate;
import com.github.narcissujsk.openstackjsk.openstack.trove.domain.TroveInstance;
import com.github.narcissujsk.openstackjsk.openstack.trove.domain.TroveInstance.DBInstances;
import com.github.narcissujsk.openstackjsk.openstack.trove.internal.BaseTroveServices;

/**
 * InstanceService API Implementation
 *
 * @author Shital Patil
 */
public class DBInstanceServiceImpl extends BaseTroveServices implements InstanceService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Instance> list() {
        return get(DBInstances.class, uri("/instances")).execute().getList();

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Instance get(String instanceId) {
        checkNotNull(instanceId);
        TroveInstance instance = get(TroveInstance.class, uri("/instances/%s", instanceId)).execute();
        return instance;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Instance create(InstanceCreate instanceCreate) {
        return post(TroveInstance.class, uri("/instances")).entity(instanceCreate).execute();

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String id) {
        checkNotNull(id);
        return deleteWithResponse(uri("/instances/%s", id)).execute();
    }
}
