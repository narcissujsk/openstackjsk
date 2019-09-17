package com.github.narcissujsk.openstackjsk.openstack.trove.internal;

import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.trove.InstanceFlavorService;
import com.github.narcissujsk.openstackjsk.api.trove.DatabaseService;
import com.github.narcissujsk.openstackjsk.api.trove.DatastoreService;
import com.github.narcissujsk.openstackjsk.api.trove.InstanceService;
import com.github.narcissujsk.openstackjsk.api.trove.TroveService;
import com.github.narcissujsk.openstackjsk.api.trove.UserService;
import com.github.narcissujsk.openstackjsk.openstack.trove.internal.BaseTroveServices;

/**
 * Trove API Implementation
 *
 * @author sumit gandhi
 */
public class TroveServiceImpl extends BaseTroveServices implements TroveService {

    /**
     * {@inheritDoc}
     */
    @Override
    public DatastoreService datastoreService() {
        return Apis.get(DatastoreService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatabaseService databaseService() {
        return Apis.get(DatabaseService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserService databaseUsersService() {
        return Apis.get(UserService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstanceFlavorService flavorService() {
        return Apis.get(InstanceFlavorService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstanceService instanceService() {
        return Apis.get(InstanceService.class);
    }

}
